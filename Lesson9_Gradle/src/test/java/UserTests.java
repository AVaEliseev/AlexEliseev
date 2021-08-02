import Utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class UserTests {
    User user = new User();
    private String patternPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^$?!@#%&])(?=\\S+$).{7,}";
    private String patternLogin = "^(?=.*[a-z])(?=\\S+$).{6,}";
    private static String pathFileUsers = "Target/users.txt";
    private static String pathFileAdress = "Target/adress.txt";

    public static void main(String[] args) {
        File file = new File("D:\\Learn\\AlexEliseev\\Lesson9_Gradle\\Target\\users.txt");
        ArrayList<User> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            usersList.add(new User());
        }

        Utils.FileUtils.fileWriter(file, String.valueOf(usersList));
    }

    @Test
    void serializedUsers(){
        ArrayList<User> inputUsersList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            inputUsersList.add(new User());
        }

        FileUtils.objectSerialized(pathFileUsers, inputUsersList);
    }

    @Test
    void deserializedUsers(){
        List<User> userList = (List<User>) FileUtils.objectDeserialized(pathFileUsers);
        System.out.println(userList);
    }

    @Test
    void serializedAdress(){
        ArrayList<AdressRegistration> inputAdressList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            inputAdressList.add(new User().getAdress());
        }

        FileUtils.objectSerialized(pathFileAdress, inputAdressList);
    }

    @Test
    void deserializeddAdress(){
        List<AdressRegistration> adressList = (List<AdressRegistration>) FileUtils.objectDeserialized(pathFileAdress);
        System.out.println(adressList);
    }


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
