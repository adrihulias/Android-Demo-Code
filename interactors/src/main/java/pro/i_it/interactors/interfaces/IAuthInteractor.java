package pro.i_it.interactors.interfaces;

import io.reactivex.Single;
import pro.i_it.interactors.model.errors.TextValidationError;
import pro.i_it.models.user.UserDTO;

/**
 * Created by syn on 16.07.18.
 */

public interface IAuthInteractor {
    TextValidationError checkLogin(String login);

    TextValidationError checkPassword(String password);

    Single<UserDTO> auth(String login, String password);

}
