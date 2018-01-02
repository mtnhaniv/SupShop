/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Product;

/**
 *
 * @author mtnhaniv
 */
public class ProductDao {
    public ArrayList<Product> getListProductByCategory(long category_id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product WHERE category_id = '" + category_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductDescription(rs.getString("product_detail"));
            list.add(product);
        }
        return list;
    }
        public ArrayList<Product> getListProduct() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductDescription(rs.getString("product_detail"));
            list.add(product);
        }
        return list;
    }
     public Product getProduct(long productID) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product WHERE product_id = '" + productID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductDescription(rs.getString("product_detail"));
        }
        return product;
    }
     public boolean insertProduct(Product c) {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO product VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1, (int) c.getProductID());
            ps.setInt(2, (int) c.getCategoryID());
            ps.setString(3, c.getProductName());
            ps.setString(4, c.getProductImage());
            ps.setDouble(5, c.getProductPrice());
            ps.setString(6, c.getProductDescription());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // cập nhật dữ liệu
    public boolean updateProduct(Product c) {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE product SET product_name = ? WHERE product_id = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1, (int) c.getProductID());
            ps.setInt(2, (int) c.getCategoryID());
            ps.setString(3, c.getProductName());
            ps.setString(4, c.getProductImage());
            ps.setDouble(5, c.getProductPrice());
            ps.setString(6, c.getProductDescription());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // xóa dữ liệu
    public boolean deleteProduct(long product_id) {
        Connection connection = DBConnect.getConnection();
        String sql = "DELETE FROM product WHERE product_id = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, product_id);
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static void main(String[] args) throws SQLException {
        ProductDao dao = new ProductDao();
        for(Product p : dao.getListProduct()){
            System.out.println(p.getProductID() + " - "+p.getProductName());
        }
    }
}
