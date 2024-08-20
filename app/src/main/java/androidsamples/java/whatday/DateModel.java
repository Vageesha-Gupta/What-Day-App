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
    public static void initialize(String yearStr, String monthStr, String dateStr) {
        if (yearStr == null || monthStr == null || dateStr == null) {
            Log.i(TAG, "Null input provided");
            message = "Null input provided";
            return;
        }
        int year, month, date;

        try {
            year = Integer.parseInt(yearStr);
            month = Integer.parseInt(monthStr);
            date = Integer.parseInt(dateStr);
        } catch (NumberFormatException e) {
            Log.i(TAG, "Invalid input: non-numeric value provided");
            message = "Invalid input: non-numeric value provided";
            return;
        }

        if (yearStr.length() > 4) {
            Log.i(TAG, "Invalid year: " + yearStr);
            message = "Invalid year: " + yearStr;
            return;
        }
        if (month < 1 || month > 12) {
            Log.i(TAG, "Invalid month: " + monthStr);
            message = "Invalid month: " + monthStr;
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
            Log.i(TAG, "Invalid date: " + yearStr + "-" + monthStr + "-" + dateStr);
            message = "Invalid date: " + yearStr + "-" + monthStr + "-" + dateStr;
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
