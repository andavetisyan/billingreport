package com.aranea.billing.db;
import java.sql.Date;

public class agreements {
	
	
	private int id;
	private int uid;
	private int opera_id;
	private String number;
	private Date date;
	private double balance;
	private double credit;
	private int cur_id;
	private String code;
	private double b_limit;
	private int b_notify;
	private Date b_chek;
	private int archive;
	private int penalty_method;
	private Date balance_limit_exceeded;
	private String balanc_status;
	private int auto;
	private double balance_acc;

	public agreements(int id,int uid,int opera_id,String number,Date date,double balance,double credit,int cur_id,String code,
			double b_limit,int b_notify,int b_notif,Date b_chek,int archive,int penalty_method,Date balance_limit_exceeded,String balanc_status,
			int auto,double balance_acc ) {
		
				this.id = id;
				this.uid = uid;
				this.opera_id = opera_id;
				this.number = number;
				this.date = date;
				this.balance = balance;
				this.credit = credit;
				this.cur_id = cur_id;
				this.code = code;
				this.b_limit = b_limit;
				this.b_notify = b_notif;
				this.b_chek = b_chek;
				this.archive = archive;
				this.penalty_method = penalty_method;
				this.balance_limit_exceeded = balance_limit_exceeded;
				this.auto = auto;
				this.balance_acc = balance_acc;
				
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getOpera_id() {
		return opera_id;
	}

	public void setOpera_id(int opera_id) {
		this.opera_id = opera_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public int getCur_id() {
		return cur_id;
	}

	public void setCur_id(int cur_id) {
		this.cur_id = cur_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getB_limit() {
		return b_limit;
	}

	public void setB_limit(double b_limit) {
		this.b_limit = b_limit;
	}

	public int getB_notify() {
		return b_notify;
	}

	public void setB_notify(int b_notify) {
		this.b_notify = b_notify;
	}

	public Date getB_chek() {
		return b_chek;
	}

	public void setB_chek(Date b_chek) {
		this.b_chek = b_chek;
	}

	public int getArchive() {
		return archive;
	}

	public void setArchive(int archive) {
		this.archive = archive;
	}

	public int getPenalty_method() {
		return penalty_method;
	}

	public void setPenalty_method(int penalty_method) {
		this.penalty_method = penalty_method;
	}

	public Date getBalance_limit_exceeded() {
		return balance_limit_exceeded;
	}

	public void setBalance_limit_exceeded(Date balance_limit_exceeded) {
		this.balance_limit_exceeded = balance_limit_exceeded;
	}

	public String getBalanc_status() {
		return balanc_status;
	}

	public void setBalanc_status(String balanc_status) {
		this.balanc_status = balanc_status;
	}

	public int getAuto() {
		return auto;
	}

	public void setAuto(int auto) {
		this.auto = auto;
	}

	public double getBalance_acc() {
		return balance_acc;
	}

	public void setBalance_acc(double balance_acc) {
		this.balance_acc = balance_acc;
	}

	

}
