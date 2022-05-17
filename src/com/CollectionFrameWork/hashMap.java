package com.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args){
        HashMap<Integer,String> m = new HashMap<>();
        m.put(121,"Johny");
        m.put(122,"Joey");
        m.put(123,"Naruto");
        m.put(124,"Gojo");
        m.put(125,"Yami");
        m.put(126,"Yorouchi");
        m.put(127,"Marry");

        System.out.println(m.isEmpty());

        HashMap<Integer,String> m2 = new HashMap<>();
        m2.putAll(m);
        for(Map.Entry e : m.entrySet()){
            e.setValue("sdflkjdljf");
        }
        System.out.println(m.values());
    }
}
