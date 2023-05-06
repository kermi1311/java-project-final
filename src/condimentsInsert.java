import java.sql.*;
public class condimentsInsert {
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
            sql_create="CREATE TABLE condiment_menu"+
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
            sql = "INSERT INTO condiment_menu (Item,per_serve_size, Energy_kCal, Protein_g, TotalFats_g,Cholesterol_g,Carbohydrates_g,TotalSugars_g,Price_Rs)"+
                    "VALUES ('Mustard diping sauce','25 g',81.18,0.52,5.57,0.29,7.24,6.66,262),"+
                    "('BBQ diping sauce','25 g',54.89,0.26,0.49,0.25,12.36,7.65,338),"+
                    "('Chilli Sauce','10 g',8.07,0.03,0.01,0.1,1.99,1.53,368),"+
                    "('Piri Piri Mix','5 g',17.13,0.51,0.36,0.05,2.5,0.66,294),"+
                    "('Tomato Ketchup Sachets','8 g',11.23,0.08,23.45,0.08,2.63,2.33,224),"+
                    "('Maple Syrup','30 g',86.4,0,0,0.3,21.6,16.2,369),"+
                    "('Cheese Slice','14 g',51.03,3.06,3.99,13.43,0.72,0.54,264),"+
                    "('Sweet Corn','40 g',45.08,1.47,1,2,7.55,2.54,294),"+
                    "('Mixed Fruit Beverage','180 ml',72.25,0.65,0.02,0.01,18,16.83,266)";
            stmt.executeUpdate(sql_create);
            stmt.executeUpdate(sql);
            System.out.println("Table condiment_menu created");
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

