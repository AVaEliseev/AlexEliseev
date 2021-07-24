import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.math3.random.RandomData;
import org.apache.commons.math3.random.RandomDataGenerator;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class User {
    private FullName name;
    private LocalDate birthDay; // Дата в виде года 1991-01-01
    private String registrData; //Дата в виде 2020-01-01T00:00:00
    private String login; //6 знаков алфавитно-числовой на латинице
    private String password; //10 знаков алфавитно-числовой на латинице

    public User(FullName name, String birthDay, LocalDateTime registrData, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public User() {
        this.name = generateRandomName();
        this.birthDay = generateRandomDate();
        this.registrData = generateRandomRegistrData();
        this.login = generateRandomLogin(6);
        this.password = generateRandomPassword(10);
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", birthDay=" + birthDay +
                ", registrData=" + registrData +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private FullName generateRandomName() {
        return new FullName();
    }

    private String generateRandomRegistrData() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
        return dateFormat.format(date);
    }

    private LocalDate generateRandomDate() {
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//        LocalDateTime date = new Date(LocalDate.of(1900, 1, 1), LocalDate.of(2010, 1, 1));
//        return dateFormat.format(date);
        final int maxAge = 102 * 12 * 31;
        return LocalDate.now().minusDays(new Random().nextInt(maxAge));
    }

    private String generateRandomLogin(int count) {
        return generateRandomAlphanumeric(count);
    }

    private String generateRandomPassword(int count) {
        return generateRandomAlphanumeric(count);
    }

    private String generateRandomAlphanumeric(int count) {
        return RandomStringUtils.randomAlphanumeric(count);
    }

}
