package pro.i_it.testproject.ui.base.interfaces;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by syn on 15.07.18.
 */

public interface IBaseView {
    AppCompatActivity getAppActivity();

    Lifecycle getLifecycle();

    void showError(String error);

    void showError(Throwable error);
}
