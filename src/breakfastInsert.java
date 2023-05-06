import java.sql.*;
public class breakfastInsert {
    static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/mcd";
    static final String USER = "root";
    static final String PASS = "Kermikamya123!";
    public static void main (String []args) throws SQLException, ClassNotFoundException {
        Connection conn=null;
        Statement stmt= null;
        String sql=null;
        String sql_create=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

//            String sql = "CREATE DATABASE mcd";
//            stmt.executeUpdate(sql);
//            System.out.println("Database opened successfully...");
            sql_create="CREATE TABLE breakfast_menu"+
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
            sql = "INSERT INTO breakfast_menu (Item,per_serve_size, Energy_kCal, Protein_g, TotalFats_g,Cholesterol_g,Carbohydrates_g,TotalSugars_g,Price_Rs)"+
                    "VALUES ('Veg McMuffin','119 g',309.35,10.22,11.78,25.31,38.86,3.02,212),"+
                    "('Double Cheese McMuffin','100 g',273.78,9.58,12.82,37.75,29,2.59,357),"+
                    "('Spicy Egg McMuffin','123.2 g',278.27,11.49,11.81,212.61,31.37,2.63,329),"+
                    "('Sausage Mc Muffin','112 g',281.44,16.25,10.81,53.02,28.62,2.38,394),"+
                    "('Sausage Mc Muffin with egg','157 g',290.42,22.46,15.94,264.8,28.87,2.61,354),"+
                    "('Egg McMuffin','112 g',283.46,14.05,12.31,233.3,28.12,2.38,271),"+
                    "('Hot Cake with maple syrup','142 g',432.98,8.6,14.02,28.14,68.01,25.72,209),"+
                    "('Hash Brown','64 g',140.29,1.93,7.32,0.64,15.63,0.32,269),"+
                    "('Espresso','26.5 ml',12.87,0.52,0.03,0.27,2.55,0.13,316),"+
                    "('Espresso Machiato','76.5 ml',44.98,2.09,2.02,6.27,4.97,2.5,265),"+
                    "('Americano (S)','276.5 ml',12.87,0.52,0.03,0.27,2.55,0.13,355),"+
                    "('Americano (R)','347.5 ml',23.07,0.94,0.05,0.48,4.57,0.24,257),"+
                    "('Americano (L)','455 ml',26.71,1.09,0.06,0.55,5.3,0.28,249),"+
                    "('Cappuccino (S)','201.5 ml',125.25,6.02,7.01,21.27,11.02,8.4,361),"+
                    "('Cappuccino (R)','297.5 ml',183.61,8.79,10.02,30.48,16.67,12.05,376)";
            stmt.executeUpdate(sql_create);
            stmt.executeUpdate(sql);
            System.out.println("Table breakfast_menu created");
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
            stmt.close();
            conn.close();
            //end finally try }//end try System.out.println(&quot;Goodbye!&quot;);
        }
    }

}
