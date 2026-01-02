package core.basesyntax;

public class PasswordValidator {
    public PasswordValidator() {

    }

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.equals(repeatPassword) && password.length() >= 10) {
            return;
        }

        if (password == null || repeatPassword == null) {
            return;
        }

        throw new PasswordValidationException("Wrong passwords");
    }

}
