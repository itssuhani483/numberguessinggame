import java.util.Random;
import java.util.Scanner;

class guessing {

  public static void main(String[] args) {
    Random Rannum = new Random();
    int correct_num = Rannum.nextInt(100);
    int turns = 0;
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Welcome To The Number Guessing World!\n");

      System.out.println(" Try and Guess a random number between 1 to 100");
      System.out.println(" You have 5 attempts to guess the right number");

      int guess;
      int i = 0;
      boolean win = false;
      while (win == false) {
        guess = scan.nextInt();
        turns++;

        if (guess == correct_num) {
          win = true;
        }

        else if (i > 3)
         {
          System.out.println("You loose!\n Number of attempts is finished...3 the right answer was: "
           + correct_num+ "\nBetter luck next time");
          return ;
        } 
        else if ( turns < 5 && guess > correct_num ) {
          if ( guess - correct_num > 10 ) {
            i++;
            System.out.println("Your guess is High than the right number! Try again!\nGuesses remaining : "+(5-i));
          }
          else {
            i++;
            System.out.println("Your guess is Little High than the right number! Try again!\nGuesses remaining : "+(5-i));
          }
        }
        else if ( turns < 10 && guess < correct_num ) {
          if ( correct_num - guess > 10 ) {
            i++;
            System.out.println("Your guess is Low than the right number! Try again!\nGuesses remaining : "+(5-i));
          }
          else {
            i++;
            System.out.println("Your guess is Little Low than the right number! Try again!\nGuesses remaining : "+(5-i));
          }
        }
    }
    System.out.println("Congratulation..! Your guess is right!");
    System.out.println(correct_num +"!");
    System.out.println("You used " + turns + " turns to guess the right number.");
    System.out.println("Your score is "+ ((6 - turns) * 20) +" out of 100.");
  }
}}