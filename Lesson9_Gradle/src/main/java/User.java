import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class User implements Serializable {
    public static final int MIN_AGE_FOR_REGISTRATION = 18;
    public static final int MAX_AGE_FOR_USER = 102;
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    public static final char[] CHAR_LOWER_CASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static final char[] CHAR_UPPER_CASE = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
    public static final char[] CHAR_SYMBOL = "^$?!@#%&".toCharArray();
    public static final char[] CHAR_NUMBER = "0123456789".toCharArray();
    Random random = new Random();


    private FullName name;
    private LocalDate birthDay;        /** Дата в виде года 1991-01-01*/
    private String registrData;        /**Дата в виде 2020-01-01T00:00:00*/
    private String login;              /**6 знаков алфавитно-числовой на латинице*/
    private String password;           /**10 знаков алфавитно-числовой на латинице*/
    private AdressRegistration adress; /** город, улица, дом, квартира */


    public User() {
        this.name = generateRandomName();
        this.birthDay = generateRandomBirthDay();
        this.registrData = generateRandomRegistrData();
        this.login = generateRandomLogin(6);
        this.password = generateRandomPassword();
        this.adress = generateRandomAdressRegisration();
    }

    @Override
    public String toString() {
        return name +
                ", дата рождения:" + birthDay +
                ", дата регистрации:" + registrData +
                ", логин:" + login +
                ", пароль:" + password +
                ", зарегестрирован по адресу: " + adress;
    }

    private FullName generateRandomName() {
        return new FullName();
    }

    private AdressRegistration generateRandomAdressRegisration(){
        return new AdressRegistration();
    }

    public FullName getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getRegistrData() {
        return registrData;
    }

    public AdressRegistration getAdress() {
        return adress;
    }

    private String generateRandomRegistrData() {
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();
        int bound = LocalDateTime.now().getYear() - (this.birthDay.getYear() + MIN_AGE_FOR_REGISTRATION);

        calendar.set(Calendar.YEAR, Math.abs(bound == 0 ? 0 : random.nextInt(bound) + this.birthDay.getYear() + MIN_AGE_FOR_REGISTRATION));
        calendar.set(Calendar.MONTH, Math.abs(random.nextInt()) % 12);
        calendar.set(Calendar.DATE, Math.abs(random.nextInt()) % 30);
        calendar.set(Calendar.HOUR, Math.abs(random.nextInt()) % 24);
        calendar.set(Calendar.MINUTE, Math.abs(random.nextInt()) % 60);
        calendar.set(Calendar.SECOND, Math.abs(random.nextInt()) % 60);
        calendar.setLenient(true);
        return DATE_FORMAT.format(calendar.getTime());
    }

    private LocalDate generateRandomBirthDay() {
        final int maxDaysAgeFromNow = (MAX_AGE_FOR_USER - MIN_AGE_FOR_REGISTRATION) * 12 * 31;
        return LocalDate.now().minusYears(MIN_AGE_FOR_REGISTRATION).minusDays(new Random().nextInt(maxDaysAgeFromNow));
    }

    private String generateRandomLogin(int count) {
        return generateRandomAlphanumeric(count).toLowerCase();
    }

    private String generateRandomPassword() {

        List<Character> list =Arrays.asList(
                CHAR_NUMBER[random.nextInt(CHAR_NUMBER.length)],
                CHAR_NUMBER[random.nextInt(CHAR_NUMBER.length)],
                CHAR_LOWER_CASE[random.nextInt(CHAR_LOWER_CASE.length)],
                CHAR_LOWER_CASE[random.nextInt(CHAR_LOWER_CASE.length)],
                CHAR_UPPER_CASE[random.nextInt(CHAR_UPPER_CASE.length)],
                CHAR_UPPER_CASE[random.nextInt(CHAR_UPPER_CASE.length)],
                CHAR_SYMBOL[random.nextInt(CHAR_SYMBOL.length)]);
        Collections.shuffle(list);
        return StringUtils.join(list, "");
    }

    private String generateRandomAlphanumeric(int count) {
        return RandomStringUtils.randomAlphanumeric(count);
    }

}
