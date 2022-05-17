package com.sonu;

import java.util.Stack;

public class score_of_parentheses {
    public static void main(String[] args){
      String s = "(()(()))";
      int res = scoreOfParentheses(s);
      System.out.println(res);
    }
    static int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int val = 0;

        char[] ch = s.toCharArray();
        for(char ele : ch){
            if(ele == '('){
                st.push(-1);
            }
            else {
                if(st.peek() == -1){
                    st.pop();
                    st.push(1);
                }
                else{
                    val = 0;
                    while(st.peek() != -1){
                        val += st.pop();
                    }
                    st.pop();
                    st.push(val*2);
                }
            }
        }
        val = 0;
        while(st.size() > 0){
            val += st.pop();
        }
        return val;
    }
}
