package pro.i_it.testproject.ui.base;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import pro.i_it.testproject.ui.base.interfaces.IBaseView;
import pro.i_it.testproject.utils.ErrorsUtils;

/**
 * Created by syn on 15.07.18.
 */

public class BaseFragment extends Fragment implements IBaseView {
    @Override
    public AppCompatActivity getAppActivity() {
        return getActivity() instanceof AppCompatActivity ? (AppCompatActivity) getActivity() : null;
    }

    @Override
    public void showError(String error) {
        ErrorsUtils.showError(getContext(), error);
    }

    @Override
    public void showError(Throwable error) {
        ErrorsUtils.showError(getContext(), error);
    }
}
