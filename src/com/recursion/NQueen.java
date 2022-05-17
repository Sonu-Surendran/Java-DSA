package com.recursion;

public class NQueen {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(PlaceMents(board,0));
    }
    static int PlaceMents(boolean[][] board,int row){
        if(row == board.length){
            Display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col=0;col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+=PlaceMents(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = row;i>=0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
            int r = row;
            int c = col;
            while(r>=0 && c<=board.length-1){
                if(board[r][c]) return false;
                c++;
                r--;
            }
             r = row;
             c = col;
            while(r>=0 && c>=0){
                if(board[r][c])return false;
                c--;
                r--;
            }
        return true;
    }

    private static void Display(boolean[][] board) {
          for(boolean[] arr:board){
              for(boolean ele: arr){
                  if(ele){
                      System.out.print("Q");
                  }
                  else{
                      System.out.print("X");
                  }
              }
              System.out.println();
          }
    }
}
