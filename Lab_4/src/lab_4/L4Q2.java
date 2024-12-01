package lab_4;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        
        System.out.print("Eneter an integer (N): ");
        int N = sc.nextInt();
        
        for(int i=0;i<=N;i++){
            sum +=i;
        }
        
        System.out.println("The sum for the following series from [N]: "+sum);
        
        sc.close();
    }
}
