package core.basesyntax;

public class PasswordValidator {
    public PasswordValidator() {

    }

    public void validate(String pass, String repPass) throws PasswordValidationException {
        if (pass.equals(repPass) && pass.length() >= 10) {
            return;
        }

        if (pass == null || repPass == null) {
            return;
        }

        throw new PasswordValidationException("Wrong passwords");
    }

}
