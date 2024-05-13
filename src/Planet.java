import java.util.ArrayList;
import java.util.Random;

class Planet {
    private static final ArrayList<String> name = new ArrayList<String>();

    static {
        name.add("Naboo");
        name.add("Tatooine");
        name.add("Mustafar");
        name.add("Hoth");
        // name.add("Coruscant");
        // name.add("Endor");
        // name.add("Kamino");
        // name.add("Kashyyyk");
    }

    public static String generateRandomPlanet() {
        Random rand = new Random();
        return name.get(rand.nextInt(name.size()));
    }
}