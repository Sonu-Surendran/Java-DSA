package com.oop.interfacePhoneProject;

import java.util.Scanner;

public class LandLine implements Phone {
   final private String number;
    private boolean isRinging;

    LandLine(String number){
        this.number = number;
    }


    @Override
    public void powerOn() {
        System.out.println("The landline phone is always on");
    }

    @Override
    public void dail(String num) {
        System.out.println("Dailing the Number "+num+" Connecting call");
    }

    @Override
    public void ans() {
        if(isRinging){
            isRinging=false;
            System.out.println("The phone has begin answered");
        }
        else{
            System.out.println("The phone is not ringing");
        }
    }

    @Override
    public boolean inComing(String num) {
        if(this.number.equals(num)){
            isRinging = true;
            System.out.println("Incoming call");
        }
        else{
            System.out.println("Wrong number could not connect");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
