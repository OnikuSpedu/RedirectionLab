import java.util.*;

public class PigLatin {
    public static void main(String[] args) {

        Scanner lines = new Scanner(System.in);

        while (lines.hasNextLine()) {
            Scanner line = new Scanner(lines.nextLine());
            String pigLatinLine = "";
            while (line.hasNext()) {
                pigLatinLine += PigLatin.pigLatinBest(line.next());
                if (line.hasNext()) {
                    pigLatinLine += " ";
                }
            }

            if (lines.hasNextLine()) {
                System.out.println(pigLatinLine);
            } else {
                System.out.print(pigLatinLine);
            }
            line.close();
        }

        lines.close();

    }

    public static String pigLatinSimple(String s) {

        s = s.toLowerCase();

        if (s.length() > 0) {
            if ("AEIOUaeiou".indexOf(s.charAt(0)) != -1) {
                return (s + "hay");
            } else {
                if (s.length() == 1) {
                    return (s + "ay");
                } else {
                    return (s.substring(1, s.length()) + s.charAt(0) + "ay");
                }
            }
        } else
            return s;

    }

    public static boolean isDigraph(String s) {
        String[] digraph = { "bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl",
                "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr" };

        for (int i = 0; i < digraph.length; i++) {
            if (s.equals(digraph[i]))
                return true;
        }

        return false;
    }

    public static String pigLatin(String s) {

        s = s.toLowerCase();

        if (s.length() >= 2 && isDigraph(s.substring(0, 2))) {
            if (s.length() == 2) {
                return s + "ay";
            } else {
                return (s.substring(2, s.length()) + s.substring(0, 2) + "ay");
            }
        } else {
            return pigLatinSimple(s);
        }

    }

    public static String pigLatinBest(String s) {

        if (s.length() > 0) {
            if (!Character.isLetter(s.charAt(0))) {
                return s.toLowerCase();
            } else if (!Character.isLetter(s.charAt(s.length() - 1))) {
                return pigLatin(s.substring(0, s.length() - 1)) + Character.toLowerCase(s.charAt(s.length() - 1));
            } else
                return pigLatin(s);
        } else
            return s;

    }
}