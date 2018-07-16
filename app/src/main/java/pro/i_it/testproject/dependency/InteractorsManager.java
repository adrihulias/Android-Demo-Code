package pro.i_it.testproject.dependency;

import android.content.Context;

import pro.i_it.interactors.auth.AuthInteractor;
import pro.i_it.interactors.interfaces.IAuthInteractor;
import pro.i_it.testproject.dependency.interfaces.IInteractorsManager;

/**
 * Created by syn on 16.07.18.
 */

public class InteractorsManager implements IInteractorsManager {
    private AuthInteractor authInteractor;

    public InteractorsManager(Context context) {
        authInteractor = new AuthInteractor();
    }

    @Override
    public IAuthInteractor getAuthInteractor() {
        return authInteractor;
    }
}
