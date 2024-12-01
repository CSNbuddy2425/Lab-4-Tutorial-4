package lab_4;

import java.util.Random;

public class L4Q5_Methode1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int player1;
        int player2;
        int dice1, dice2;
        int count1=0, count2=0;
        
        //count for player 1 make how many rolls
        System.out.println("Player 1:");
        for(player1=0;player1<=100;count1++){
            dice1 = rd.nextInt(6)+1;
            player1 += dice1;
            
            //if the points is 6, count+1-1=0, don't count
            if(dice1==6){
                dice1 = rd.nextInt(6)+1;
                player1 += dice1;
                count1--;
            }
            System.out.print(dice1+",");
        }
            System.out.println("\nPlayer 1: "+player1);
            
        System.out.println();
        //count for player 2 make how many rolls
        System.out.println("Player 2:");   
        for(player2=0;player2<=100;count2++){
            dice2 = rd.nextInt(6)+1;
            player2 += dice2;
            
            //if the points is 6, count+1-1=0, don't count
            if(dice2==6){
                dice2 = rd.nextInt(6)+1;
                player2 += dice2;
                count2--;
            }
            System.out.print(dice2+",");
        }
            System.out.println("\nPlayer 2: "+player2+"\n");
            
            if(count1<count2){
                System.out.println("Player 1 win");
            }else if(count2<count1){
                System.out.println("Player 2 win");
            }else{
                System.out.println("It's a draw");
            }
    }
}
