package vacomba.com.backgroundactivity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;


public class ApplicationLifeCycle extends Application implements Application.ActivityLifecycleCallbacks{

    int activityVisibleCount = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityStarted(Activity activity) {
        if (activityVisibleCount++ == 0) {
            onForegroundApplication();
        }
    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {
        if (--activityVisibleCount == 0) {
            onBackgroundApplication();
        }
    }

    public boolean isForeground() {
        return activityVisibleCount > 0;
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    public void onForegroundApplication() {}

    public void onBackgroundApplication() {}
}
