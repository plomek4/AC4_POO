package Presentation;

import Bussiness.ProductManager;
import Persistance. ProductDAO;
import java.time.LocalDate;

public class Controller {
    private static final int SHOW_PROGRESS = 1;
    private static final int EXIT_MENU = 2;

    private Menu menu;
    private ProductManager productManager;

    public Controller(Menu menu) {
        this.menu = menu;
        this.productManager = new ProductManager(new ProductDAO());
    }

    public void run() {
        int option;

        do {
            menu.showMenu();
            option = menu.askForInteger("Enter an option: ");

            runOption(option);
        } while (option != EXIT_MENU);
    }

    private void runOption(int option) {
        switch (option) {
            case SHOW_PROGRESS -> showProgress();
            case EXIT_MENU -> exitMenu();
            default -> menu.showMessage("Wrong option. Enter a number from 1 to 2, both included");
        }
    }

    private void showProgress() {
        productManager.showProducts();
    }


    private void exitMenu() {
        menu.spacing();
        menu.showMessage("Stopping all workers... Bye!");
    }
}