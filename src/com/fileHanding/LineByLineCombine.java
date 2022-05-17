package com.fileHanding;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class LineByLineCombine {
    public static void main(String[] args)throws Exception{
        PrintWriter pw = new PrintWriter("combine2.txt");
        BufferedReader bf1 = new BufferedReader(new FileReader("doc1.txt"));
        BufferedReader bf2 = new BufferedReader(new FileReader("doc1 - Copy.txt"));
        String line = bf1.readLine();
        String line2 = bf2.readLine();
        while(line!=null && line2!=null){
            pw.print(line+" ");
            pw.println(line2);
            line = bf1.readLine();
            line2 = bf2.readLine();
        }
        while(line!=null){
            pw.println(line);
            line = bf1.readLine();
        }

        while(line2!=null){
            pw.println(line2);
            line2 = bf2.readLine();
        }

        pw.flush();
        bf1.close();
        bf2.close();
        pw.close();
    }
}
