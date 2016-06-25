package com.aranea.db;

import java.util.ArrayList;
import java.sql.*;

import com.aranea.rep.Manager;

public class Dbconn {

	private final String host = "jdbc:mysql://localhost:3306/reports";
			//"root", "pass"";
	
	
	
	private final String userName = "root";
	private final String password = "akmli6964";
	
	
	
	//*******************************************************************************************************************
	/* ADD MANAGER*/
    public void insertData(int id,String f_name,String l_name,String u_name, String pass,String priv,String data_auth,String archive) throws SQLException{
    Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e){
		   e.printStackTrace();
		}
		try{
			conn = DriverManager.getConnection(host,userName, password);
		} 
		catch (SQLException e){
			e.printStackTrace();
		}
		 
		Statement st = conn.createStatement();
		String sql = "INSERT INTO rep_manager (f_name,l_name,uname,pass,md5_pass,priv_id,data_auth,archive) VALUES" + "('"+ f_name + "','" + l_name + "','" + u_name + "','" + pass + "','"+ pass + "','" + priv + "','" + data_auth  + "','" + archive + "')";
		System.out.println(sql);
		st.executeUpdate(sql);
    }
    
    /* END OF ADDING MANAGER */
    //*******************************************************************************************************************
    /*REPLACE MANAGER*/
    public void replaceData(String edit_f_name,String edit_l_name,String edit_u_name, String edit_pass,String edit_priv) throws SQLException{
            Connection conn=null;
            String sql = "UPDATE rep_manager SET " + "f_name='" + edit_f_name  + "',l_name='" + edit_l_name 
				+ "',pass='" + edit_pass+ "',priv_id='" + edit_priv + "'" +  " WHERE uname = " + "'" + edit_u_name + "';";
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    		} 
    		catch (ClassNotFoundException e) {
    			e.printStackTrace();
    		}
    		try {
    			
    			conn = DriverManager.getConnection(host,userName, password);
    		} 
    		catch (SQLException e) {
    			e.printStackTrace();
    		}
    		Statement st = conn.createStatement();
    		st.executeUpdate(sql);
        }
    /*END OF REPLACING MANAGER*/
    
    //****************************************************************************************************************
    /*DELATE MANAGER*/
     
    public void delateData(String u_name) throws SQLException{
        Connection conn=null;
        
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(host,userName, password);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		Statement st = conn.createStatement();
		String sql = "DELETE FROM rep_manager WHERE uname = '" + u_name + "';";
		System.out.println(sql);
	    st.executeUpdate(sql);
    }
    
    /*END OF DELATING MANGER*/
    //****************************************************************************************************************
    /*SELECT TABEL MANAGER*/
	    public ArrayList<Manager> getMangerList() throws SQLException{
		ArrayList<Manager> manArr = new ArrayList<>();
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(host,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		Statement st = conn.createStatement();
		
		String query = "select * from rep_manager";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()){
			
			int id=rs.getInt(1);
			String f_name = rs.getString(2);
			String l_name = rs.getString(3);
			String uname = rs.getString(4);
			String pass = rs.getString(5);
			String md5_pass = rs.getString(6);
			int priv_id=rs.getInt(7);
			java.sql.Date data_auth = rs.getDate(8);
			int archive = rs.getInt(9);
			
			Manager m1 = new Manager(id,f_name,l_name,uname,pass,md5_pass,priv_id,data_auth,archive);
			manArr.add(m1);

		}
		
		return manArr;
	}
	/*END OF SELECTING NAME OF MANAGER*/
}
