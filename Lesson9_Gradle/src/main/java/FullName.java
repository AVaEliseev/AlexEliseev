import java.io.Serializable;
import java.util.Random;

public class FullName implements Serializable {

    private String firstName;
    private String lastName;
    private String midlleName;

    public FullName(String lastName, String firstName, String midlleName) {
        this.firstName = randomFirstName();
        this.lastName = randomLastName();
        this.midlleName = randomMidlleName();
    }

    public FullName() {
        this.firstName = randomFirstName();
        this.lastName = randomLastName();
        this.midlleName = randomMidlleName();
    }

    /** Генерация рандомных имен */
    private String randomFirstName() {
//        String[] firstName = {"Uriy", "Ivan", "Semen", "Alexander", "Nikolay", "Pavel", "Sergey", "Michail"};
        String[] firstName = {"Юрий", "Иван", "Семен", "Александр", "Николай", "Павел", "Сергей", "Михаил"};

        return firstName[new Random().nextInt(firstName.length)];
    }

    /** Получение ФИО, в формате Фамилия И.О*/
    public String getInitials(){
        return lastName + " " + firstName.charAt(0) + "." + midlleName.charAt(0);
    }

    /** Генерация рандомных фамилий*/
    private String randomLastName() {
//        String[] lastName = {"Kozyrev", "Kabanov", "Sidorov", "Sazonov", "Nikolaev", "Ahmetov", "Ivanov"};
        String[] lastName = {"Козырев", "Кабанов", "Сидоров", "Сазонов", "Николаев", "Ахметов", "Иванов"};

        return lastName[new Random().nextInt(lastName.length)];
    }

    /** Генерация рандомных отчеств*/
    private String randomMidlleName() {
//        String[] midleName = {"Petrovich", "Ivanovich", "Vasiliayvich", "Sergeevich", "Nikolayvich", "Bogdanovich", "Vladimirovich"};
        String[] midleName = {"Петрович", "Иванович", "Васильевич", "Сергеевич", "Николаевич", "Богданович", "Владимирович"};

        return midleName[new Random().nextInt(midleName.length)];
    }

    @Override
    public String toString() {
        return
                lastName + " " + firstName + " " + midlleName;
    }
}
