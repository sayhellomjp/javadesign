package com.mjp.demo.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点，实现了Component接口，除了实现接口方法外，还有自己的管理子节点的方法
 */
public class Composite implements Component {

    //节点名称
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    //子节点
    private List<Component> childList = new ArrayList<Component>();

    //添加节点
    public void addChild(Component child) {
        childList.add(child);
    }

    //删除节点
    public void removeChild(int index) {
        childList.remove(index);
    }

    @Override
    public void showName(String parentName) {
        System.out.println(parentName + "-" + name);
        if(this.childList != null && this.childList.size() > 0){
            for(Component component: this.childList){
                component.showName(parentName + "-" + name);
            }
        }
    }
}
