package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		
	}
	
	public static Connection getConnection(){
		
		return null;
	}

	public static void closeAll(ResultSet rs,Statement stat,Connection conn){
		
	}
	
	public static int executeUpdate(String sql, Object... params) throws SQLException{
		Connection conn=null;
		
		PreparedStatement pstat=null;
			conn=getConnection();
			pstat=conn.prepareStatement(sql);
			for(int i=0;i<params.length;i++){
				pstat.setObject(i+1, params[i]);
			}
			
			int rs=pstat.executeUpdate();
			
			closeAll(null,pstat,conn);
			return rs;
	}
	
	
	
}
