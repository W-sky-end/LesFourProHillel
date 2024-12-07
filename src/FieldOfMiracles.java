import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FieldOfMiracles {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", " garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String word = words[random.nextInt(words.length)];
        System.out.println("Try to guess the word? ");

        boolean guessed = false;

        while (!guessed) {
            System.out.println("Guess a word from this words : " + Arrays.toString(words));
            String userWord = scanner.nextLine();//.toLowerCase();

            if (userWord.equals(word)) {
                System.out.println("You guessed it! " + word);
                guessed = true;
            } else {
                StringBuilder clue = new StringBuilder();
                for (int i = 0; i < 15; i++) {
                    if (i < userWord.length() && i < word.length() &&
                            userWord.charAt(i) == word.charAt(i)) {
                        clue.append(word.charAt(i));
                    } else {
                        clue.append('#');
                    }
                }
                System.out.println("Clue: " + clue);
            }
        }
        scanner.close();
    }
}
