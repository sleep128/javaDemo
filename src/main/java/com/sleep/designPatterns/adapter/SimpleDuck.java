package com.sleep.designPatterns.adapter;

/**
 * 被适配对象实现
 * @author zy
 */
public class SimpleDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("simpleDuck quack");
    }

    @Override
    public void fly() {
        System.out.println("simpleDuck fly");
    }
}
