package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mall {
	private long id;
	private String mall_admin;
	private String mall_name;
	private String location;
	private String shops_id;
	private String category;
	
	public Mall() {
		super();
		
	}
	
	public Mall(long id, String mall_admin, String mall_name, String location, String shops_id, String category) {
		super();
		this.id = id;
		this.mall_admin = mall_admin;
		this.mall_name = mall_name;
		this.location = location;
		this.shops_id = shops_id;
		this.category = category;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMall_admin() {
		return mall_admin;
	}

	public void setMall_admin(String mall_admin) {
		this.mall_admin = mall_admin;
	}

	public String getMall_name() {
		return mall_name;
	}

	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getShops_id() {
		return shops_id;
	}

	public void setShops_id(String shops_id) {
		this.shops_id = shops_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Mall [id=" + id + ", mall_admin=" + mall_admin + ", mall_name=" + mall_name + ", location=" + location
				+ ", shops_id=" + shops_id + ", category=" + category + "]";
	}
	


}
