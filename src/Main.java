import java.sql.*;
import java.util.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/mcd";
    static final String DB_USER = "root";
    static final String DB_PASS = "Kermikamya123!";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connected to database!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select what menu you want to order from:");
            System.out.println("breakfast_menu\ncondiments_menu\ngourmet_menu\nmc_cafe_menu\nmenu_items \nregular_menu");
            System.out.print("\nEnter your choice: ");
            String menu = scanner.nextLine();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter nutrient to search for (energy_kcal/protein_g/cholesterol_g/carbohydrates_g/totalfats_g/totalsugars_g): ");
            String nutrient = scanner1.nextLine();
            try{
                switch (menu) {
                    case "breakfast_menu" -> {
                        BreakfastMenu breakfastmenu = new BreakfastMenu(conn);
                        breakfastmenu.showHigh(menu, nutrient);
                        breakfastmenu.showLow(menu, nutrient);
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Enter menu item to get more information: ");
                        String menuItemName = scanner2.nextLine();
                        breakfastmenu.showInfo(menu, menuItemName);
                    }
                    case "condiments_menu" -> {
                        CondimentsMenu condimentsmenu = new CondimentsMenu(conn);
                        condimentsmenu.showHigh(menu, nutrient);
                        condimentsmenu.showLow(menu, nutrient);
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Enter menu item to get more information: ");
                        String menuItemName = scanner2.nextLine();
                        condimentsmenu.showInfo(menu, menuItemName);
                    }
                    case "gourmet_menu" -> {
                        GourmetMenu gourmetmenu = new GourmetMenu(conn);
                        gourmetmenu.showHigh(menu, nutrient);
                        gourmetmenu.showLow(menu, nutrient);
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Enter menu item to get more information: ");
                        String menuItemName = scanner2.nextLine();
                        gourmetmenu.showInfo(menu, menuItemName);
                    }
                    case "mc_cafe_menu" -> {
                        McCafeMenu mccafemenu = new McCafeMenu(conn);
                        mccafemenu.showHigh(menu, nutrient);
                        mccafemenu.showLow(menu, nutrient);
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Enter menu item to get more information: ");
                        String menuItemName = scanner2.nextLine();
                        mccafemenu.showInfo(menu, menuItemName);
                    }
                    case "regular_menu" -> {
                        RegularMenu regularmenu = new RegularMenu(conn);
                        regularmenu.showHigh(menu, nutrient);
                        regularmenu.showLow(menu, nutrient);
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Enter menu item to get more information: ");
                        String menuItemName = scanner2.nextLine();
                        regularmenu.showInfo(menu, menuItemName);
                    }
                }
            } catch (Exception e){
                System.out.println("Wrong Menu input");
                e.printStackTrace();
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}