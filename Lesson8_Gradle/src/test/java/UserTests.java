import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserTests {

    User user = new User();
    private String patternPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^$?!@#%&])(?=\\S+$).{7,}";
    private String patternLogin = "^(?=.*[a-z])(?=\\S+$).{6,}";

    @RepeatedTest(100)
    void CheckPasswordValidatePattern(){
        Assertions.assertTrue(user.getPassword().matches(patternPassword));
    }

    @RepeatedTest(100)
    void CheckLoginValidatePattern(){
        Assertions.assertTrue(user.getLogin().matches(patternLogin));
    }

    @RepeatedTest(100)
    void noMoreThanMaxAge(){
        Assertions.assertNotEquals(user.getBirthDay().getYear(),
                (LocalDate.now().getYear() - User.MAX_AGE_FOR_USER),
                "они равны");
    }

}
