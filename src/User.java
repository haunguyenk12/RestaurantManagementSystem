import java.util.ArrayList;

public class User {
    private String name;
    private String password;
    public ArrayList<Menu> menuItems;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void displayRestaurantDetails(Restaurant restaurant){
        System.out.println("Welcom to Restaurant");
        System.out.println("We are in ");
    }

    public void displayMenu(Menu menu){

    }

    public void manageOrders(Order[] order){
        
    }
}
