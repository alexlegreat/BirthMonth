import java.util.Scanner;

public class Main
    {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.println("Enter your birth month here: ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine(); //clear the buffer
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("You said your birth months is " + birthMonth);
            }
        }
        else {
            System.out.println("You said your birth months is " + birthMonth);
        }
          trash = in.nextLine();
            System.out.println("Invalid birth month: " + trash + " which is not a valid number");
            System.out.println("Run the program again with a correct input!");
        }










    }
