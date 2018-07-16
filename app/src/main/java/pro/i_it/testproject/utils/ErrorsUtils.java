package pro.i_it.testproject.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by syn on 15.07.18.
 */

public class ErrorsUtils {
    public static void showError(Context context, String error) {
        Toast.makeText(context, error, Toast.LENGTH_SHORT).show();
    }

    public static void showError(Context context, Throwable error) {
        error.printStackTrace();
        Toast.makeText(context, error.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
