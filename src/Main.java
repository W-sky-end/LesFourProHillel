import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I am Darth Vader.Soon we will find out what you are capable of.");
        System.out.println("You dare enter the realm of the Dark Side?");
        System.out.println("Enter a string to prove your courage:");
        String inputString = scanner.nextLine();
        System.out.println("Enter a character to count its power within the string:");
        char inputChar = scanner.nextLine().charAt(0);
        int occurrences = SymbolOccurance.findSymbolOccurance(inputString, inputChar);
        System.out.println("The symbol '" + inputChar + "' appears " + occurrences + " time(s).");

        System.out.println("\nYour next challenge awaits.");
        System.out.println("Enter the source string (the domain of the Force):");
        String source = scanner.nextLine();
        System.out.println("Enter the target string (your weak attempt at locating it):");
        String target = scanner.nextLine();
        int position = WordPosition.findWordPosition(source, target);
        System.out.println("The position of the target is: " + position);

        System.out.println("\nNow, reverse the flow of the Force.");
        System.out.println("Enter a string to turn it to the Dark Side:");
        String stringToReverse = scanner.nextLine();
        String reversedString = Reverce.stringReverce(stringToReverse);
        System.out.println("Yes!Yes!The reversed string: " + reversedString);

        System.out.println("\nOnly the purest will survive. Test your string for symmetry.");
        System.out.println("Enter a string to see if it aligns with the Dark Side:");
        String palindromeCandidate = scanner.nextLine();
        boolean isPalindrome = Palindrome.isPalindrome(palindromeCandidate);
        System.out.println("Does it align with the Dark Side?(Palindrome) " + isPalindrome);

        System.out.println("\nFinally, face your ultimate trial.");
        FieldOfMiracles.play(scanner);

        scanner.close();
    }

}
