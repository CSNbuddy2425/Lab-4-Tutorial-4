package lab_4;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        System.out.print("The first [n] prime number: ");
        int num = rd.nextInt(101);
        System.out.println(num);
        
        System.out.println("\nPrime number: ");
        for(int i=1;i<=num;i++){
            if(i==2||i==3||i==5||i==7){
                System.out.print(i+", ");
            }else if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                System.out.print(i+", ");
            }
        }
    }
}
