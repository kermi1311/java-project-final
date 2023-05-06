import java.sql.Connection;
import java.sql.Statement;

public class MenuItems {
    private String Item;
    private String per_serve_size;
    private float Energy_kCal;
    private float Protein_g;
    private float Cholesterol_g;
    private float Carbohydrates_g;
    private float TotalFats_g;
    private float TotalSugars_g;
    private int Price_Rs;

    public MenuItems(String Item, String per_serve_size, float Energy_kCal,float Protein_g,float Cholesterol_g,float Carbohydrates_g,float TotalFats_g,float TotalSugars_g,int Price_Rs) {
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

    public MenuItems(Connection conn) {
    }

    public MenuItems(Statement stmt) {
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
        return "MenuItems{" +
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
}