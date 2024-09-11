import problems.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //*********************************************************************************
        //  InputOutput
        //InputOutput inputOutput = new InputOutput();
        //inputOutput.readingWritingEndOfLine();

        //*********************************************************************************
        //  DATA TYPES:
        //DataTypes dataTypes = new DataTypes();
        //dataTypes.dataTypeTesting();

        //*********************************************************************************
        //  DATE:
        //Date date = new Date();
        /*System.out.println("Enter the date as MM DD YYYY");
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();
        System.out.println(date.findDay(month, day, year));
         */

        //*********************************************************************************
        //  TEXT:
        //Text text = new Text();
        //text.currencyFormatter();

        //*********************************************************************************
        //  STRING:
        StringFunctions stringFunctions = new StringFunctions();
        //stringFunctions.findSubString();
        System.out.println(stringFunctions.getSmallestAndLargest("welcometojava", 3));
    }
}
