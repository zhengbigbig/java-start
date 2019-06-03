package com.company;

public class Human {
    //静态变量
    private static int number = 0;
    //成员变量，默认private，用函数来操作它的可读可写get set，不暴露出去
    private String name;
    private int height;
    //final 成员变量必须在声明时候初始化，否则就需要在构造方法里初始化
    private final int weight = 120;
    // 目的是初始化对象
    //构造方法1   默认返回这个类  初始化
    public Human() {
        //当前对象
        this.name = "default";
        this.height = 175;
        Human.number += 1; //as number +=1
    }

    //构造方法2
    public Human(String name, int height) {
        this.name = name;
        this.height = height;
        Human.number += 1;
    }

    //实例方法
    public void rename(String newName) {
        name = newName; // => this.name = newName; 没有歧义时 俩者等价
    }

    public int workout() {
        height = height - 5;
        return height;
    }

    public String getName() {
        return name;
    }
    //使用get set来控制变量权限
    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //静态方法
    public static int getNumber() {
        return number;
    }
    //只读，因为没有setter方法
    public int getNumber(int number) {
        return number;
    }

}
