package problems;

import java.util.Scanner;

public class StringFunctions {

    public void findSubString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String S = in.nextLine();
        System.out.println("Enter the start and end: ");
        int start = in.nextInt();
        int end = in.nextInt();
        String subString = S.substring(start, end);
        System.out.println(subString);
    }

    public String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int l = s.length();
        String[] substrings = new String[l - k + 1];

        // Collect all possible substrings of length k
        for (int i = 0; i <= l - k; i++) {
            String substring = s.substring(i, i + k);
            substrings[i] = substring;
        }

        // Sort the substrings array using bubble sort
        int n = substrings.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare two adjacent strings
                if (substrings[j].compareTo(substrings[j + 1]) > 0) {
                    // Swap substrings[j] and substrings[j+1] if they're in the wrong order
                    String temp = substrings[j];
                    substrings[j] = substrings[j + 1];
                    substrings[j + 1] = temp;
                }
            }
        }

        smallest = substrings[0];  // First element after sorting is the smallest
        largest = substrings[n - 1];  // Last element after sorting is the largest

        return smallest + "\n" + largest;
    }

    public void isPalindrome(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean isPalindrome = true;

        char[] chars = new char[A.length()];

        for(int i = 0; i < A.length(); i++){
            chars[i] = A.charAt(i);
        }


        for(int i = 0; i < chars.length; i++){
            if(chars[i] != chars[chars.length - i -1]){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
