package pro.i_it.testproject.ui.base.interfaces;

/**
 * Created by syn on 15.07.18.
 */

public interface IBasePresenter<View extends IBaseView> {
    void init(View view);
}
