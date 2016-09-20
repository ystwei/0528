package com.weikun.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A {
	public static void main(String[] args) {
		new A().queryAll();
	}
	public void queryAll(){
		Connection conn=null;
		PreparedStatement pstmt=null;	
		ResultSet rs=null;
		try {
			//1
			Class.forName("org.gjt.mm.mysql.Driver");
			//2
			conn=DriverManager.getConnection("jdbc:mysql://192.168.3.14:3306/bz?useUnicode=true&characterEncoding=utf-8", "root","root");			
			//3
			String sql="select * from customers ";
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			//4遍历结果集
			
			while(rs.next()){
				
				System.out.printf("%s\t -->  \t  %s \n", rs.getString("cust_name"), rs.getString("cust_address"));
			}
			
			
		} catch (Exception e) {
			// TODO: handl exception
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
			if(pstmt!=null){
				try {
					pstmt.close();
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
	public void update(){//修改数据		
		Connection conn=null;
		PreparedStatement pstmt=null;	
		try {
			//1
			Class.forName("org.gjt.mm.mysql.Driver");
			//2
			conn=DriverManager.getConnection("jdbc:mysql://192.168.3.14:3306/bz?useUnicode=true&characterEncoding=utf-8", "root","root");			
			//3
			String sql="update company set fname=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "黑龙江");
			pstmt.setInt(2, 50);
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
			
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				try {
					pstmt.close();
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

	public void del(){//删除数据
		
		Connection conn=null;
		PreparedStatement pstmt=null;	
		try {
			//1
			Class.forName("org.gjt.mm.mysql.Driver");
			//2
			conn=DriverManager.getConnection("jdbc:mysql://192.168.3.14:3306/bz?useUnicode=true&characterEncoding=utf-8", "root","root");
			
			//3
			String sql="delete from company where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 45);
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
			
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				try {
					pstmt.close();
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
	public void add(){//增加数据
		Connection conn=null;
		PreparedStatement pstmt=null;//执行sql
		try {			
			//1加载驱动			
			Class.forName("org.gjt.mm.mysql.Driver");			
			//2做连接			
			conn=DriverManager.getConnection("jdbc:mysql://192.168.3.14:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			//3执行sql
			
			String sql="insert into company(fname,email) values(?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "哈尔滨");
			pstmt.setString(2, "123@123.com");
			
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{//4关闭
			if(pstmt!=null){
				try {
					pstmt.close();
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
