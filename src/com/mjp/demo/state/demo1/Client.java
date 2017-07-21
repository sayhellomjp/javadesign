package com.mjp.demo.state.demo1;

/**
 * Created by HAHAHA on 2017/7/21.
 */
public class Client {

    public static void main(String[] args) {
        Work work = new Work();
        work.doJob();

        work.setHour(11);
        work.doJob();

        work.setHour(12);
        work.doJob();

        work.setHour(13);
        work.doJob();

        work.setHour(14);
        work.doJob();

        work.setHour(16);
        work.doJob();

        work.setFinishWork(true);
        work.setHour(18);
        work.doJob();

        work.setHour(19);
        work.doJob();

        work.setHour(20);
        work.doJob();

        work.setHour(22);
        work.doJob();
    }

}
