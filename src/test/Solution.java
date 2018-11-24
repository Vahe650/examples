package test;

import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(String orginalWord) {
        StringBuffer reversedWord = new StringBuffer();
        for (int i = orginalWord.length() - 1; i >= 0; i--) {
            reversedWord.append(orginalWord.charAt(i)) ;
        }
        System.out.println("original word " + orginalWord);
        System.out.println("Reversed word " + reversedWord);
        if (orginalWord.equalsIgnoreCase(String.valueOf(reversedWord))) {
            System.out.println("The word is Palindrome");
            return true;
        } else {
            System.out.println("The word is not Palindrome");
            return false;

        }
    }

    public static void main(String[] args) {
        recursion();
    }
  static void recursion(){
       Scanner reader = new Scanner(System.in);
       String word = reader.nextLine();
       System.out.println(Solution.isPalindrome(word));
       recursion();
   }
}