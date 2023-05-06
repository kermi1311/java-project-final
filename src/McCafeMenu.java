import java.sql.*;

public class McCafeMenu extends Items implements Top_items, Low_items, Item_info {
    //    private Connection conn;
    private Statement stmt;
    private String nutrient;
    private String menuItemName;
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mcd", "root", "Kermikamya123!");


    public McCafeMenu(Connection conn) throws SQLException {
        super(conn);
        this.conn = conn;
        this.stmt = conn.createStatement();
    }

    public void setNutrient(String nutrient) {
        this.nutrient = nutrient;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void showLow() {

    }

    @Override
    public void showTop() {

    }


}