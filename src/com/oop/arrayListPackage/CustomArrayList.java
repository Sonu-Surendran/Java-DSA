package com.oop.arrayListPackage;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] arr;
    private int DEAFULT_SIZE = 2;
    private int index=0;

    CustomArrayList(){
        arr = new Object[DEAFULT_SIZE];
    }


    T get(int index){
        return (T)(arr[index]);
    }

    void add(T num){
        if(isSafe()){
            resize();
        }
        arr[this.index]=num;
        this.index++;
    }

    int size(){
        return index;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", DEAFULT_SIZE=" + DEAFULT_SIZE +
                ", index=" + index +
                '}';
    }

    private void resize() {
        DEAFULT_SIZE *= 2;
        Object[] temp = new Object[DEAFULT_SIZE];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isSafe(){
        if(index == DEAFULT_SIZE){
            return true;
        }
        return false;
    }
}
