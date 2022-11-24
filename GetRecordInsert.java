package com.edubridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GetRecordInsert {

	public static void main(String[] args) {
		String Driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="Punam@123";
		String url="jdbc:mysql://localhost:3306/edubridge";
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName(Driver);
			con=DriverManager.getConnection(url,un,pass);
			st=con.createStatement();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String n=sc.next();
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			System.out.println("Enter salary");
			float sal=sc.nextFloat();
			
			String s="select * from emp1 where Empid="+id;
			//to check whether id is exist or not
			
			rs=st.executeQuery(s);
		//select
			
			if(rs.next()) {
				System.out.println("Employee id is already exist");
				
			
			}//if empid is not exist then go to insert
			
			else {
				String ins="insert into emp1 values("+id+",'"+n+"',"+sal+")";
				
				int i=st.executeUpdate(ins);//insert ,update,delete
				
				if(i>0) {
					System.out.println("Records is inserted");
					
				}else {
					System.out.println("Record not inserted");
				}
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
