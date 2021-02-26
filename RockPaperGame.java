package com.company;
import java.awt.print.Paper;
import java.util.*;

public class RockPaperGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.print("How many rounds you want to play: ");
        int round=s.nextInt();
        System.out.println("1 = Rock\n2 = Paper\n3 = Scissor\nTry your best to win!");
        int compoint=0;
        int yourpoint=0;
        for (int i=0;i<round;i++){
            System.out.println("______________________________");

            System.out.print("Enter your Choice:");
            int attack=s.nextInt();
            int rand=r.nextInt(3)+1;

            if (attack==1&&rand==1){
                System.out.println("You: Rock");
                System.out.println("Computer: Rock");
                System.out.println("Tie!!!");
            }
            if (attack==1&&rand==2){
                System.out.println("You: Rock");
                System.out.println("Computer: Paper");
                System.out.println("You loose!");
                compoint = compoint+1;
            }
            if (attack==1&&rand==3){
                System.out.println("You: Rock");
                System.out.println("Computer: Scissor");
                System.out.println("You Won!");
                yourpoint = yourpoint+1;
            }
            if (attack==2&&rand==1){
                System.out.println("You: Paper");
                System.out.println("Computer: Rock");
                System.out.println("You Won!");
                yourpoint = yourpoint+1;
            }
            if (attack==2&&rand==2){
                System.out.println("You: Paper");
                System.out.println("Computer: Paper");
                System.out.println("Tie!!!");
            }
            if (attack==2&&rand==3){
                System.out.println("You: Paper");
                System.out.println("Computer: Scissor");
                System.out.println("You loose!");
                compoint = compoint+1;
            }
            if (attack==3&&rand==1){
                System.out.println("You: Scissor");
                System.out.println("Computer: Rock");
                System.out.println("You loose!");
                compoint = compoint+1;
            }
            if (attack==3&&rand==2){
                System.out.println("You: Scissor");
                System.out.println("Computer: Paper");
                System.out.println("You Won!");
                yourpoint = yourpoint+1;
            }
            if (attack==3&&rand==3){
                System.out.println("You: Scissor");
                System.out.println("Computer: Scissor");
                System.out.println("Tie!!!");
            }
            if (attack!=1&&attack!=2&&attack!=3){
                System.out.println("Invalid Input");
                break;
            }
        }
        System.out.println("______________________________");
        System.out.println("Result-");
        if (yourpoint>compoint){
            System.out.println("Your point: "+yourpoint);
            System.out.println("Computer point: "+compoint);
            System.out.println("You Won!!!");
        }
        else if (compoint>yourpoint){
            System.out.println("Your point: "+yourpoint);
            System.out.println("Computer point: "+compoint);
            System.out.println("You loose!!!");
        }
        else {
            System.out.println("Your point: "+yourpoint);
            System.out.println("Computer point: "+compoint);
            System.out.println("Match Tie!!!");
        }
    }
}
