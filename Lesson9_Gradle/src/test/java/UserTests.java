import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserTests {
    User user = new User();
    private Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^$?!@#%&])(?=\\S+$).{7,}");
    private Pattern patternLogin = Pattern.compile("^(?=.*[a-z])(?=\\S+$).{6,}");
    private RegexValidator regexValidator = new RegexValidator();

    public static void main(String[] args) {
        Path pathUsers = Paths.get("D:\\Learn\\AlexEliseev\\Lesson9_Gradle\\Target\\users.txt");
        File file = new File("D:\\Learn\\AlexEliseev\\Lesson9_Gradle\\Target\\users.txt");
        ArrayList<User> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            usersList.add(new User());
        }

        Utils.FileUtils.fileWriter(file, String.valueOf(usersList));


    }

    @RepeatedTest(100)
    void CheckPasswordValidatePattern(){
        Assertions.assertTrue(regexValidator.validate(patternPassword, user.getPassword()));
    }

    @RepeatedTest(100)
    void CheckLoginValidatePattern(){
        Assertions.assertTrue(regexValidator.validate(patternLogin, user.getLogin()));
    }
}
