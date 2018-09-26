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
            Random y = new Random();
            int z = input.nextInt();
            while(y.nextInt(x) != z)
            {
                if(y.nextInt(x) < z)
                {
                    System.out.println("its higher");
                }
                
                input = new Scanner(System.in);
                System.out.println("try again");
                z = input.nextInt();

            }
            System.out.println("thats the right number");
            input.close();
    }

}
