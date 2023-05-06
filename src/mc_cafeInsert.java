import java.sql.*;
public class mc_cafeInsert {
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
            sql_create="CREATE TABLE mc_cafe_menu"+
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
            sql = "INSERT INTO mc_cafe_menu (Item,per_serve_size, Energy_kCal, Protein_g, TotalFats_g,Cholesterol_g,Carbohydrates_g,TotalSugars_g,Price_Rs)"+
                    "VALUES ('Cappuccino (L)','355 ml',219.36,10.51,12.03,36.55,19.81,14.45,336),"+
                    "('Latte (S)','236.5 ml',147.72,7.12,8.41,25.47,12.71,10.06,279),"+
                    "('Latte (R)','307.5 ml',190.03,9.1,10.42,31.68,17.15,12.52,352),"+
                    "('Latte (L)','375 ml',232.2,11.14,12.82,38.95,20.77,15.4,263),"+
                    "('Flat White (S)','266.5 ml',166.99,8.06,9.6,29.07,14.16,11.47,243),"+
                    "('Flat White (R)','347.5 ml',215.72,10.36,12.02,36.48,19.08,14.41,366),"+
                    "('Flat White (L)','405 ml',251.47,12.08,14.02,42.55,22.22,16.81,342),"+
                    "('Mocha (S)','242.5 ml',185.85,7.15,8.2,24.43,22.59,17.57,280),"+
                    "('Mocha (R)','311.5 ml',244,8.99,9.91,29.52,31.72,23.56,273),"+
                    "('Mocha (L)','377 ml',302.02,10.88,12.01,35.67,40.04,29.96,398),"+
                    "('Babycino','127 ml',143.5,3.87,4.38,12.27,22.85,18.53,271),"+
                    "('Hot Chocolate (S)','223 ml',239.42,6.73,7.77,22.03,37.08,30.31,306),"+
                    "('Hot Chocolate (R)','259 ml',296.81,7.7,8.76,24.59,48.41,39.24,300),"+
                    "('Hot Chocolate (L)','367 ml',383.29,11.01,12.84,36.67,58.43,47.96,263),"+
                    "('Premium Dark Hot Chocolate','153 ml',214.21,6.15,5.96,14.73,33.04,25.73,376),"+
                    "('Double Dark Hot Chocolate','163 ml',255.78,6.87,6.32,14.83,41.29,31.81,274),"+
                    "('English Breakfast (S)','279 ml',9.93,0.56,0.28,2.79,0.28,1.4,259),"+
                    "('English Breakfast (R)','330 ml',11.75,0.66,0.33,3.3,0.33,1.65,315),"+
                    "('English Breakfast (L)','456 ml',16.23,0.91,0.46,4.56,0.46,2.28,260),"+
                    "('Moroccon Mint Green Tea (S)','279 ml',6.25,0.33,0.28,2.79,2.79,1.4,279),"+
                    "('Moroccon Mint Green Tea (R)','330 ml',7.39,0.4,0.33,3.3,3.3,1.65,200),"+
                    "('Moroccon Mint Green Tea (L)','456 ml',10.21,0.55,0.46,4.56,4.56,2.28,257),"+
                    "('Strawberry Green Tea (S)','279 ml',7.03,0.47,0.28,2.79,2.79,1.4,392),"+
                    "('Strawberry Green Tea (R)','330 ml',8.32,0.56,0.33,3.3,3.3,1.65,355),"+
                    "('Strawberry Green Tea (L)','456 ml',11.49,0.78,0.46,4.56,4.56,2.28,383),"+
                    "('Lemon Ice Tea','245 ml',121.86,0.27,0.17,1.65,30.59,26.53,203),"+
                    "('Strawberry Ice Tea','236.5 ml',94.95,0.24,0.16,1.57,24.17,21.1,338),"+
                    "('Green Apple Ice Tea','236.5 ml',94.94,0.24,0.16,1.57,24.17,20.75,278),"+
                    "('Iced Coffee','291.5 ml',185.34,4.36,4.45,12.13,31.88,26.95,294),"+
                    "('Cold Coffee Frappe','296.5 ml',331.17,4.98,14.73,9.18,45.39,35.57,307),"+
                    "('Mocha Frappe','320.5 ml',397.98,5.49,15.01,9.42,60.93,47.55,354),"+
                    "('Chocolate Oreo Frappe','334 ml',481.11,6.03,18.89,9.36,72.51,55.14,391),"+
                    "('Strawberry Shake','259 ml',255.51,3.67,7.44,8.39,44.07,37.42,320),"+
                    "('Chocolate Shake','259 ml',270.9,4.16,7.7,8.39,46.76,37.78,255),"+
                    "('Mango Smoothie','280 ml',231.44,3.21,3.63,9.89,46.25,38.87,369),"+
                    "('Mixed Berry Smoothie','290 ml',235.43,3.33,3.59,9.99,47.16,43,245),"+
                    "('Raw Mango Cooler','310 ml',102.38,0.14,0.04,0.4,25.18,21.06,216),"+
                    "('Mix Berry Cooler','310 ml',103.85,0.16,0.04,0.4,25.56,21.25,305),"+
                    "('Sweet Lime Beverage','310 ml',128.21,0.07,0.08,0,31.72,28.72,275),"+
                    "('Iced Americano','266.5 ml',150.85,3.59,3.57,9.76,26.01,21.58,398),"+
                    "('American Mud Pie Shake','317 ml',398.19,5.67,12.77,10.89,64.75,53.4,363),"+
                    "('Soft serve cone','81.29 g',85.73,1.99,1.82,4.75,15.23,10.68,227),"+
                    "('McSwirl ChocoDip','93.29 g',160.14,2.71,7.14,5.71,20.92,15.39,360),"+
                    "('Regular Soft Serve: Hot Fudge','91.79 g',121.64,2.25,4.02,5.85,19.11,17.07,296),"+
                    "('Medium Soft Serve: Hot Fudge','132.08 g',197.45,3.49,6.87,8.55,30.42,27.01,400),"+
                    "('Regular Soft Serve: Strawberry','91.79 g',100.99,1.54,1.77,4.85,19.78,17.66,241),"+
                    "('Medium Soft Serve: Strawberry','132.08 g',156.14,2.05,2.36,6.55,31.77,28.2,302),"+
                    "('Regular Soft Serve: Brownie with Hot Fudge','110.79 g',205.26,3.2,5.45,6.04,35.26,20.75,390),"+
                    "('Medium Soft Serve: Brownie with Hot Fudge','155.08 g',311.39,4.65,7.46,7.78,55.24,27.94,395),"+
                    "('Regular Blackforest','125.79 g',237.89,3.22,5.47,6.19,43.42,27.79,239),"+
                    "('Medium Blackforest','200.08 g',429.95,5.42,9.76,9.23,79.04,48.45,397)";
            stmt.executeUpdate(sql_create);
            stmt.executeUpdate(sql);
            System.out.println("Table mc_cafe_menu created");
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

