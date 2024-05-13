import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

  class Questions {
  private static final ArrayList<String> questions = new ArrayList<String>();
  private static final HashMap<String, String> questionAnswerMap = new HashMap<String, String>();
    
    static {
        questions.add("What weapon do Jedi use?");
        questions.add("What is the real name of Baby Yoda?");
        questions.add("What tiny animal-like things live on Endor?");
        questions.add("What is the name of the starfighter that the Rebels use? (luke used one to blow up the death star)");
        questions.add("Who built C-3PO?");
        questions.add("What command was given to the clones to execute all the jedi?  Order __");
        questions.add("What strange beverage does luke drink on the farm in tatooine?  ____ milk");
        questions.add("What color is Mace windu's lightsaber?");
        questions.add("What are the little people on tatooine with brown cloaks called? (plurial)");
      // questions.add("");

      questionAnswerMap.put("What weapon do Jedi use?", "Lightsabers");
      questionAnswerMap.put("What is the real name of Baby Yoda?", "grogu");
      questionAnswerMap.put("What tiny animal-like things live on Endor?", "Ewoks");
      questionAnswerMap.put("What is the name of the starfighter that the Rebels use? (luke used one to blow up the death star)", "X-wing");
      questionAnswerMap.put("What is the name of the starfighter that the Rebels use? (luke used one to blow up the death star)", "xwing");
      questionAnswerMap.put("Who built C-3PO?", "anakin");
      questionAnswerMap.put("Who built C-3PO?", "anikin");
      questionAnswerMap.put("What command was given to the clones to execute all the jedi?  Order __", "66");
      questionAnswerMap.put("What strange beverage does luke drink on the farm in tatooine?  ____ milk", "blue");
      questionAnswerMap.put("What color is Mace windu's lightsaber?", "purple");
      questionAnswerMap.put("What are the little people on tatooine with brown cloaks called? (plurial)", "jawas");
      // questionAnswerMap.put("", "");
    }
  public static String generateRandomQuestion() {
      Random rand = new Random();
      return questions.get(rand.nextInt(questions.size()));
  }

    public static String getAnswerForQuestion(String question) {
        return questionAnswerMap.get(question);
    }
    
    }