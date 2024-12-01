package lab_4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //For others Calender if you want
        int Jan=31, March=31, Apr=30, May=31, June=30, July=31, Aug=31, Sep=30, Oct=31, Nov=30, Dec=31;
        
        //Prompt user for the checking calander
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        //Suppose every year first day is fixed, so there is a bug here, but fine since this is Lab, we follow question needs
        System.out.println("Enter the first day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday):");
        int st_day = sc.nextInt();
        
        System.out.println();
        if(st_day<0||st_day>6){
            //Change out to err, can prompt an error sign to user
            System.err.println("Error number used!");
        }else{
        //MAY Calender
        System.out.println("\t\tTHE CALENDAR OF MAY");
        System.out.println("Sun\tMon\tTues\tWed\tThurs\tFri\tSat");
        
        //Leap Year@Ordinary Year
        if(year%4==0){
            //Days before the certain Month
            int MAYdays = (st_day+Jan+28+March+Apr)%7;
            
                //Arrange the space before the first day of this Month
                for(int i=0;i<MAYdays;i++){
                    System.out.print("\t");
                    }
                
                //Set the first day of the Momth
                for(int day=1;day<=May;day++){
                    System.out.print(day+"\t");
                    if((MAYdays+day)%7==0){
                        //new line for following days
                        System.out.println();
                    }
                }
                System.out.println();
        }else{
            //Days before the certain Month
            int MAYdays = (st_day+Jan+29+March+Apr)%7;
            
                //Arrange the space before the first day of this Month
                for(int i=0;i<MAYdays;i++){
                    System.out.print("\t");
                    }
                
                //Set the first day of the Momth
                for(int day=1;day<=31;day++){
                    System.out.print(day+"\t");
                    if((MAYdays+day)%7==0){
                        //new line for following days
                        System.out.println();
                    }
                }
                System.out.println();
            }
            
        System.out.println();
        //AUGUST Calender
        System.out.println("\t\tTHE CALENDAR OF AUGUST");
        System.out.println("Sun\tMon\tTues\tWed\tThurs\tFri\tSat");
        
        //Leap Year@Ordinary Year
        if(year%4==0){
            //Days before the certain Month
            int AUGdays = (st_day+Jan+28+March+Apr+May+June+July)%7;
            
                //Arrange the space before the first day of this Month
                for(int i=0;i<AUGdays;i++){
                    System.out.print("\t");
                    }
                
                //Set the first day of the Momth
                for(int day=1;day<=May;day++){
                    System.out.print(day+"\t");
                    if((AUGdays+day)%7==0){
                        //new line for following days
                        System.out.println();
                    }
                }
                System.out.println();
        }else{
            //Days before the certain Month
            int AUGdays = (st_day+Jan+29+March+Apr)%7;
            
                //Arrange the space before the first day of this Month
                for(int i=0;i<AUGdays;i++){
                    System.out.print("\t");
                    }
                
                //Set the first day of the Momth
                for(int day=1;day<=31;day++){
                    System.out.print(day+"\t");
                    if((AUGdays+day)%7==0){
                        //new line for following days
                        System.out.println();
                    }
                }
                
            }
        }
        System.out.println();
        sc.close();
    }
}
