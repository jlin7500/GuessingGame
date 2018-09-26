import java.util.Scanner;
import java.util.Random;


public class testfile {
    public static void main(String[] args) {
        System.out.println("select difficulty from 1-4 inclusive.");
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
                    else if(x == 4)
                    {
                        x = 10000;
                    }

        System.out.println("Guess a number from 1-10");
            Random y = new Random();
            int z = input.nextInt();
            while(y != z)
            {
                String xx = "Try again";
            }
            System.out.println(x);
            input.close();


    }

}
