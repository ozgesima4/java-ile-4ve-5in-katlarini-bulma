
package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int sayi;
        System.out.println("sayi :");
        sayi=input.nextInt();
        
        for(int i=1;i<=sayi;i*=4){
            System.out.println("4^:"+i);  
        }
        for(int j=1;j<=sayi;j*=5){
            System.out.println("5^:"+j);
        }
    }
    
}
