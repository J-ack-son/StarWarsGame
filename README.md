# StarWarsGame
This is a game that asks if you want to play a character, movie, or planet quiz about the star wars world.
It is console-based, but I am hoping that I can move it over to processing and use graphics and sound. (image of thing after getting it)
I want the player to be able to start over after they finish a quiz.
I also want a limited amount of descriptions of the thing so that the user can lose.
I will include a win statement, start staement, and end statement.
Count the attempts and tell them how many times they had to try.

# Developer
Jackson Payne

# Pseudo Code:
###For each quiz:
* Set starWarsName = ""
* Set questions = [(""), (""), (""),("")]
*Set score = 0
*Display "Welcome to the StarWars quiz Game!"
*Display "Answer the following questions about " + starWarsName
*For each question in questions:
   * Display question
   * Get playerInput
   * If playerInput is equal to correctAnswer:
       * Increment score by 1
*Display "Quiz complete! Your score is: " + score + " out of " + questions.length
*AskPlayer "Do you want to play again? (yes/no)"
*If player wants to play again:
   * Restart the quiz
*Else:
   * Display "Thank you for playing. Goodbye!"
 
# Source Code

