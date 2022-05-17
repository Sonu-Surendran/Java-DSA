package com.linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        LL li = new LL();
        li.insertFirst(23);
        li.insertFirst(35);
        li.insertFirst(12);
        li.insertFirst(27);
        li.insertFirst(10);

        li.display();

        li.RInsert(2,45);

        li.display();

    }
}
