package com.aranea.billing.db;
import java.sql.Date;

public class rentcharge {
	
	private int vg_id;
	private Date period;
	private Date dateofcharge;
	private int amount;
	private int tar_id;
	private int block;
	private int agrm_id;
	private int mul;
	private Date c_date;

	public rentcharge(int vg_id,Date period,Date dateofcharge,int amount,int tar_id,int block,int agrm_id,int mul,Date c_date) {
		
		this.vg_id = vg_id;
		this.period = period;
		this.dateofcharge = dateofcharge;
		this.amount = amount;
		this.tar_id = tar_id;
		this.block = block;
		this.agrm_id = agrm_id;
		this.mul = mul;
		this.c_date = c_date;
		
	}

	public int getVg_id() {
		return vg_id;
	}

	public void setVg_id(int vg_id) {
		this.vg_id = vg_id;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Date getDateofcharge() {
		return dateofcharge;
	}

	public void setDateofcharge(Date dateofcharge) {
		this.dateofcharge = dateofcharge;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTar_id() {
		return tar_id;
	}

	public void setTar_id(int tar_id) {
		this.tar_id = tar_id;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getAgrm_id() {
		return agrm_id;
	}

	public void setAgrm_id(int agrm_id) {
		this.agrm_id = agrm_id;
	}

	public int getMul() {
		return mul;
	}

	public void setMul(int mul) {
		this.mul = mul;
	}

	public Date getC_date() {
		return c_date;
	}

	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}

}
