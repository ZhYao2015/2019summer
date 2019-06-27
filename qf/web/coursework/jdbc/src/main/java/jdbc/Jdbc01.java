package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement stat=null;
		ResultSet rs=null;
		//register the driver
		try {
			//is that necessary in the new version
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost/myshop?serverTimezone=GMT%2B1","root","Codenachmit1!");
			//create statement, (statement or prepared statement)
			//stat=conn.createStatement();

						
//			stat=conn.prepareStatement("select * from Products where ? = ? ;");
//			//silly!!! stat.setString(1, "category_id");
//			stat.setString(1, "category_id");
//			stat.setString(2, "'c001'");
//			//output: select * from Products where 'category_id' = 'c001'; .......
			
			stat=conn.prepareStatement("select * from Products where category_id = ? ;");
			stat.setString(1, "c001");
			
			
			rs=stat.executeQuery();
			
			//the result set cursor is initially positioned before the first row
			//logic!logic!logic!logic!logic!
			if(rs.next()==false){
				System.out.println("Empty result.");
			}else{
				System.out.println(rs.getString(1)+","+rs.getString(2)+","
						+ rs.getInt(3)+","+rs.getString(4));
				while(rs.next()){
					System.out.println(rs.getString(1)+","+rs.getString(2)+","
							+ rs.getInt(3)+","+rs.getString(4));
				}
			}
			
//			rs=stat.executeQuery("show tables");
//			
//			while(rs.next()){
//				System.out.println(rs.getString(1));
//			}
			
			
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
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
