package com.fileHanding;

import java.io.*;

public class CombiningToFiles {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("combine.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("doc1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("doc1 - Copy.txt"));
        String line = br1.readLine();
        while(line!=null){
            pw.println(line);
            System.out.println(line);
            line = br1.readLine();
        }
        line = br2.readLine();
        while(line!=null){
            pw.println(line);
            System.out.println(line);
            line=br2.readLine();
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
    }
}
