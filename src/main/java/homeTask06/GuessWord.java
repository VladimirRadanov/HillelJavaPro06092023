package homeTask06;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    private final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};
    Scanner scanner = new Scanner(System.in);

    private String makeASecretWord() {
        int index = new Random().nextInt(words.length);
        return words[index];
    }

    private String getConsoleInput() {
        System.out.println("Please type the word to guess:");
        return scanner.next();
    }

    private boolean isWordGuessed(String secret, String userInput) {
        boolean isGameEnd = false;
        if (secret.equals(userInput)) {
            scanner.close();
            System.out.println("You WIN!!!");
            isGameEnd = true;
        } else {
            char[] secretChars = secret.toCharArray();
            char[] userInputChars = userInput.toCharArray();

            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 15; i++) {
                if (i < secretChars.length &&
                        i < userInputChars.length &&
                        secretChars[i] == userInputChars[i]) {
                    stringBuffer.append(secretChars[i]);
                } else stringBuffer.append('#');
            }
            System.out.println("See if the word is partially guessed, and try again!");
            System.out.println(stringBuffer);
        }
        return isGameEnd;
    }

    public void game() {
        String secret = makeASecretWord();
        boolean isWin;
        do { isWin = isWordGuessed(secret, getConsoleInput());
        } while (!isWin);
    }

}
