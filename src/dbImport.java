import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class dbImport {
    static final String DB_URL = "jdbc:mysql://localhost/Mcd_db";
    static final String USER = "root";
    static final String PASS = "Kermikamya123!";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Open a connection
        Connection conn=null;
        Statement stmt=null;
        String sql=null;
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

//            String sql = "CREATE DATABASE mcd";
//            stmt.executeUpdate(sql);
            System.out.println("Database opened successfully...");
//             sql ="CREATE TABLE menu_items"+
//                    "(id INT AUTO_INCREMENT primary key NOT NULL,"+
//                    "Menu_Category varchar(255) NOT NULL,"+
//                    "Item varchar(255) NOT NULL,"+
//                    "per_serve_size varchar(255) NOT NULL,"+
//                    "Energy_kCal DECIMAL(5,2) NOT NULL,"+
//                    "Protein_g DECIMAL(5,2) NOT NULL,"+
//                    "Cholesterol_g DECIMAL(5,2) NOT NULL,"+
//                    "Carbohydrates_g DECIMAL(5,2) NOT NULL,"+
//                    "TotalFats_g DECIMAL(5,2) NOT NULL,"+
//                    "TotalSugars_g DECIMAL(5,2) NOT NULL,"+
//                    "Price_Rs INTEGER NOT NULL)";
//            stmt.executeUpdate(sql);
//            System.out.println("Table menu_items created");

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception se) {
            se.printStackTrace(); //Handle errors for JDBC
        }
        finally{
//            try{
//                if(sql!=null)
//                    conn.close();
//            }
//            catch(SQLException se){ // do nothing
//            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace(); }
        }
    }
}

