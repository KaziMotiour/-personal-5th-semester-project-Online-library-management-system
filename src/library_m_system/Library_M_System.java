package library_m_system;

import java.sql.*;
import javax.swing.*;
public class Library_M_System {
    Connection con;
   
  public static Connection connectDB()
  {
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root", "");
            
          return con;
        
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
      return null;
  }
    
}
