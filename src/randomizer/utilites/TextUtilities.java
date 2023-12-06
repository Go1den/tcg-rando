package randomizer.utilites;

import java.util.HashMap;
import java.util.Map;

public class TextUtilities {

    //09 2E = Player's name... not a single char though
    //00 06 = End of a conversation

    private static final Map<String, String> textToHexMap = new HashMap<String, String>() {{
        put("\n", "0A");
        put(" ", "20");
        put("!", "21");
        put("\"", "22");
        put("#", "23");
        put("$", "24");
        put("%", "25");
        put("&", "26");
        put("\'", "27");
        put("(", "28");
        put(")", "29");
        put("*", "2A");
        put("+", "2B");
        put(",", "2C");
        put("-", "2D");
        put(".", "2E");
        put("0", "30");
        put("1", "31");
        put("2", "32");
        put("3", "33");
        put("4", "34");
        put("5", "35");
        put("6", "36");
        put("7", "37");
        put("8", "38");
        put("9", "39");
        put(":", "3A");
        put(";", "3B");
        put("<", "3C");
        put("=", "3D");
        put(">", "3E");
        put("?", "3F");
        put("@", "40");
        put("A", "41");
        put("B", "42");
        put("C", "43");
        put("D", "44");
        put("E", "45");
        put("F", "46");
        put("G", "47");
        put("H", "48");
        put("I", "49");
        put("J", "4A");
        put("K", "4B");
        put("L", "4C");
        put("M", "4D");
        put("N", "4E");
        put("O", "4F");
        put("P", "50");
        put("Q", "51");
        put("R", "52");
        put("S", "53");
        put("T", "54");
        put("U", "55");
        put("V", "56");
        put("W", "57");
        put("X", "58");
        put("Y", "59");
        put("Z", "5A");
        put("[", "5B");
        put("\\", "5C");
        put("]", "5D");
        put("^", "5E");
        put("_", "5F");
        put("`", "60"); //the ` as far as the game is concerned represents the é in Pokémon
        put("é", "60");
        put("a", "61");
        put("b", "62");
        put("c", "63");
        put("d", "64");
        put("e", "65");
        put("f", "66");
        put("g", "67");
        put("h", "68");
        put("i", "69");
        put("j", "6A");
        put("k", "6B");
        put("l", "6C");
        put("m", "6D");
        put("n", "6E");
        put("o", "6F");
        put("p", "70");
        put("q", "71");
        put("r", "72");
        put("s", "73");
        put("t", "74");
        put("u", "75");
        put("v", "76");
        put("w", "77");
        put("x", "78");
        put("y", "79");
        put("z", "7A");
        put("{", "7B");
        put("|", "7C");
        put("}", "7D");
        put("~", "7E");
    }};

    private static final String endOfLineHex = "0006";

    public String convertTextToHex(String toConvert) {
        StringBuilder result = new StringBuilder();
        for (char c : toConvert.toCharArray()) {
            String thisCharAsString = "" + c;
            String thisHex = textToHexMap.get(thisCharAsString);
            result.append(thisHex);
        }
        result.append(endOfLineHex);
        return result.toString();
    }

}
