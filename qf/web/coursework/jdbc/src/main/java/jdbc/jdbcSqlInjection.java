package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcSqlInjection {
	
	
	//Dont forget the main!!!!!!!!
	public static void main(String[] args) {
	
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;

		String username=null;
		String password=null;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/myshop?serverTimezone=GMT%2B1",
					"root","Codenachmit1!");
			
			Scanner input=new Scanner(System.in);
			System.out.println("username:");
			//differences next() nextLine()
			username=input.nextLine();
			System.out.println("password:");
			password=input.nextLine();
			
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from login where binary username='"+username+"' and binary password='"+password+"';");
			
			if(rs.next()==false){
				System.out.println("Denied");
			}else{
				System.out.println("Accessed");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
