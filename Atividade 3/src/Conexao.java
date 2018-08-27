import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** 
 * Atividade: Aplique o padrão Singleton na classe abaixo. 
 *
 **/
public class Conexao {
	
    private Conexao () {   }
    private static Connection con = null;
    private static Conexao conexaoInstance;
    
    public static synchronized Conexao getInstance() throws ClassNotFoundException {
		if(conexaoInstance == null) {
			conexaoInstance = new Conexao();
			System.out.println("Conectando ao banco...");
			try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","usuario","senha");
	    		System.out.println("Conectado.");
			} catch(SQLException e) {
	      		System.out.println(e);
	  		}
		}
		return conexaoInstance;
	}
}
