//You're on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        
        //declare variables and create the scanner
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int sum = 0;
        double avg = 0;
        
        Scanner avgScanner = new Scanner(System.in);
        
        //get user input
        System.out.println("Enter the first number: ");
        firstNum = avgScanner.nextInt();
        
        System.out.println("Enter the second number: ");
        secondNum = avgScanner.nextInt();
        
        System.out.println("Enter the third number: ");
        thirdNum = avgScanner.nextInt();
        
        System.out.println("Enter the fourth number: ");
        fourthNum = avgScanner.nextInt();
        
        //print the numbers given
        System.out.println(/* empty space */);
        System.out.println("The first number is " + firstNum);
        System.out.println("The second number is " + secondNum);
        System.out.println("The third number is " + thirdNum);
        System.out.println("The fourth number is " + fourthNum);
        
        //add all numbers and calculate average
        sum = firstNum + secondNum + thirdNum + fourthNum;
        avg = sum/4.0;
        
        //print sum of all numbers and print the average of all numbers
        System.out.println(/* empty space */);
        System.out.println("The sum of all numbers is " + sum);
        System.out.println("The average of all numbers is " + avg);
    }
}


//Paste console output below:
/*

Enter the first number: 
475
Enter the second number: 
821
Enter the third number: 
369
Enter the fourth number: 
562

The first number is 475
The second number is 821
The third number is 369
The fourth number is 562

The sum of all numbers is 2227
The average of all numbers is 556.75

*/
