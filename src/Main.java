import java.util.Scanner;
// import javax.swing.*;
//ascii images????

public class Main {

    public static void main(String[] args) {
       // Image startscreen = getImage("starwars.png");

       System.out.println("Welcome to the Star Wars Quiz Game!");

       System.out.println("To start, type 'go'");

      Scanner scanner = new Scanner(System.in);

      String input = scanner.next(); 

      if (input.equalsIgnoreCase("go")) {
        
        System.out.println("To play a character quiz, type 1 \n" + "To play a planet quiz, type 2 \n" + "To play a movie quiz, type 3 \n" + "To play a faster paced starwars quiz, type 4");
      
        scanner.nextLine();
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Guess the name of the character!");
            // System.out.println("You have 3 attempts to guess the character's name.");
          
            String randomName = Person.generateRandomName();
          
if (randomName.equals("Luke Skywalker")) {
          System.out.println("This character has a blue lightsaber, grew up on Tatooine, and trained under Jedi Master Obi-Wan Kenobi and Yoda, and his dad is Darth Vader" + "\n" + "Who is this character? (no spaces)");
  String guess = scanner.nextLine();
  
  if (guess.equalsIgnoreCase("lukeskywalker")) {
    // || guess.equals("luke") || guess.equals("LukeSkywalker") || guess.equals("Luke") 
    System.out.println("Correct!");
    System.out.println("The character is " + randomName);
  } else {
          System.out.println("Incorrect. The character was " + randomName);
      }
  } // Add more characters and questions here as needed 
    else if (randomName.equals("Darth Vader")) {
      System.out.println("This character has a red lightsaber, turned to the dark side. And wears a black mask which affects his breathing" + "\n" + "Who is this character? (no spaces)");
      String guess = scanner.next();

      if (guess.equalsIgnoreCase("darthvader")) {
         // || guess.equals("vader") || guess.equals("DarthVader") || guess.equals("Vader") || guess.equals("darthvader")
        System.out.println("Correct!");
        System.out.println("The character is " + randomName);
      } else {
              System.out.println("Incorrect. The character was " + randomName);
          }
      //ask questions spefic to darth vader
           }
        }
        
     else if (choice == 2) {
       // System.out.println("You have 3 attempts to guess the planet's name.");
            System.out.println("Guess the name of the planet!");
       
       String randomPlanet = Planet.generateRandomPlanet();
       
       if (randomPlanet.equals("Naboo")) {
         System.out.println("This planet is home to the gunguns and Padme Amidala" + "\n" + "Which planet is this?");
         String guess = scanner.next();

         if (guess.equalsIgnoreCase("naboo")) {
           System.out.println("Correct!");
           System.out.println("The planet is " + randomPlanet);
         } else {
                 System.out.println("Incorrect. The planet was " + randomPlanet);
             }
       } else if (randomPlanet.equals("Tatooine")) {
         System.out.println("This planet is home to Luke Skywalker and has two suns" + "\n" + "Which planet is this?");
         
         String guess = scanner.next();

         if (guess.equalsIgnoreCase("Tatooine")) {
           System.out.println("Correct!");
           System.out.println("The planet is " + randomPlanet);
         } else {
                 System.out.println("Incorrect. The planet was " + randomPlanet);
             }
          } else if (randomPlanet.equals("Hoth")) {
          System.out.println("This is the ice/snow planet where we first see the At-Ats" + "\n" + "Which planet is this?");

          String guess = scanner.next();

          if (guess.equalsIgnoreCase("Hoth")) {
            System.out.println("Correct!");
            System.out.println("The planet is " + randomPlanet);
          } else {
                  System.out.println("Incorrect. The planet was " + randomPlanet);
              }
           } else if (randomPlanet.equals("Mustafar")) {
          System.out.println("The firey lava planet where the duel between Obi-wan and Anakin took place" + "\n" + "Which planet is this?");

          String guess = scanner.next();

          if (guess.equalsIgnoreCase("Mustafar") 
         // || guess.equals("mustafar")
         ) {
            System.out.println("Correct!");
            System.out.println("The planet is " + randomPlanet);
          } else {
                  System.out.println("Incorrect. The planet was " + randomPlanet);
              }
           }
        }
     else if (choice == 3) {
        // System.out.println("You have 3 attempts to guess the name of the movie.");
            System.out.println("Guess the name of the movie!");
       String randomMovie = Movie.generateRandomMovie();

        if (randomMovie.equals("Revenge of the Sith")) {
          System.out.println("This is where Order 66 is executed and Luke and Leia are Born, but so is Darth Vader" + "\n" + "Which movie is this? (no spaces)");
          String guess = scanner.next();

          if (guess.equalsIgnoreCase("revengeofthesith")) 
          // || guess.equals("RevengeoftheSith") || guess.equals("revengeofthesith")) 
              {
            System.out.println("Correct!");
            System.out.println("The movie is " + randomMovie);
          } else {
                  System.out.println("Incorrect. The movie was " + randomMovie);
              }
        } else if (randomMovie.equals("A New Hope")) {
          System.out.println("In this movie, the star wars debut, luke, leia, han, and chewie blow up the first death star" + "\n" + "Which movie is this? (no spaces)");

          String guess = scanner.next();

          if (guess.equalsIgnoreCase("anewhope")) {
            System.out.println("Correct!");
            System.out.println("The movie is " + randomMovie);
          } else {
                  System.out.println("Incorrect. The movie was " + randomMovie);
              }
           }
        } else if (choice == 4) {
          System.out.println("Answer The following questions to the best of your knowledge: ");
       System.out.println("(Make sure no spaces are included in your answer)");
       int score = 0;

       for (int i = 1; i <= 10; i++) {
           String q = Questions.generateRandomQuestion();
           String correctAnswer = Questions.getAnswerForQuestion(q);

           System.out.println(q);

           String guess = scanner.next();

             if (guess != null && correctAnswer != null && correctAnswer.equalsIgnoreCase(guess)) {
               score++;
           } else {
               System.out.println("Incorrect. The correct answer was " + correctAnswer);
           }
       }
       System.out.println("Congrats your score is " + score + "/10");
       
        }  else {
  System.out.println("Sorry, thats not an option, please try again.");
  main(args);
}
      } else {
        System.out.println("Sorry, thats not an option, please try again.");
        main(args);
      }
      restartQuiz(args);
      scanner.close();
}
 

  public static void restartQuiz(String[] args) {
          Scanner scanner = new Scanner(System.in); // Create a new Scanner object
    System.out.println("Do you want to play again? (y/n)");
    String again = scanner.next();
    
           if (again.equals("y") || again.equals("Y")) {
               System.out.println("Restarting the quiz...");
               // Add code to restart the quiz here
             main(args);
           } else if (again.equals("n") || again.equals("N")) {
             System.out.println("I wouldn't do that if I were you." + "\n" + "Are you sure? (y/n)");

              String again2 = scanner.next();

             if(again2.equals("n") || again2.equals("N")) {
               System.out.println("Great Choice!");
               System.out.println("Restarting the quiz...");
                main(args);
             } else if (again2.equals("y") || again2.equals("Y")) {
               System.out.println(":(");
               System.out.println("Thank you for playing the Star Wars Quiz Game. Goodbye!");
           }
        }
          scanner.close();
      }
  }