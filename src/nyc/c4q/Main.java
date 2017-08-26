package nyc.c4q;

import java.util.Scanner;

public class Main{
    static  int skill=5;
    static int  time =10;

    public static void main(String [] args){

        System.out.println("Do You Wanna Play A Game ?…(This is a yes or no question by the way)");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();



        String name1="Keke";
        String name2="JohnJohn";
        String fight ="you win + 1000 points";
        String run="LOSER sorry..... play again?";
        System.out.println("ok");
        System.out.println("if your a female press 1 and if your a male press 2 ");


        scan.nextLine();
        while (skill<time ){
            System.out.print( " You have full health ");
            break;
        }
        System.out.println("Hey " + name2+ " <----this is your video game name for now ok lets get started press any key to continue ");
        scan.nextLine();
        System.out.println("WEAPONS ARMED");


        System.out.print( "2 enemies behind you  LOOK OUT !!!press any key to contiue ");
        scan.nextLine();
        System.out.println("RUN OR FIGHT?");


        scan.nextLine();



        System.out.println(fight);
        System.out.println("press any keep to comtinue");
        scan.nextLine();
        int runSpeed=5;
        int fightStrength=10;
        if (runSpeed>fightStrength){
            System.out.println("loser");

        }else {System.out.println("winner");
        }
        System.out.println("GAME OVER");

    }
}
