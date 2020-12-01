import java.util.*;
import java.io.*;
import java.util.Scanner;

public class RandomNumber {
   public static void random(int n) throws IOException
    {
        PrintWriter out = new PrintWriter(new File("random.txt"));
        Random rand = new Random();

        int number, count=0, countTwo=0;
        while(count<n)
        {
            while(countTwo<1)
            {
                number=rand.nextInt(100)+1;
                out.print(number);
                count++;
                countTwo++;
            }
            countTwo = 0;
            out.println();
        }
        out.close();
    }
}
