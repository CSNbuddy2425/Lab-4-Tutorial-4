package lab_4;

import java.util.Random;

public class L4Q5_Methode2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int player1 = 0;
        int player2 = 0;
        
            for(int i=0;i<=100;i++){
            
            //roll new dice
            int dice1 = rd.nextInt(6)+1;
            int dice2 = rd.nextInt(6)+1;
            
            //sum up when a new dice was rolled
            player1 += dice1;
            player2 += dice1;
            
            //double chance when players get 6 points
            if(dice1==6){
                dice1 = rd.nextInt(6)+1;
                player1 += dice1;
            }else if(dice2==6){
                dice2 = rd.nextInt(6)+1;
                player2 += dice2;
            }
            
            //terminate the loop when the point reach 100 points
            if(player1>100||player2>100){
                System.out.println("Player 1: "+player1);
                System.out.println("Player 2: "+player2+"\n");
                if(player1>100){
                    System.out.println("Player 1 wins");
                }else if(player2>100){
                    System.out.println("Player 2 wins");
                }else{
                    System.out.println("It's a draw");
                }
                break;
            }
        }
        
    }
}
