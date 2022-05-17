package com.recursion;

import java.util.Arrays;

public class maze2 {
    public static void main(String[] args){
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] ans = new int[board.length][board[0].length];
        allmazePrint("",board,0,0,ans,1);
    }
    static void allmazePrint(String p,boolean[][] maze,int row,int col,int[][] ans,int step){
        if(row==maze.length-1 && col==maze[0].length-1){
            ans[row][col] = step;
            for(int[] arr:ans){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        ans[row][col] = step;
        if(row<maze.length-1){
            allmazePrint(p+'D',maze,row+1,col,ans,step+1);
        }

        if(col<maze[0].length-1){
            allmazePrint(p+'R',maze,row,col+1,ans,step+1);
        }

        if(row>0){
            allmazePrint(p+'U',maze,row-1,col,ans,step+1);
        }

        if(col>0){
            allmazePrint(p+'L',maze,row,col-1,ans,step+1);
        }

        maze[row][col]=true;
        ans[row][col]=0;

    }
}
