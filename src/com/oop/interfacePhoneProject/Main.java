package com.oop.interfacePhoneProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Phone myLand = new LandLine("123456");
        myLand.powerOn();
//        String inNum = in.next();
        myLand.inComing("123456");
        Phone myMoblile = new Mobile("123456");
        myMoblile.inComing("123456");
        Mobile myPhone = new Mobile("123456");
        myPhone.turnOn(true);
        myPhone.inComing("123456");
        myPhone.ans();
        myPhone.inComing("34343434");
        myPhone.ans();
    }
}
