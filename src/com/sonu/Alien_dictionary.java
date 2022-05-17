package com.sonu;

public class Alien_dictionary {
    public static void main(String[] args){
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        boolean res = isAlienSorted(words,order);
        System.out.println(res);
    }
    public static boolean isAlienSorted(String[] words, String order) {
        char[] ord = new char[26];
        for(int i=0;i<26;i++){
            ord[i] = order.charAt(i);
        }
        for(int j=0;j<words.length-1;j++){
            String word = words[j];
            String word2 = words[j+1];

            for(int k=0;k<word.length();k++){
                char firstc = word.charAt(k);
                char sec = word2.charAt(k);

                if(firstc != sec){
                    int orderOfword = findindex(ord,firstc);
                    int orderOfword2 = findindex(ord,sec);
                    if(orderOfword>orderOfword2) return false;
                    break;
                }
            }
        }
        return true;
    }
    public static int findindex(char[] s,char c){
        int index = 0;
        for(int i=0;i<26;i++){
            if(s[i]==c){
                index = i;
                break;
            }
        }
        return index;
    }
}
