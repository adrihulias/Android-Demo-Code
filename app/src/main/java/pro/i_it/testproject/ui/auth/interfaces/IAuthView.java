package pro.i_it.testproject.ui.auth.interfaces;

import io.reactivex.Flowable;
import pro.i_it.testproject.ui.base.interfaces.IBaseView;

/**
 * Created by syn on 15.07.18.
 */

public interface IAuthView extends IBaseView {
    void showProgress(boolean isShow);

    Flowable<String> getLoginObserver();

    Flowable<String> getPasswordObserver();

    void showLoginError(String loginError);

    void showPasswordError(String passwordError);
}
