package Persistance;

import Bussiness.Product;
import Bussiness.ProductManager;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private Gson gson;

    public ProductDAO() { this.gson = new Gson();}

    public ArrayList<Product> readFile(){
        Product[] productList = null;

        System.out.println("Loading file...");
        try {
            productList = gson.fromJson(new FileReader("products.json"), Product[].class);
            ArrayList<Product> products = new ArrayList<>(List.of(productList));
            return products;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
