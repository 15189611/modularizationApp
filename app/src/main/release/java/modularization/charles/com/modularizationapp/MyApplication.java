package modularization.charles.com.modularizationapp;

import android.app.Application;

import com.github.mzule.activityrouter.annotation.Modules;

/**
 * Created by Charles.
 */
@Modules({"app", "moduleA"})
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
