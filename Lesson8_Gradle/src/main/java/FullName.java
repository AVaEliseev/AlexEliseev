import java.util.Random;

public class FullName {

    private String firstName;
    private String lastName;
    private String midlleName;

    public FullName(String lastName, String firstName, String midlleName) {
        this.firstName = randomFirstName();
        this.lastName = lastName;
        this.midlleName = midlleName;
    }

    public FullName() {
        this.firstName = randomFirstName();
        this.lastName = randomLastName();
        this.midlleName = randomMidlleName();
    }

    private String randomFirstName() {
//        String[] firstName = {"Козырев", "Кабанов", "Сидоров", "Сазонов", "Николаев"};
        String[] firstName = {"Kozyrev", "Kabanov", "Sidorov", "Sazonov", "Nikolaev"};
        Random generate = new Random();
        return firstName[generate.nextInt(5)];
    }

    private String randomLastName() {
        String[] firstName = {"Uriy", "Ivan", "Semen", "Alexander", "Nikolay"};
        Random generate = new Random();
        return firstName[generate.nextInt(5)];
    }

    private String randomMidlleName() {
        String[] firstName = {"Petrovich", "Ivanovich", "Vasiliayvich", "Sergeevich", "Nikolayvich"};
        Random generate = new Random();
        return firstName[generate.nextInt(5)];
    }

    @Override
    public String toString() {
        return
                firstName + " " + lastName + " " + midlleName;
    }
}
