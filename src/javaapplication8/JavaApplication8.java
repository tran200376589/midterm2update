/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17comp1030test2;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17COMP1030Test2Section1 {
/**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         /**
          * This is test #2 for the Programming Fundamentals course (COMP1030).
          * 
          * For this test, insert the code under each comment.  If code is not
          * directly under the comment, it will not be marked.  For this test,
          * you are allowed to use anything that you bring into the test, but you 
          * are not allowed any communication with others or online research.
          */
          
         /**
          * Question 1 - Print your name to the screen followed by the phrase 
          * "-I'm going to do great on this test"
          * 1 Mark
          */
        System.out.println("Question 1 - 1 Mark");
        System.out.println("I'm going to do great on this test");
         
         /**
          * Question 2 - Prompt the user to enter a number.  Then create a loop
          * that prints your name that many times (one name per line)
          * 3 Marks
          */
        System.out.println("Question 2 - 3 Marks");
        System.out.print("Enter the number of rows: ");
        Scanner keyboard = new Scanner(System.in);
        int rowTotal = keyboard.nextInt();
        for (int row=1; row <=rowTotal; row++)
        {
            for (int col=row; col <= row; col++)
            System.out.printf("Thuongtran");
            System.out.println();
        }
         
         /**
          * Question 3 - Using the number from question 2, create a method called
          * "square" that will return the square of that number and display the
          * result on the screen.  For example, if the user entered the number 
          * 3, the method square would return 3*3 = 9, then the code here 
          * (in the main method) should display it to the screen.
          * 3 Marks
          */
         System.out.println("Question 3 - 3 Marks");
         System.out.printf("the square of rowTotal is: %d %n", square(rowTotal));
         /**
          * Question 4 - Continously ask the user to enter a pass phrase.  When
          * they type "Aced it", end the loop and print the word "success"
          * 3 Marks 
          */
         System.out.println("Question 4 - 3 Marks");
         System.out.print("Enter a pass phrase: ");
         Scanner keyboard = new Scanner(System.in);
         String () 
         
         /**
          * Question 5 - upload your files to a private GitHub repository and make 
          * JaretWright the collaborator.  Once complete, paste the URL to the GitHub
          * repository in Blackboard. 2 marks
          * 
          * If you can not get GitHub working, then copy and paste your code into
          * the essay section of Blackboard. 0 marks
          */
    }   //end of the main method  
    
    /**
     * Question 3 - the method called square should go here
     */
    public static int square(int rowTotal)
         {
            return rowTotal*rowTotal;
         }
    
}