import java.util.Scanner;
import java.util.Random;


public class testfile {
    public static void main(String[] args) {
        System.out.println("Select difficulty from 1-4 inclusive.");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x == 1)
        {
            x = 10;
        }
            if (x == 2)
            {
                x = 100;
            }
                if(x == 3)
                {
                    x = 1000;
                }
                    if(x == 4)
                    {
                        x = 10000;
                    }
        System.out.println("Guess a number from 1 -" + " " + x);
            double mysteryNum = Math.random()*x;
            int guess = input.nextInt();
            //double yawdj = 5.6;
            //int duiawhd = (int)yawdj;
            int mysterNum1 = (int)mysteryNum;
            while(guess != mysterNum1)
            {
                if(guess > mysterNum1)
                {
                    System.out.println("its less");
                }
                else if(guess < mysterNum1)
                {
                    System.out.println("its greater");
                }
                guess = input.nextInt();
            }
            System.out.println("That's the right number");
            input.close();

            /*(while(y.nextInt(x) != z)
            {
                if(y.nextInt(x)> z)
                {
                    System.out.println("its higher");
                }
                else
                    System.out.println("its lower");
                input = new Scanner(System.in);
                z = input.nextInt();

            }
            System.out.println("Thats's the right number");
            input.close();*/
    }

}
