package models;

import java.io.Serializable;

public class Product implements Serializable{
	private int id;
	private String name;
	private String image;
	private String type;
	private String state;
	private String description;
	private int price;
	public Product() {
		super();
	}
	public Product(int id, String name, String image, String type, String state, String description, int price) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.type = type;
		this.state = state;
		this.description = description;
		this.price = price;
	}
	public Product(String name, String image, String type, String state, String description, int price) {
		super();
		this.name = name;
		this.image = image;
		this.type = type;
		this.state = state;
		this.description = description;
		this.price = price;
	}
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Product{\"id\" : \"" + id + "\", \"name\" : \"" + name + 
				"\", \"image\" : \"" + image + "\", \"type\" : \"" + 
				type + "\", \"state\" : \"" + state + "\", \"description\" : \"" +
				description + "\", \"price\" : \"" + price + "\"}";
	}
}
