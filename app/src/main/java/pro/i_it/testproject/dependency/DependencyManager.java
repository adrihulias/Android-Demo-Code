package pro.i_it.testproject.dependency;

import android.content.Context;

import pro.i_it.testproject.dependency.interfaces.IDependencyManager;
import pro.i_it.testproject.dependency.interfaces.IInteractorsManager;

/**
 * Created by syn on 15.07.18.
 */

public class DependencyManager implements IDependencyManager {
    private IInteractorsManager interactionsManager;
    public DependencyManager(Context context) {
        interactionsManager = new InteractorsManager(context);
    }

    @Override
    public IInteractorsManager getInteractors() {
        return interactionsManager;
    }
}
