package pro.i_it.interactors.model.errors;

/**
 * Created by syn on 16.07.18.
 */

public class TextValidationError {
    private String errorMessage;

    public TextValidationError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
