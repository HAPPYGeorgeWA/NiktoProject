package com.hg.Starsline;
import java.util.Scanner;

public class Starsline4 {


    /**
     * @param args
     */
    public static void main(
            String[] args) {
// TODO 自動生成的方法存根
        int length;//儲存菱形的邊長的變數
        Scanner sc =new Scanner(System.in);//輸入資料的掃描物件
        System.out.println("請輸入菱形的邊長:");
        String s = sc.next();
        length=Integer.parseInt(s);//獲取輸入的邊長數值
        /*列印菱形的上半部分三角形 行數為length行*/
        for (int i=1; i<=length;i++) {//需要列印的行數
            for(int j=1;j<=length-i;j++){//列印左邊空白的區域,隨行遞減1
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){//打三角形的區域
                if(k==1||k==2*i-1){//空心的獲取 除每行第一個以及最後一個 外其餘為空白
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*列印菱形的下半部分三角形  中間行公用 故行數為length-1*/
        for (int i = length-1;i>0;i--){
            for(int j=1;j<=length-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==1||k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }}







