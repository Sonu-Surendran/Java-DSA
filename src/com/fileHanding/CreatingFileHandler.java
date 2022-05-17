package com.fileHanding;

import java.io.File;
import java.util.Arrays;


public class CreatingFileHandler {
    public static void main(String[] args)throws Exception{
        int Dcount=0,Fcount=0;
        File fh = new File("C:\\xampp");
        String[] lis= fh.list();
        for(String s:lis){
            File f = new File(fh,s);
            if(f.isDirectory()){
                Dcount+=1;
            }
            if(f.isFile()){
                Fcount++;
            }
        }
        System.out.println("Total Number of Directories in the File Object "+Dcount);
        System.out.println("Total number of files in the File Object "+Fcount);
        long l = fh.length();
        System.out.println(l);
    }
}
