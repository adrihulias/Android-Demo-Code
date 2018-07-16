package pro.i_it.testproject;

import android.app.Application;
import android.content.Context;

import pro.i_it.testproject.dependency.DependencyManager;
import pro.i_it.testproject.dependency.interfaces.IDependencyManager;

/**
 * Created by syn on 16.07.18.
 */

public class TestApp extends Application {
    private static IDependencyManager dependencyManager;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        dependencyManager = new DependencyManager(this);
    }

    public static IDependencyManager getDependencyManager() {
        return dependencyManager;
    }
}
