package pro.i_it.testproject.ui.auth;

import android.arch.lifecycle.OnLifecycleEvent;
import android.view.View;

import io.reactivex.android.schedulers.AndroidSchedulers;
import pro.i_it.interactors.interfaces.IAuthInteractor;
import pro.i_it.testproject.ui.auth.interfaces.IAuthPresenter;
import pro.i_it.testproject.ui.auth.interfaces.IAuthView;
import pro.i_it.testproject.ui.base.BasePresenter;

import static android.arch.lifecycle.Lifecycle.Event.ON_START;
import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;
import static pro.i_it.testproject.TestApp.getDependencyManager;

/**
 * Created by syn on 15.07.18.
 */

public class AuthPresenter extends BasePresenter<IAuthView> implements IAuthPresenter {
    private IAuthInteractor authInteractor;

    @Override
    public void init(IAuthView view) {
        super.init(view);
        initDependency();
    }

    private void initDependency() {
        authInteractor = getDependencyManager().getInteractors().getAuthInteractor();
    }

    @OnLifecycleEvent(ON_START)
    void onStart() {
        initListeners();
    }

    private void initListeners() {
        disposable.add(view.getLoginObserver()
                .debounce(300, MILLISECONDS)
                .map(authInteractor::checkLogin)
                .observeOn(mainThread())
                .subscribe(textValidationError -> view.showLoginError(textValidationError.getErrorMessage()), view::showError));

        disposable.add(view.getPasswordObserver()
                .debounce(300, MILLISECONDS)
                .map(authInteractor::checkPassword)
                .observeOn(mainThread())
                .subscribe(textValidationError -> view.showPasswordError(textValidationError.getErrorMessage()), view::showError));
    }

    @Override
    public void onAuthClick(View view) {
        this.view.showProgress(true);

    }


}
