package pro.i_it.interactors.auth;

import io.reactivex.Single;
import pro.i_it.interactors.auth.utils.Validation;
import pro.i_it.interactors.interfaces.IAuthInteractor;
import pro.i_it.interactors.model.errors.TextValidationError;
import pro.i_it.models.user.UserDTO;

/**
 * Created by syn on 16.07.18.
 */

public class AuthInteractor implements IAuthInteractor {
    private Validation validation = new Validation();

    @Override
    public TextValidationError checkLogin(String login) {
        return validation.checkLogin(login);
    }

    @Override
    public TextValidationError checkPassword(String password) {
        return validation.checkPassword(password);
    }

    @Override
    public Single<UserDTO> auth(String login, String password) {
        return null;
    }
}
