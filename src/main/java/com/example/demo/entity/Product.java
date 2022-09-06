package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
	  	@Id
	    @GeneratedValue
	    private int id;
	    private String name;
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		private int quantity;
	    private double price;
	    private String img1;
	    private String img2;
	    private String img3;
		public String getImg1() {
			return img1;
		}
		public void setImg1(String img1) {
			this.img1 = img1;
		}
		public String getImg2() {
			return img2;
		}
		public void setImg2(String img2) {
			this.img2 = img2;
		}
		public String getImg3() {
			return img3;
		}
		public void setImg3(String img3) {
			this.img3 = img3;
		}
}
