package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetRecord {

	public static void main(String[] args) {
		/* load the driver
		 * Make the connection
		 * create a statement
		 * execute query
		 */
		
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="Punam@123";
		String url="jdbc:mysql://localhost:3306/edubridge";
		
		try {
			//Load the driver 
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pass);
			Statement st=con.createStatement();
			String s="select * from emp1";
			ResultSet rs=st.executeQuery(s);
			System.out.println("Empid\tEmpname\tEmpsal\t");
			System.out.println("----------------------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Empid")+"\t"+rs.getString("Empname")+"\t"+rs.getFloat("Empsal"));
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			}
	}

}
