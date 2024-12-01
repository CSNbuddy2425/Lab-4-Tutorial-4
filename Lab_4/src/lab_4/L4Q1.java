package lab_4;

import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        
        System.out.print("The factors are: 1");
        
        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.print(", "+i);
            }
        }
        sc.close();
    }
}
