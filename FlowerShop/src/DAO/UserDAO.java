package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.User;
import tools.EncryptionSHA1;

public class UserDAO extends DAOConnector{
	private Connection con;
	private EncryptionSHA1 encrypt;
	public UserDAO(){
		getInstance();
		con = DAOConnector.con;
		encrypt = new EncryptionSHA1();
	}
	
	public boolean insertUser(User user) {
		String sql = "INSERT INTO `user`(`username`, `password`, `fullname`, `address`, `email`, `phone`, `role`) VALUES (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, encrypt.encryptPassword(user.getPassword()));
			ps.setString(3, user.getFullname());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getPhone());
			ps.setInt(7, user.getRole());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public boolean updateUser(User user) {
		String sql = "UPDATE `user` SET `username`=?,`password`=?,`fullname`=?,`address`=?,`email`=?,`phone`=?,`role`=? WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFullname());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getPhone());
			ps.setInt(7, user.getRole());
			ps.setInt(8, user.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteUser(User user) {
		String sql = "DELETE FROM `user` WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean checkUser(User user) {
		String sql = "SELECT * FROM `user` WHERE username=? AND password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, encrypt.encryptPassword(user.getPassword()));
			ResultSet rs = ps.executeQuery();
			if(rs.next()) return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		User user = new User("b", "b", "c", "c", "c", "c", 0);
		if(dao.insertUser(user) == true) {
			System.out.println("OK");
		}
		else {
			System.out.println("Not OK");
		}
	}
	
}
