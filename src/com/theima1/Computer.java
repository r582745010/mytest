package com.theima1;

public class Computer {
    public void open(){
        System.out.println("电脑开机");
    }
    public void colse(){
        System.out.println("电脑关机");
    }
    public void other(Usb usb){
            usb.powerOn();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
//            usb.powerOn();
            mouse.click();
//            usb.powerOff();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;
//            usb.powerOn();
            keyboard.shuRu();
//            usb.powerOff();
        }
        usb.powerOff();
    }
}
