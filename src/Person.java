import java.util.ArrayList;
import java.util.Random;

class Person {
    private static final ArrayList<String> names = new ArrayList<String>();

    static {
        names.add("Luke Skywalker");
        names.add("Darth Vader");
        // names.add("Leia Organa");
        // names.add("Stormtrooper");
        // names.add("Chewbacca");
        // names.add("Han Solo");
      
        // names.add("Padme Amidala");
        // names.add("Obi-Wan Kenobi");
        // names.add("Yoda");
        // names.add("Jar Jar Binks");
        // names.add("C-3PO");
        // names.add("R-2D2");
    }
  public static String generateRandomName() {
      Random rand = new Random();
      return names.get(rand.nextInt(names.size()));
  }
        // ArrayList<String> randomNames = new ArrayList<String>();
        // for (int i = 0; i < 3; i++) {
        // return randomNames;
    }