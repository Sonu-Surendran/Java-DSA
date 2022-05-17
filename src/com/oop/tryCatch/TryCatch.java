package com.oop.tryCatch;

public class TryCatch {
    public static void main(String[] args) throws CloneNotSupportedException{
//        int a=10;
//        int b=0;
//        try{
//            int c = divide(a,b);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Final block is executed");
//        }
        People sree = new People(21,"OsanRaj",new int[]{21,4,32,12,2,5});
        People twin = (People)(sree.clone());


    }

//    static int divide (int a,int b){
//        if(b==0){
//            throw new ArithmeticException("Cant divide by Zero");
//        }
//        return a/b;
//    }
}
