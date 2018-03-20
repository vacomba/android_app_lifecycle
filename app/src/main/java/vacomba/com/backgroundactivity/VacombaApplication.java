package vacomba.com.backgroundactivity;

import android.util.Log;
import android.widget.Toast;


public class VacombaApplication extends ApplicationLifeCycle {

    private static final String TAG = "ApplicationLifeCycle";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onForegroundApplication() {
        Log.d(TAG, "Foreground");
        Toast.makeText(this, "Foreground", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackgroundApplication() {
        Log.d(TAG, "Background");
        Toast.makeText(this, "Background", Toast.LENGTH_SHORT).show();
    }
}
