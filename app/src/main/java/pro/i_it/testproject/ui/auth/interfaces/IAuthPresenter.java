package pro.i_it.testproject.ui.auth.interfaces;

import android.view.View;

import pro.i_it.testproject.ui.base.interfaces.IBasePresenter;

/**
 * Created by syn on 15.07.18.
 */

public interface IAuthPresenter extends IBasePresenter<IAuthView>{
    void onAuthClick(View view);
}
