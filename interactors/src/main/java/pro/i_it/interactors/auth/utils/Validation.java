package pro.i_it.interactors.auth.utils;

import pro.i_it.interactors.model.errors.TextValidationError;

/**
 * Created by syn on 16.07.18.
 */

public class Validation {
    public TextValidationError checkLogin(String login) {
        login = login.trim();
        if (login.length() == 0) {
            return new TextValidationError("Login can't be null"); //todo move to resources
        }
        if (login.length() <= 6) {
            return new TextValidationError("Login must be 6 or more letter.");
        }
        if (login.length() > 26) {
            return new TextValidationError("Login must be between 6 and 25.");
        }
        return new TextValidationError(null);
    }

    public TextValidationError checkPassword(String login) {
        login = login.trim();
        if (login.length() == 0) {
            return new TextValidationError("Password can't be null");
        }
        if (login.length() <= 6) {
            return new TextValidationError("Password must be 6 or more letter.");
        }
        if (login.length() > 26) {
            return new TextValidationError("Password must be between 6 and 25.");
        }
        return new TextValidationError(null);
    }
}
