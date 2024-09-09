

import java.util.Scanner;


public class GuessTheNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int userNum= 0;
        int compNum= (int)(Math.random()*100);

        do{
            System.out.println("Guess a number between 0 to 100");
            userNum= sc.nextInt();
            
            if(userNum==compNum){
                System.out.println("Woohoo!!  You guessed it right! :)");
                break;
            }

            else if(userNum > compNum)
                System.out.println("Your guess is too large :(");
            

            else
                System.out.println("Your guess is too small :(");
            
        }while(userNum>=0 && userNum<100);

        System.out.print("The Number was: ");
        System.out.println(compNum);

        System.out.println("The End!");

    

    }
}