import java.util.*;
import java.io.*;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String [] args)throws IOException
    {
        PrintWriter out = new PrintWriter(new File("random.txt"));
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int number, count=0, countTwo=0;
        System.out.print("Please enter the total number of integers:");
        int n = sc.nextInt();
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
