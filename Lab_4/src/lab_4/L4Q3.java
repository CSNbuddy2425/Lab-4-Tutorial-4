package lab_4;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Avoid overflow to use function, but can change 'Integer.MIN_VALUE' to 0 since negative number will terminate the loop
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int N = 0;
        double sum = 0;
        double sum2 = 0;
        
        for(int i=0;i>=0;i++){
            
            System.out.print("Enter a score [negative score to quit]: ");
            int score = sc.nextInt();
            
            if(score>0){
                
                if(score > max){
                    max = score;
                }
                
                //Invert if but not use else if, to avoid error from checking the first condition
                if(score<min){
                    min = score;
                }
                //add when the condition fullfill
                N++;
            }else{
                break;
            }
            
            sum += score;
            sum2 += Math.pow(score, 2);
        }
        
        //Equation for Average and Standard Deviation
        double avg = sum/N;
        double s = Math.sqrt((sum2-(sum*sum)/N)/N-1);
        
        System.out.printf("\nSum of the Score: %.2f\n",sum);
        System.out.printf("Minimum Score: %.2f\n",min);
        System.out.printf("Maximum Score: %.2f\n",max);
        System.out.printf("Average Score: %.2f\n",avg);
        //based on formula the output will be this, output for question sheet is for sample
        System.out.printf("Standard Deviation: %.2f\n",s);
        
        sc.close();
    }
}
