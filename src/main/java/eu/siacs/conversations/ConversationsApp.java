package eu.siacs.conversations;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.util.Locale;

/**
 * Created by ruhallah-PC on 12/10/2016.
 */

public class ConversationsApp extends Application {

    private static final String SHARED_PREFERENCES = "ruhallah.ahmadian";
    private static SharedPreferences sharedPreferences;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        context = getApplicationContext();

        setLan();
    }

    private void setLan() {
        /*Resources res = context.getResources();
        // Change locale settings in the app.
        DisplayMetrics dm = res.getDisplayMetrics();
        android.content.res.Configuration conf = res.getConfiguration();
        conf.locale = new Locale("ko");
        res.updateConfiguration(conf, dm);*/
    }

    public static SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public static Context getContext() {
        return context;
    }
}
