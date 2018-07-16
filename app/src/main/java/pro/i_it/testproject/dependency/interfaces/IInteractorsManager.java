package pro.i_it.testproject.dependency.interfaces;

import pro.i_it.interactors.interfaces.IAuthInteractor;

/**
 * Created by syn on 16.07.18.
 */

public interface IInteractorsManager {
    IAuthInteractor getAuthInteractor();
}
