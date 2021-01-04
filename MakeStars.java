import java.util.*;

public class MakeStars {
    public static void main(String[] args) {

        Scanner corpus = new Scanner(System.in);

        while (corpus.hasNextLine()) {

            Scanner line = new Scanner(corpus.nextLine());
            String starsLine = "";

            while(line.hasNext()) {
                String token = line.next();
                for(int i = 0; i < token.length(); i++) {
                    starsLine += "*";
                }
                if (line.hasNext()) { starsLine += " ";}
            }
            if (corpus.hasNextLine()) {
                System.out.println(starsLine);
            } else System.out.print(starsLine);
            line.close();
        }

        corpus.close();
    }
}