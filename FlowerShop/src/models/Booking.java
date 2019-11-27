package models;

import java.io.Serializable;

public class Booking implements Serializable{
	private int id;
	private Product product;
	private User user;
	private int quantity;
	private int state;
	
	public Booking() {
		
	}

	public Booking(int id, Product product, User user, int quantity, int state) {
		super();
		this.id = id;
		this.product = product;
		this.user = user;
		this.quantity = quantity;
		this.state = state;
	}
	public Booking(Product product, User user, int quantity, int state) {
		super();
		this.product = product;
		this.user = user;
		this.quantity = quantity;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
}
