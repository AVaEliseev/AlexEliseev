package Utils;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static void fileWriter(File file, String string){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(string);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileRaader(File file){
        FileReader fileReader = null;
        int read;
        try {
            fileReader = new FileReader(file);
            while((read=fileReader.read()) != -1){
                System.out.print((char)read);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void objectSerialized(String fileName, Object o) {
        FileOutputStream fos= null;
        ObjectOutputStream oos= null;
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object objectDeserialized(String fileName){
        FileInputStream s = null;
        ObjectInputStream ois = null;
        try {
            s= new FileInputStream(fileName);
            ois = new ObjectInputStream(s);
            ois.close();
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Path getPath(String path){
        return Paths.get(path);
    }
}