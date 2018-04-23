package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class MilitaryAlphabetEncoder {

    public String encode(String textToEncode) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("A", "Alpha");
        dictionary.put("B", "Bravo");
        dictionary.put("C", "Charlie");
        dictionary.put("D", "Delta");
        dictionary.put("E", "Echo");
        dictionary.put("F", "Foxtrot");
        dictionary.put("G", "Golf");
        dictionary.put("H", "Hotel");
        dictionary.put("I", "India");
        dictionary.put("J", "Juliet");
        dictionary.put("K", "Kilo");
        dictionary.put("L", "Lima");
        dictionary.put("M", "Mike");
        dictionary.put("N", "November");
        dictionary.put("O", "Oscar");
        dictionary.put("P", "Papa");
        dictionary.put("Q", "Quebec");
        dictionary.put("R", "Romeo");
        dictionary.put("S", "Sierra");
        dictionary.put("T", "Tango");
        dictionary.put("U", "Uniform");
        dictionary.put("W", "Whiskey");
        dictionary.put("X", "X-ray");
        dictionary.put("Y", "Yankee");
        dictionary.put("Z", "Zulu");
        dictionary.put(" ", "/");

        StringBuilder sb = new StringBuilder();

        for (String s : textToEncode.toUpperCase().split("")) {
            sb.append(dictionary.get(s)).append(" ");
        }
        return sb.toString().trim();
    }
}
