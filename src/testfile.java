import java.util.Scanner;
import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class testfile {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number from 1-10");
            int y = Math.random() * 10;
            int x = input.nextInt();

            while(y != x)
            {
                String z = "Try again";
            }
            System.out.println(x);
            input.close();


    }

}
