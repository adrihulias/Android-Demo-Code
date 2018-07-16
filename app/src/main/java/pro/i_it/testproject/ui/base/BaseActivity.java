package pro.i_it.testproject.ui.base;

import android.support.v7.app.AppCompatActivity;

import pro.i_it.testproject.ui.base.interfaces.IBaseView;
import pro.i_it.testproject.utils.ErrorsUtils;

/**
 * Created by syn on 15.07.18.
 */

public class BaseActivity extends AppCompatActivity implements IBaseView {
    @Override
    public AppCompatActivity getAppActivity() {
        return this;
    }

    @Override
    public void showError(String error) {
        ErrorsUtils.showError(this, error);
    }

    @Override
    public void showError(Throwable error) {
        ErrorsUtils.showError(this, error);
    }
}
