package com.recursion;

public class sudoku_solver {
    public static void main(String[] args){
        int[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        if(!solver(board,0)){
            System.out.println("Cannot be solved");
        }
    }
    static boolean solver(int[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return true;
        }
        int r = -1;
        int c = -1;

        for(int i=row;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==0){
                    r = i;
                    c = j;
                    break;
                }
            }
            if(r!=-1){
                break;
            }
        }
        boolean ans = false;
        for(int i=1;i<=9;i++){
            if(isSafe(board,r,c,i)){
              board[r][c] = i;
              if(c== board.length-1){
                  ans = solver(board, r+1);
              }
              else{
                  ans = solver(board, r);
              }
            }
            if(ans){
                return true;
            }
        }
        board[r][c] =0;
        return ans;
    }

    private static void display(int[][] board) {
        for(int i=0;i<18;i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int[] ints : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(ints[j] +"|");
            }
            System.out.println();
            for(int i=0;i<18;i++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] board, int r, int c, int target) {
        for (int[] ints : board) {
            if (ints[c] == target) {
                return false;
            }
        }
        for(int j=0;j< board.length;j++) {
            if (board[r][j] == target) {
                return false;
            }
        }
            int sqt = (int) Math.sqrt(board.length);
            int tr = r - r % sqt;
            int tc = c - c % sqt;

            for(int i = tr;i<tr+sqt;i++){
                for(int j = tc;j<tc+sqt;j++){
                    if(board[i][j] == target) return false;
                }
            }
        return true;
    }
}
