import java.sql.*;
public class gourmetInsert {
    static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/mcd";
    static final String USER = "root";
    static final String PASS = "Kermikamya123!";
    public static void main (String []args) throws SQLException, ClassNotFoundException {
        Connection conn=null;
        Statement stmt=null;
        String sql=null;
        String sql_create=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

//            String sql = "CREATE DATABASE mcd";
//            stmt.executeUpdate(sql);
//            System.out.println("Database opened successfully...");
            sql_create="CREATE TABLE gourmet_menu"+
                    "(id INT AUTO_INCREMENT primary key NOT NULL,"+
                    "Item varchar(255) NOT NULL,"+
                    "per_serve_size varchar(255) NOT NULL,"+
                    "Energy_kCal DECIMAL(5,2) NOT NULL,"+
                    "Protein_g DECIMAL(5,2) NOT NULL,"+
                    "Cholesterol_g DECIMAL(5,2) NOT NULL,"+
                    "Carbohydrates_g DECIMAL(5,2) NOT NULL,"+
                    "TotalFats_g DECIMAL(5,2) NOT NULL,"+
                    "TotalSugars_g DECIMAL(5,2) NOT NULL,"+
                    "Price_Rs INTEGER NOT NULL)";
            sql = "INSERT INTO gourmet_menu (Item,per_serve_size, Energy_kCal, Protein_g, TotalFats_g,Cholesterol_g,Carbohydrates_g,TotalSugars_g,Price_Rs)"+
                    "VALUES ('American Triple Cheese Chicken','195 g',457.94,24.43,22.65,71.23,37.45,7.64,400),"+
                    "('American Triple Cheese Veg','207 g',524.69,19.54,23.16,48.74,56.24,7.9,313),"+
                    "('Cheese Lava Burger','240 g',671.06,14.99,33.48,33.21,74.25,16.27,298),"+
                    "('Chicken Cheese Lava Burger','307 g',834.36,27.37,45.18,73.11,76.03,16.75,337),"+
                    "('Chunky Chipotle American Burger Chicken','301 g',641.36,39.47,31.51,110.37,46.24,9.16,268),"+
                    "('McSpicy Premium Chicken Burger','264.5 g',622.25,31.49,34.65,302.61,43.6,6.07,219),"+
                    "('McSpicy Premium Veg Burger','212.5 g',634.71,22.44,39.21,43.68,46,7.57,367),"+
                    "('Piri piri Mc Spicy Chicken Burger','228 g',443.4,25.63,17.3,64.19,43.29,9.29,286),"+
                    "('Piri piri Mc Spicy Veg Burger','211 g',517.98,11.97,24.53,8.1,58.87,12.87,204),"+
                    "('Cheesy Veg Nuggets (6pc)','90 g',252.29,8.48,13.09,20.03,23.6,1.31,234),"+
                    "('Cheesy Veg Nuggets (9pc)','135 g',378.43,12.72,19.63,30.05,35.4,1.96,320)";
            stmt.executeUpdate(sql_create);
            stmt.executeUpdate(sql);
            System.out.println("Table gourmet_menu created");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception se) {
            se.printStackTrace(); //Handle errors for JDBC
        }
        finally{
            try{
                if(sql!=null)
                    conn.close();
            }
            catch(SQLException se){ // do nothing
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace(); }
            //end finally try }//end try System.out.println(&";Goodbye!;);
        }
    }

}

