package com.csf.demo.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Article  
{  
	//Defining book id as primary key  
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int id;  
	@Column  
	private String designation;  
	@Column  
	private int qte;  
	@Column  
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", designation=" + designation + ", qte=" + qte + ", price=" + price + "]";
	}  

}  
