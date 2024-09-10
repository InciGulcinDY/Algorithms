package problems;

import java.util.Calendar;

public class Date {
    public String findDay(int month, int day, int year) {

        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();
        // Set the date
        cal.set(year, month - 1, day);  // month is 0-based in Calendar

        // Get the day of the week
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Convert to day name
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[dayOfWeek - 1];  // Calendar.DAY_OF_WEEK is 1-based (Sunday is 1)


    }
}
