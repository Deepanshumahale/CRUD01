package net.codejava.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Columns;

import net.codejava.brand.Brand;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
	@Column(length=45,nullable=false,unique=true)
private String name;
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand;
	
public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
public Category(String name) {
	
	this.name = name;
}
public Category(Integer id) {
	
	this.id = id;
	
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return  name;
}

}
