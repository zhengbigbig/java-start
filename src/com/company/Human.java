package com.company;

public class Human {
    //静态变量
    static int number = 0;
    //成员变量
    public String name;
    public int height;

    // 目的是初始化对象
    //构造方法1   默认返回这个类  初始化
    public Human() {
        //当前对象
        this.name = "default";
        this.height = 175;
    }

    //构造方法2
    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void rename(String newName) {
        name = newName; // => this.name = newName; 没有歧义时 俩者等价
    }

    public int workout() {
        height = height - 5;
        return height;
    }
}
