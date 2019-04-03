package com.theima1;

public class Mouse implements Usb{
    @Override
    public void powerOn() {
        System.out.println("鼠标打开");
    }

    @Override
    public void powerOff() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
