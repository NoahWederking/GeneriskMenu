import java.util.ArrayList;

public class MenuTest {
    public static void main(String[] args){
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("1: Booking");
        menuItems.add("2: Remove Booking");

        Menu menu = new Menu("===Harrys salon===", menuItems ,"Vælg et nummer:");

        menu.menuPrint();
        menu.menuChoice();



    }
}
