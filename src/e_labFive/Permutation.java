package e_labFive;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    // Method to generate permutations
    public static void generatePermutations(String str, String perm, Set<String> result) {
        if (str.isEmpty()) {
            result.add(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, perm + currentChar, result);
        }
    }

    public static void main(String[] args) {
        String input = "AGU";
        Set<String> result = new HashSet<>(); // To avoid duplicate permutations
        generatePermutations(input, "", result);

        System.out.println("Permutations of \"" + input + "\":");
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }
}
