package com.recursion;

import java.util.List;
import java.util.ArrayList;

public class maze1 {
    public static void main(String[] args){
        //System.out.println(count("",1,1));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(countobs("",0,board,0));
    }

    static List<String> count(String p,int r,int c){
        if(r==3 || c==3 ){
            while(r<3){
                p += 'H';
                r++;
            }
            while(c<3){
                p+='V';
                c++;
            }
           List<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        List<String> ans = new ArrayList<>();
        ans.addAll(count(p+'D',r+1,c+1));
        ans.addAll(count(p+'H',r+1,c));
        ans.addAll(count(p+'V',r,c+1));
        return ans;
    }

    static List<String> countobs(String p,int r,boolean[][] maze,int c){
        if(r== maze.length-1 || c==maze[0].length-1 ){
            while(r< maze.length-1){
                p += 'H';
                r++;
            }
            while(c<maze[0].length-1){
                p+='V';
                c++;
            }
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(!maze[r][c]){
            List<String> empty = new ArrayList<>();
            return empty;
        }
        ans.addAll(countobs(p+'H',r+1,maze,c));
        ans.addAll(countobs(p+'V',r,maze,c+1));
        return ans;
    }
}
