import java.sql.*;
public class regularInsert extends dbImport{
    static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/mcd";
    static final String USER = "root";
    static final String PASS = "Kermikamya123!";
    public static void main (String []args) throws SQLException, ClassNotFoundException {
        Connection conn=null;
        Statement stmt1= null;
        String sql1=null;
        String sql_create=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt1 = conn.createStatement();

//            String sql = "CREATE DATABASE mcd";
//            stmt.executeUpdate(sql);
//            System.out.println("Database opened successfully...");
            sql_create="CREATE TABLE regular_menu"+
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
            sql1 = "INSERT INTO regular_menu (Item,per_serve_size, Energy_kCal, Protein_g, TotalFats_g,Cholesterol_g,Carbohydrates_g,TotalSugars_g,Price_Rs)"+
                    "VALUES ('McVeggie™️ Burger','168 g',402.05,10.24,13.83,2.49,56.54,7.9,200),"+
                    "('McAloo Tikki Burger','146 g',339.52,8.5,11.31,1.47,50.27,7.05,250),"+
                    "('McSpicy™️ Paneer Burger','199 g',652.76,20.29,39.45,21.85,52.33,8.35,320),"+
                    "('Spicy Paneer Wrap','250 g',674.68,20.96,39.1,40.93,59.27,3.5,100),"+
                    "('American Veg Burger','177 g',512.17,15.3,23.45,25.24,56.96,7.85,300),"+
                    "('Veg Maharaja Mac','306 g',832.67,24.17,37.94,36.19,93.84,11.52,236),"+
                    "('Green Chilli Aloo Naan','132 g',356.09,7.91,15.08,9.45,46.36,4.53,355),"+
                    "('Pizza Puff','87 g',228.21,5.45,11.44,5.17,24.79,2.73,381),"+
                    "('Mc chicken Burger','173 g',400.8,15.66,15.7,31.17,47.98,5.53,306),"+
                    "('FILLET-O-FISH Burger','136 g',348.11,15.44,14.16,32.83,38.85,5.58,220),"+
                    "('Mc Spicy Chicken Burger','186 g',451.92,21.46,19.36,66.04,46.08,5.88,296),"+
                    "('Spicy Chicken Wrap','257 g',567.19,23.74,26.89,87.63,57.06,2.52,371),"+
                    "('Chicken Maharaja Mac','296 g',689.12,34,36.69,81.49,55.39,8.92,357),"+
                    "('American Chicken Burger','165 g',446.95,20.29,22.94,47.63,38.54,7.48,323),"+
                    "('Chicken Kebab Burger','138 g',357.05,8.64,14.02,1.51,47.9,5.08,310),"+
                    "('Green Chilli Kebab naan','138 g',230.95,5.67,9.32,8.74,31.06,3.64,266),"+
                    "('Mc Egg Masala Burger','126.2 g',290.42,12.45,12.27,213.09,32.89,4.89,367),"+
                    "('Mc Egg Burger for Happy Meal','123 g',282.98,12.29,12.21,213.09,31.32,4.66,369),"+
                    "('Ghee Rice with Mc Spicy Fried Chicken 1 pc','325 g',720.3,26.91,29.2,31.32,77.47,3.28,346),"+
                    "('McSpicy Fried Chicken 1 pc','115 g',248.76,17.33,14.29,31.11,12.7,0.58,245),"+
                    "('4 piece Chicken McNuggets','64 g',169.68,10.03,9.54,24.66,10.5,0.32,331),"+
                    "('6 piece Chicken McNuggets','96 g',254.52,15.04,14.3,36.99,15.74,0.48,281),"+
                    "('9 piece Chicken McNuggets','144 g',381.77,22.56,21.46,55.48,23.62,0.72,313),"+
                    "('2 piece Chicken Strips','58 g',164.44,10.17,12.38,30.1,2.68,0.29,380),"+
                    "('3 piece Chicken Strips','87 g',246.65,15.26,18.57,45.15,4.02,0.44,388),"+
                    "('5 piece Chicken Strips','145 g',411.09,25.43,28.54,6.7,0.73,0.72,204),"+
                    "('Regular Fries','77 g',224.59,3.38,10.39,0.77,27.08,0.39,400),"+
                    "('Medium Fries','109 g',317.92,4.79,14.7,1.09,38.34,0.55,347),"+
                    "('Large Fries','154 g',449.17,6.76,20.77,1.54,54.16,0.77,323),"+
                    "('Regular Wedges','114 g',204.65,3.97,7.15,0.97,28.74,0.48,344),"+
                    "('Medium Wedges','156 g',280.05,5.44,9.79,1.33,39.33,0.66,205),"+
                    "('Large Wedges','216 g',387.76,7.53,13.55,1.84,54.46,0.92,258),"+
                    "('L1 Coffee','200 ml',6.8,0,0,0,1.7,0,313),"+
                    "('L1 Coffee with milk','205 ml',35.8,1,2,6,1.6,3.45,310),"+
                    "('Double Chocochips Muffin','80 g',341.68,5.13,17.28,15.96,40.13,29.44,272),"+
                    "('Vanilla Chocochips Muffin','80 g',329.29,4.48,15.46,78.52,40.13,29.6,211)";
            stmt1.executeUpdate(sql_create);
            stmt1.executeUpdate(sql1);
            System.out.println("Table regular_menu created");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception se) {
            se.printStackTrace(); //Handle errors for JDBC
        }
        finally{
            try{
                if(sql1!=null)
                    conn.close();
            }
            catch(SQLException se){ // do nothing
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace(); }
            //end finally try }//end try System.out.println(&quot;Goodbye!&quot;);
        }
        stmt1.close();
        conn.close();
    }

}

