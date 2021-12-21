package Bussiness;

import Persistance.ProductDAO;
import Presentation.Menu;
import java.util.ArrayList;


public class ProductManager {
    private ArrayList<Product> productList;

    private Menu menu = new Menu();

    public ProductManager(ProductDAO productDAO) {
        this.productList = productDAO.readFile();
    }


    public void showProducts(){
        for (Product p : productList){
            menu.showMessage(p.getName());
            menu.spacing();

        }
    }
}
