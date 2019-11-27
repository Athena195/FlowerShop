package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable{
	private int id;
	private User user;
	private ArrayList<Booking> listBooking;
	public Cart() {
		
	}
	public Cart(int id, User user, ArrayList<Booking> listBooking) {
		super();
		this.id = id;
		this.user = user;
		this.listBooking = listBooking;
	}
	
	public Cart(User user, ArrayList<Booking> listBooking) {
		super();
		this.user = user;
		this.listBooking = listBooking;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<Booking> getListBooking() {
		return listBooking;
	}
	public void setListBooking(ArrayList<Booking> listBooking) {
		this.listBooking = listBooking;
	}
	
}
