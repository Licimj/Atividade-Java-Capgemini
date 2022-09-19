
package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * conexão com bancos de dados mysql
 */
public class ConnetcionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/tudoapp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    public static Connection getConnection() {
        
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL,USER, PASS);
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro de conexão com banco de dados", ex);
            
            
        }
        
}
    
public static void closeConnection(Connection connection){
        
            try {
                
                if(connection != null) {
                connection.close();
                }
                
            } catch (Exception ex) {
                throw new RuntimeException("Erro ao fecha conexão com banco de dados ");
                
                
                
            }
}


}
          
    
