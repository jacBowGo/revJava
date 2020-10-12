package com.app.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.customer.dao.CustomerDAO;
import com.app.customer.dbutil.MySqlConnection;
import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "INSERT INTO customer (name, age, gender, city, contact) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setInt(2, customer.getAge());
			preparedStatement.setString(3, customer.getGender());
			preparedStatement.setString(4, customer.getCity());
			preparedStatement.setLong(5, customer.getContact());
			
			c = preparedStatement.executeUpdate();
			if (c == 0 ) {
				throw new BusinessException("Customer Registration failed... Please try again");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occurred... Please contact the master");
		}
		return c;
	}

	@Override
	public int updateCustomer(int id, long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customersList = new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "SELECT id, name, gender, city, age, contact FROM customer";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occurred... Please contact the master");
		}
		if (customersList.size() == 0) {
			throw new BusinessException ("No customers as of now in the Db");
		}
		return customersList;
	}

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByContact(long contact) throws BusinessException {
		Customer customer = null;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "SELECT id, name, gender, city, age FROM customer WHERE contact = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(contact);
				customer.setName(resultSet.getString("name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setCity(resultSet.getString("city"));
				
			} else {
				throw new BusinessException ("No customers with contact " + contact + " in the DB");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occurred... Please contact the master");
		}
		return customer;
	}

	@Override
	public List<Customer> getCustomerByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByGender(String gender) throws BusinessException {
		List<Customer> customersList = new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "SELECT id, name, city, age, contact FROM customer WHERE gender = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender.toLowerCase());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setContact(resultSet.getLong("contact"));
				customer.setName(resultSet.getString("name"));
				customer.setGender(gender);
				customer.setCity(resultSet.getString("city"));
				customersList.add(customer);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e); //for test
			throw new BusinessException("Internal error occurred... Please contact the master");
		}
		if (customersList.size() == 0) {
			throw new BusinessException ("No customers as of now in the Db for the gender " + gender);
		}
		return customersList;
	}

}
