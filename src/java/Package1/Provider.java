package Package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Provider {
	static Connection cn;

    /**
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConn() throws SQLException{
		cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
		return cn;
	}
		static{
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
