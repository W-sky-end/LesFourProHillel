import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FieldOfMiracles {
    public static void play(Scanner scanner) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random random = new Random();


        String word = words[random.nextInt(words.length)];
        System.out.println("*heavy breathing*  You cannot escape your fate." +
                " Find the hidden word, or darkness will consume you.");

        boolean guessed = false;

        while (!guessed) {
            System.out.println("Make your choice. The words you seek are among this list: " + Arrays.toString(words));
            String userWord = scanner.nextLine();

            if (userWord.equals(word)) {
                System.out.println("You have won... this time. The hidden word was: " + word);
                guessed = true;
            } else {
                StringBuilder clue = new StringBuilder();
                for (int i = 0; i < 15; i++) {
                    if (i < userWord.length() && i < word.length() &&
                            userWord.charAt(i) == word.charAt(i)) {
                        clue.append(word.charAt(i));
                    } else {
                        clue.append('_');
                    }
                }
                System.out.println("You are weak... Here is your clue: " + clue);
            }
        }
        scanner.close();
    }
}
