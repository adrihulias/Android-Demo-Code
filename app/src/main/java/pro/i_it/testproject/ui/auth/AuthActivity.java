package pro.i_it.testproject.ui.auth;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import io.reactivex.Flowable;
import pro.i_it.testproject.R;
import pro.i_it.testproject.databinding.ActivityAuthBinding;
import pro.i_it.testproject.ui.auth.interfaces.IAuthPresenter;
import pro.i_it.testproject.ui.auth.interfaces.IAuthView;
import pro.i_it.testproject.ui.base.BaseActivity;
import pro.i_it.testproject.utils.RxTextWatcher;

/**
 * Created by syn on 15.07.18.
 */

public class AuthActivity extends BaseActivity implements IAuthView {
    private ActivityAuthBinding views;
    private IAuthPresenter presenter = new AuthPresenter();
    private Flowable loginObserver;
    private Flowable passwordObserver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_auth);
        initOnClickListener();
        presenter.init(this);
    }

    private void initOnClickListener() {
        views.signIn.setOnClickListener(presenter::onAuthClick);
        loginObserver = RxTextWatcher.getWatcher(views.login);
        passwordObserver = RxTextWatcher.getWatcher(views.password);
    }

    @Override
    public void showProgress(boolean isShow) {

    }

    @Override
    public Flowable<String> getLoginObserver() {
        return loginObserver;
    }

    @Override
    public Flowable<String> getPasswordObserver() {
        return passwordObserver;
    }

    @Override
    public void showLoginError(String loginError) {
        views.login.setError(loginError);
    }

    @Override
    public void showPasswordError(String passwordError) {
        views.password.setError(passwordError);
    }
}
