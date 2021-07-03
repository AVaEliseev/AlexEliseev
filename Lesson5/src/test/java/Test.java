import java.util.*;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Gadjet toothbrush = new Toothbrush("Oclean", 0.05d, 200, "Small", "электрическая зубная щетка");
        Gadjet toothbrush2 = new Toothbrush("Oclean", 0.05d, 200, "Small", "электрическая зубная щетка");
        Gadjet mobile = new Mobile("Samsung", 0.105d, 400, "Small", "мобильный телефон");
        Gadjet mobile2 = new Mobile("Samsung", 0.105d, 400, "Small", "мобильный телефон");
        Gadjet kettle = new Kettle("Bork", 1.0d, 150, "average", "чайник");
//
//        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
//        mobile.destination();
//        mobile.send();
//        mobile.count();
//        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
//        kettle.destination();
//        kettle.count();
//        kettle.action();
//        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
//        toothbrush.destination();
//        toothbrush.action();
//        toothbrush.count();
//        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
//
        List<Gadjet> listGadjet = new ArrayList<>(Arrays.asList(toothbrush, toothbrush2, mobile, mobile2, kettle));
        System.out.println(listGadjet);

        Set setGadjet = new HashSet<>(listGadjet);
        System.out.println(setGadjet);

        Map<String, Gadjet> mapGadjet = new HashMap<>();
        mapGadjet.put(toothbrush.getName(), toothbrush);
        mapGadjet.put(kettle.getName(), kettle);
        mapGadjet.put(mobile.getName(), kettle);

//        System.out.println(mapGadjet.get(toothbrush.getName()));
//        System.out.println(mapGadjet.get(kettle.getName()));
//        System.out.println(mapGadjet.get(mobile.getName()));
        System.out.println(Gadjet.getCollectUnique(listGadjet));
        System.out.println(mapGadjet);
        System.out.println(Gadjet.inverse(mapGadjet));
    }
}


