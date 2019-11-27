package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Product;
import models.User;

public class ProductDAO extends DAOConnector{
	private Connection con;
	public ProductDAO(){
		getInstance();
		con = DAOConnector.con;
	}
	public boolean insertProduct(Product product) {
		String sql = "INSERT INTO `product`(`name`, `image`, `type`, `state`, `description`, `price`) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setString(2, product.getImage());
			ps.setString(3, product.getType());
			ps.setString(4, product.getState());
			ps.setString(5, product.getDescription());
			ps.setInt(6, product.getPrice());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean updateProduct(Product product) {
		String sql = "UPDATE `product` SET `name`=?,`image`=?,`type`=?,`state`=?,`description`=?,`price`=? WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setString(2, product.getImage());
			ps.setString(3, product.getType());
			ps.setString(4, product.getState());
			ps.setString(5, product.getDescription());
			ps.setInt(6, product.getPrice());
			ps.setInt(7, product.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean deleteProduct(Product product) {
		String sql = "DELETE FROM `product` WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product p = new Product(1, "a", "a", "a", "a", "a", 200);
		if(dao.deleteProduct(p) == true) {
			System.out.println("OK");
		}
		else {
			System.out.println("Not OK");
		}
	}
}
