import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserTests {

    User user = new User();
    private Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^$?!@#%&])(?=\\S+$).{7,}");
    private Pattern patternLogin = Pattern.compile("^(?=.*[a-z])(?=\\S+$).{6,}");
    private RegexValidator regexValidator = new RegexValidator();


    @RepeatedTest(100)
    void CheckPasswordValidatePattern(){
        Assertions.assertTrue(regexValidator.validate(patternPassword, user.getPassword()));
    }

    @RepeatedTest(100)
    void CheckLoginValidatePattern(){
        Assertions.assertTrue(regexValidator.validate(patternLogin, user.getLogin()));
    }
}
