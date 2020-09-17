
package quizapp;

import java.util.Scanner;

/**
 *
 * @author Constantine 
 */
public class QuizApp {

    public static void main(String[] args) {
         int score = 0;
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("what color is the sky");
        String answer1 = kboard.nextLine();
        if (answer1.equals("blue")) {
            //give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("What planet are you living on??");
        }
        //question 2 
        System.out.println("what color is the ocean");
        String answer2 = kboard.nextLine();
        if (answer2.equals("blue")) {
            //give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("What planet are you living on??");
        }
        //question 3
         System.out.println("What color is drinking water");
        String answer3 = kboard.nextLine();
        if (answer3.equals("clear")) {
            //give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("You don't drink clear water?");
        }
        //question 4
         System.out.println("What period was this code written in?");
        String answer4 = kboard.nextLine();
        if (answer4.equals("2")) {
            //give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("I'm not suprised you don't know");
        }
        //question 5
         System.out.println("what continent is the USA on");
        String answer5 = kboard.nextLine();
        if (answer5.equals("North America")) {
            //give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("You really don't know?");
        }
        System.out.println("Congrats your total amount of correctly answered questions are " +score);
        //Question 2-5 - done
        
        //tell user their score - done
    }
    
}
