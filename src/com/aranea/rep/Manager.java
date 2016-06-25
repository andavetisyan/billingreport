package com.aranea.rep;

public class Manager {
	
	private int id;
	private String f_name;
	private String l_name;
	private String uname;
	private String pass;
	private String md5_pass;
	private int priv_id;
	private java.sql.Date data_auth;
	private int archive;
	
	public Manager(int id,String f_name,String l_name,String uname,String pass,String md5_pass,int priv_id,java.sql.Date data_auth,int archive){
		
		this.id = id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.uname = uname;
		this.pass = pass;
		this.md5_pass = md5_pass;
		this.priv_id = priv_id;
		this.data_auth = data_auth;
		this.archive = archive;
		
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getU_name() {
		return uname;
	}

	public void setU_name(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMd5_pass() {
		return md5_pass;
	}

	public void setMd5_pass(String md5_pass) {
		this.md5_pass = md5_pass;
	}

	public int getPriv_id() {
		return priv_id;
	}

	public void setPriv_id(int priv_id) {
		this.priv_id = priv_id;
	}

	public java.sql.Date getData_aut() {
		return data_auth;
	}

	public void setData_aut(java.sql.Date data_auth) {
		this.data_auth = data_auth;
	}

	public int getArchive() {
		return archive;
	}

	public void setArchive(int archive) {
		this.archive = archive;
	}

	
}
