package com.jdbc.project;

	import java.sql.Connection;
    import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	
	public class ConnectionJdbc {
	private String dburl="jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";
	private String dbuname="mysql_demo_tnj";
	private String dbpassword= "Ebrain@20";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String  dbdriver) {
	try {
	    Class.forName(dbdriver);
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	}
	public Connection getConnection() {
		Connection conn=null;
	      
	try {
	    conn=DriverManager.getConnection(dburl, dbuname, dbpassword);
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	    return conn;
	     
	}
	public String save(Member member) {
		// TODO Auto-generated method stub
	     loadDriver(dbdriver);
	     Connection conn=getConnection();
	     String result="value entered Successfully";
	     String sql="insert into tb_desapriyan_Jdbc(Name,Email,Phone) values (?,?,?)";
	     
	     try {
	        PreparedStatement ps=conn.prepareStatement(sql);
	        ps.setString(1,member.getName());
	        ps.setString(2,member.getEmail());        
	        ps.setString(3,member.getPhone());
	        ps.executeUpdate();
	        
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        result="value not entered";
	    }
		return result ;
	}
	
		
	}

