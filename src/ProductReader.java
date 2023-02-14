import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class ProductReader {
    public static ArrayList<Product> readProductsFromFile(String fileName) {
        //Declear ArrayList Scanner//
        ArrayList<Person> product = new ArrayList<>();

        //Try Catch Block//
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            //while loop to read the data//
            while ((line = br.readLine()) != null) {

                //Use String[] fields to read UserInput///
                String[] fields = line.split(",");
                String Name = fields[0];
                String ID = fields[1];
                String Description = fields[2];
                Double Cost = Double.parseDouble(fields[3]);

                //How u Want Your Output to be like///
                Product products = new Product(ID, Name, Description, Cost);
                products.add(product);


            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return products;
    }






}
