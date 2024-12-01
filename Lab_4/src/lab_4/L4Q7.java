package lab_4;

import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        
        System.out.print("Enter total number of month: ");
        int N = sc.nextInt();
        
        System.out.printf("%s%22s%15s%15s%20s%20s%n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Intrest");
        double M = (P*(i/(12*100))/(1-Math.pow(((1+(i/(12*100)))), -N)));
        double total_L = 0;
        
        for(int n=1;n<=N;n++){
            double C = M*Math.pow((1+(i/(12*100))), -(1+N-n));
            double L = M-C;
            double R = L/(i/(12*100))-C;
            total_L += L;
            System.out.printf("%-20d",n);
            System.out.printf("%.2f",M);
            System.out.printf("%16.2f",C);
            System.out.printf("%15.2f",L);
            if(R<0.01){
                R = 0.00;
                System.out.printf("%20.2f",R);
            }else{
                System.out.printf("%20.2f",R);
            }
            System.out.printf("%20.2f",total_L);
            System.out.println();
        }
    }
}
