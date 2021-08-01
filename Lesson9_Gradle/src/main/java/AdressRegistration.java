import org.apache.commons.lang3.RandomStringUtils;


import java.io.Serializable;
import java.util.Random;

public class AdressRegistration implements Serializable {
    private String city;
    private String street;
    private String house;
    private String apartment;

    public AdressRegistration(String city, String street, String house, String apartment) {
        this.city = randomCity();
        this.street = randomStreet();
        this.house = randomHouse();
        this.apartment = apartment;
    }

    public AdressRegistration() {
        this.city = randomCity();
        this.street = randomStreet();
        this.house = randomHouse();
        this.apartment = randomApartment();
    }

    /** Генерация рандомных городов */
    private String randomCity(){
        String[] city = {"Москва", "Воронеж", "Самара", "Казань", "Ульяновск", "Санкт-Петербург", "Ярославль", "Владимир"};
        return city[new Random().nextInt(city.length)];
    }

    /** Генерация рандомных улиц */
    private String randomStreet(){
        String[] street = {"Ленина", "Московская", "Юнных Ленинцев", "Ташкентская", "Юбелейная", "Крымская", "Сормовская", "Краснодарская"};
        return street[new Random().nextInt(street.length)];
    }

    /** Генерация рандомных номеров домов */
    private String randomHouse(){
        return String.valueOf(new Random().nextInt(100));
    }

    /** Генерация рандомных номеров квартир */
    private String randomApartment(){
        return String.valueOf(new Random().nextInt(120));
    }

    @Override
    public String toString() {
        return
                "город " + city +
                ", улица " + street +
                ", дом " + house +
                ", квартира " + apartment;
    }
}
