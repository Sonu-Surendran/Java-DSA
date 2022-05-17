package com.oop.interfacePhoneProject;

import com.oop.abstractMethod.Parent;

public class Mobile implements Phone{
   final private String number;
    private boolean isRinging;
    private boolean isOn;

    Mobile(String number){
        this.number = number;

    }

    void turnOn(boolean val){
        isOn = val;
    }


    @Override
    public void powerOn() {
        if(isOn) {
            System.out.println("The phone is on");
        }
        else{
            System.out.println("The phone is off");
        }
    }

    @Override
    public void dail(String num) {
        if(isOn) {
            System.out.println("Dailing the Number " + num + " Connecting call");
        }
        else{
            System.out.println("The phone is off Turn on to dail");
        }
    }

    @Override
    public void ans() {
        if(isRinging && isOn){
            isRinging=false;
            System.out.println("The phone has begin answered");
        }
        else{
            if(isOn){
                System.out.println("The phone is not ringing");
            }
            else{
                System.out.println("The phone is switched off");
            }
        }
    }

    @Override
    public boolean inComing(String num) {
        if(this.number.equals(num) && isOn) {
            isRinging = true;
            System.out.println("Incoming call");
        }
        else{
            if(isOn) {
                System.out.println("Wrong number could not connect");
            }
            else{
                System.out.println("The phone is switched off");
            }
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
