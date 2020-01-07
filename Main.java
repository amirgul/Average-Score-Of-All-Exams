import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard  = new Scanner(System.in);
        System.out.println("This program will compute the average score of all exams");
        System.out.println("a list of non-negative exams score");
        String answer;
        double score;
        double total = 0;
        double average = 0;
        int numberOfStudents= 0;
        do {
            System.out.println("please enter all exams score non-negative");
            System.out.println("this program will compute the average");
            System.out.println("once you done enter a negative number to stop");
            score = keyboard.nextDouble();
            while (score >= 0)
            {
                total += score;
                numberOfStudents++;
                score = keyboard.nextDouble();
            }
            if(numberOfStudents > 0)
                System.out.println("Average is: " + total/numberOfStudents);
            else
                System.out.println("No score to average");

            System.out.println("you want to average another student score");
            System.out.println("please enter yes or no");
            answer = keyboard.next();
        }while (answer.equalsIgnoreCase("yes"));

        System.out.println("thank you and have a great day");
    }
}
