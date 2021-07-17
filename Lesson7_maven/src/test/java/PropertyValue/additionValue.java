package PropertyValue;

public class additionValue {
    @org.testng.annotations.DataProvider(name = "additionValue")
    public static Object [][] additionValueMethod(){
        return new Object[][]{{5, 3, 8}, {4, 5, 9}, {5, 5, 10}, {25, 15, 40}};
    }
}
