import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


abstract public class Items {
    private Connection conn;
    private Statement stmt;
    private String nutrient;
    private String menuItemName;

    public Items(Connection conn) throws SQLException {
//        super(conn);
        this.conn = conn;
        stmt = conn.createStatement();
    }

//    private Connection conn;
//    private Statement stmt;

    private String Item;
    private String per_serve_size;
    private float Energy_kCal;
    private float Protein_g;
    private float Cholesterol_g;
    private float Carbohydrates_g;
    private float TotalFats_g;
    private float TotalSugars_g;
    private int Price_Rs;

    public Items(String Item, String per_serve_size, float Energy_kCal,float Protein_g,float Cholesterol_g,float Carbohydrates_g,float TotalFats_g,float TotalSugars_g,int Price_Rs) {
        this.Item = Item;
        this.per_serve_size = per_serve_size;
        this.Energy_kCal = Energy_kCal;
        this.Protein_g = Protein_g;
        this.Cholesterol_g = Cholesterol_g;
        this.Carbohydrates_g = Carbohydrates_g;
        this.TotalFats_g = TotalFats_g;
        this.TotalSugars_g = TotalSugars_g;
        this.Price_Rs = Price_Rs;
    }


    public String getItem() {
        return Item;
    }

    public String getper_serve_size() {
        return per_serve_size;
    }

    public float getEnergy_kcal() {
        return Energy_kCal;
    }

    public float getProtein_g() {
        return Protein_g;
    }

    public float getCholesterol_g() {
        return Cholesterol_g;
    }

    public float getCarbohydrates_g() {
        return Carbohydrates_g;
    }

    public float getTotalFats_g() {
        return TotalFats_g;
    }

    public float getTotalSugars_g() {
        return TotalSugars_g;
    }

    public int getPrice_Rs() {
        return Price_Rs;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + Item + '\'' +
                ", perServeSize='" + per_serve_size + '\'' +
                ", energy_kcal=" + Energy_kCal +
                ", protein_g=" + Protein_g +
                ", cholesterol_g=" + Cholesterol_g +
                ", carbohydrates_g=" + Carbohydrates_g +
                ", totalfats_g=" + TotalFats_g +
                ", totalsugars_g=" + TotalSugars_g +
                ", price_rs=" + Price_Rs +
                '}';
    }
    public void showHigh(String menu, String nutrient){
        String sql = "SELECT * FROM "+menu+" ORDER BY " + nutrient + " DESC LIMIT 5;";
        try {

            System.out.println("Top 5 "+menu+"  items with highest " + nutrient + ":");
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("Item") + " - " + rs.getFloat(nutrient) + " " + nutrient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



    public void showLow(String menu, String nutrient){
        String sql = "SELECT * FROM "+menu+" ORDER BY " + nutrient + " ASC LIMIT 5;";
        try {

            System.out.println("Top 5 "+menu+"  items with lowest " + nutrient + ":");
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("Item") + " - " + rs.getFloat(nutrient) + " " + nutrient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void showInfo(String menu, String menuItemName){
        String sql = "SELECT * FROM "+ menu +" WHERE Item = '" + menuItemName + "'";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Name: " + rs.getString("Item"));
                System.out.println("Per serve amount: " + rs.getString("per_serve_size"));
                System.out.println("Calories: " + rs.getFloat("Energy_kCal"));
                System.out.println("Protein: " + rs.getFloat("Protein_g"));
                System.out.println("Cholesterol: " + rs.getFloat("Cholesterol_g"));
                System.out.println("Carbs: " + rs.getFloat("Carbohydrates_g"));
                System.out.println("Fats: " + rs.getFloat("TotalFats_g"));
                System.out.println("Sugars: " + rs.getFloat("TotalSugars_g"));
                System.out.println("Price: " + rs.getInt("Price_Rs"));
            } else {
                System.out.println("Menu item not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}