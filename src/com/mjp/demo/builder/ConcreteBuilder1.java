package com.mjp.demo.builder;

/**
 * 具体的建造者对象
 */
public class ConcreteBuilder1  implements Builder{

    private Product product;

    public ConcreteBuilder1() {
        this.product = new Product();
    }

    /**
     * 产品零件建造方法1
     */
    @Override
    public void buildPart1() {
        this.product.setPart1("part1");
    }

    /**
     * 产品零件建造方法2
     */
    @Override
    public void buildPart2() {
        this.product.setPart2("part2");
    }

    /**
     * 产品返还方法
     */
    @Override
    public Product getResult() {
        return this.product;
    }
}
