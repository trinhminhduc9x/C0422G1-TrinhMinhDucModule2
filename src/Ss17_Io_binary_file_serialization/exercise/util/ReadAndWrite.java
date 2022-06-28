package Ss17_Io_binary_file_serialization.exercise.util;

import Ss17_Io_binary_file_serialization.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {
    public static void writeToFile(String pathFile, List<Product> products) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream=null;
        try {
           fileOutputStream = new FileOutputStream(file);
           objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readDataFromFile(String pathFile) {
        List<Product> products = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream=null;
        try {if (file.length()>0){
           fileInputStream = new FileInputStream(file);
           objectInputStream= new ObjectInputStream(fileInputStream);
           products = (List<Product>) objectInputStream.readObject();
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if (file.length()>0){
                    fileInputStream.close();
                    objectInputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
return products;
    }


}
