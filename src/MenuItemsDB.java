//import java.sql.*;
//import java.util.*;
//public class MenuItemsDB {
//    static final String DB_URL = "jdbc:mysql://localhost/mcd";
//    static final String DB_USER = "root";
//    static final String DB_PASS = "";
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//            System.out.println("Connected to database!");
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Select what menu you want to order from:");
//            System.out.println("breakfast_menu"+"\ncondiments_menu" +"\ngourmet_menu"+"\nmc_cafe_menu"+"\nmenu_items "+"\nregular_menu");
//            System.out.print("\nEnter your choice: ");
//            String menu = scanner.nextLine();
//
//            Scanner scanner1 = new Scanner(System.in);
//            System.out.print("Enter nutrient to search for (energy_kcal/protein_g/cholesterol_g/carbohydrates_g/totalfats_g/totalsugars_g): ");
//            String nutrient = scanner1.nextLine();
//
//            Statement stmt = conn.createStatement();
//            String sql = "SELECT * FROM "+ menu+ " order by " + nutrient + " desc limit 5;";
////            select * from regular_menu order by protein_g desc limit 5;
//            ResultSet rs = stmt.executeQuery(sql);
//
//            System.out.println("Top 5 " + menu + " items with " + nutrient );
//            while (rs.next()) {
//                System.out.println(rs.getString("menu_items") + " - " + rs.getInt(nutrient) + " " + nutrient);
//            }
//
//            System.out.print("Enter menu item to get more information: ");
//            String menuItemName = scanner.nextLine();
//            sql = "SELECT * FROM menu_items WHERE menu_items = '" + menuItemName + "'";
//            rs = stmt.executeQuery(sql);
//
//            if (rs.next()) {
//                System.out.println("Name: " + rs.getString("menu_items"));
//                System.out.println("Per serve amount: " + rs.getString("per_serve_size"));
//                System.out.println("Calories: " + rs.getFloat("Energy_kCal"));
//                System.out.println("Protein: " + rs.getFloat("protein_g"));
//                System.out.println("Cholesterol: " + rs.getFloat("cholesterol_g"));
//                System.out.println("Carbs: " + rs.getFloat("carbohydrates_g"));
//                System.out.println("fats: " + rs.getFloat("totalfats_g"));
//                System.out.println("sugars: " + rs.getFloat("totalsugars_g"));
//                System.out.println("Price: " + rs.getInt("price_rs"));
//            } else {
//                System.out.println("Menu item not found!");
//            }
//
//            rs.close();
//            stmt.close();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}