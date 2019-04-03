package com.theima1;

public class Keyboard implements Usb{
    @Override
    public void powerOn() {
        System.out.println("键盘打开");
    }

    @Override
    public void powerOff() {
        System.out.println("键盘关闭");
    }
    public void shuRu(){
        System.out.println("键盘输入");
    }
}
