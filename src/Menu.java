import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private String menuheader;
    private String leadText;
    private int choice = 0;
    private boolean isRunning;
    private boolean isRed = true;
    private ArrayList<String> menuItems ;

    public Menu (String menuheader, ArrayList menuItems, String leadText){
        this.menuheader = menuheader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    public void menuPrint(){
        System.out.println(menuheader);
        for (int i = 0; i < menuItems.size(); i++ ){
            System.out.println(menuItems.get(i));
        }
        System.out.println(leadText);
    }
    // Brug af try catch til at få det rigtige input fra user
   private int readChoice() {
        try{
         choice = scan.nextInt();
        }
        catch (Exception e){
            scan.nextLine();
            System.out.println(leadText);
            readChoice();
        }
        return choice;

    }
    public void menuChoice(){
        do {
            switch (readChoice()) {
                case 1:
                    System.out.println("Booking added");
                    break;
                case 2:
                    System.out.println("Booking removed");
                    break;
                case 3:
                    System.out.println("Program ended");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }while (!isRunning);
    }
    @Override
    public String toString() {
        return "Menu{" +
                "scan=" + scan +
                ", menuheader='" + menuheader + '\'' +
                ", leadText='" + leadText + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
