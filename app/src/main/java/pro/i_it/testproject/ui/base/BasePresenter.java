package pro.i_it.testproject.ui.base;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import io.reactivex.disposables.CompositeDisposable;
import pro.i_it.testproject.ui.base.interfaces.IBasePresenter;
import pro.i_it.testproject.ui.base.interfaces.IBaseView;

import static android.arch.lifecycle.Lifecycle.Event.ON_STOP;

/**
 * Created by syn on 15.07.18.
 */

public class BasePresenter<View extends IBaseView> implements IBasePresenter<View>, LifecycleObserver {
    protected CompositeDisposable disposable = new CompositeDisposable();
    protected View view;

    @Override
    public void init(View view) {
        this.view = view;
        view.getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(ON_STOP)
    void onStop() {
        disposable.clear();
    }
}
