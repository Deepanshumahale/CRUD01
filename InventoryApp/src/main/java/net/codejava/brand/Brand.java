package net.codejava.brand;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import net.codejava.category.Category;
@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
	@Column(length=45,nullable=false,unique=true)
private String name;
	@OneToMany
	@JoinColumn(name="brand_id")
private List <Category> categories=new ArrayList<>();
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
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Brand(Integer id, String name, List<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.categories = categories;
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

}
