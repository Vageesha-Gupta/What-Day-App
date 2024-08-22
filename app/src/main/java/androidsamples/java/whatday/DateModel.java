package androidsamples.java.whatday;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.Calendar;

/**
 * Represents the date to be set, whether it is a valid date, and the message with error status or the day of the week.
 */
public class DateModel {

    /**
     * Initializes the {@link DateModel} with the given year, month, and date.
     * If the date is not valid, it sets the appropriate error message.
     * If it is valid, it sets the appropriate day of the week message.
     *
     * @param yearStr  a {@code String} representing the year, e.g., "1947"
     * @param monthStr a {@code String} representing the month, e.g., "8"
     * @param dateStr  a {@code String} representing the date, e.g., "15"
     */
    private static final String TAG = "DataModel";
    private static String message = "";
    private static int  getMaxDaysInMonth(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    public static void initialize(String yearStr, String monthStr, String dateStr) {
        if (yearStr == null || monthStr == null || dateStr == null) {
//            Log.i(TAG, "Enter valid input");
            System.out.println(TAG + ": Enter valid input");
            message = "Enter valid input";
            return;
        }
        int year, month, date;

        try {
            date = Integer.parseInt(dateStr);

            month = Integer.parseInt(monthStr);
            year = Integer.parseInt(yearStr);

        } catch (NumberFormatException e) {
//            Log.i(TAG, "Enter values in a proper numeric format");
            System.out.println(TAG + ": Enter values in a proper numeric format");
            message = "Enter values in a proper numeric format";
            return;
        }

        if (yearStr.length() > 4) {
//            Log.i(TAG, "Invalid year: " + yearStr);
            System.out.println(TAG + ": Invalid year: " + yearStr);
            message = "Invalid year: " + yearStr;
            return;
        }
        if (month < 1 || month > 12) {
//            Log.i(TAG, "Invalid month: " + monthStr);
            System.out.println(TAG + ": Invalid month: " + monthStr);
            message = "Invalid month" ;
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        try {
            calendar.set(year, month - 1, date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            message = daysOfWeek[dayOfWeek - 1];
        }
        catch (IllegalArgumentException e) {
            if(month==2 && date==29){
//                Log.i(TAG, "February of "+ yearStr+ "does not have " + dateStr + " days");
                System.out.println(TAG + ": February of " + yearStr + " does not have " + dateStr + " days");
                message="February of "+ yearStr+ " does not have " + dateStr + " days";
            }
            else if(date>getMaxDaysInMonth(month,year) && date<=31){
//                Log.i(TAG, "This month does not have "+ dateStr + "days");
                System.out.println(TAG + ": This month does not have " + dateStr + " days");
                message="This month does not have "+ dateStr + " days";
            }
            else{
//                Log.i(TAG, "Invalid date");
                System.out.println(TAG + ": Invalid date");
                message = "Invalid date";
            }

        }
    }

    /**
     * Retrieves the message from the {@link DateModel}.
     * It can be an error message like "February of 2019 does not have 29 days"
     * or a success message like "Friday".
     *
     * @return the message from the model
     */
    @NonNull
    public static String getMessage() {
        return message;
    }
}
