package com.weikun.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class B {//存储过程和函数
	public static void main(String[] args) {
		new B().execProc();
	}
	public void execFun(){
		
		
		Connection conn=null;
		CallableStatement cs=null;
		
		try {//1把驱动加入到内存
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.3.31:3306/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			cs=conn.prepareCall("{?=call f_1(?)}");
			cs.registerOutParameter(1, java.sql.Types.INTEGER);	
			
			cs.setString(2, "%日本%");//输入参数中		
					
			cs.execute();			
			
			System.out.println(cs.getInt(1));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			if(cs!=null){
				try {
					cs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void execProc(){
		Connection conn=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		try {//1把驱动加入到内存
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.3.31:3306/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			cs=conn.prepareCall("{call p_1(?,?,?)}");
			
			cs.setString(1, "%f%");//输入参数中		
			cs.setString(2, "%日本%");//输入参数中		
			cs.registerOutParameter(3, java.sql.Types.INTEGER);			
			boolean flag=cs.execute();			
			while(flag){
				rs=cs.getResultSet();
				System.out.println(cs.getInt(3));				
				while(rs.next()){
					System.out.println(rs.getString("title"));					
				}			
				System.out.println("----->");
				flag=cs.getMoreResults();//是否有更多的结果集
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(cs!=null){
				try {
					cs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
