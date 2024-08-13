package problems;

import java.util.Scanner;

public class InputOutput {

    public void readingWritingEndOfLine(){
        /*
        HackerRank
        The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
         */

        Scanner scanner = new Scanner(System.in);
        int n = 1;
        System.out.println("Please enter the lines to be read and then written!");

        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(n + " " + line);
            n++;
        }
        scanner.close();

    }
}
