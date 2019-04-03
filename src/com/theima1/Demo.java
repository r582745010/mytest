package com.theima1;
/*第二题：分析以下需求，并用代码实现
        进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘

        2.定义笔记本类:
        开机功能
        关机功能
        定义使用USB设备的功能
        要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能

        3.定义鼠标类:
        要符合USB接口

        4.定义键盘类:
        要符合USB接口

        5.定义测试类:
        创建电脑对象,依次调用开机方法,使用USB设备, 关机方法

        打印效果如下:
        开机
        连接鼠标的USB
        断开鼠标的USB
        连接键盘的USB
        断开键盘的USB
        关机*/
public class Demo {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.open();
       Mouse mouse=new Mouse();
       Keyboard keyboard=new Keyboard();

        computer.other(mouse);
        computer.other(keyboard);


        computer.colse();
    }
}
