package lab_4;

import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int count=0;
        
        System.out.println("Generated number: ");
        
        /*
         *Math.abs(),can turn all the value in positive
         *Integer.MAX_VALUE can turn the range below overflow which is 2147483648, if adding one it will be negative number
         *In this case we can just use Intger.MAX_VALUE but you can use both also
         */
        int num = rd.nextInt(Math.abs(Integer.MAX_VALUE));
        System.out.println(num);
        
        System.out.println("The digit in the integer:");
        do{
            num = num/10;
            count++;
        }while(num>0);
        System.out.println("The number of digits in the integer: "+count);
    }
}
