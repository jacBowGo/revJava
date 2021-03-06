package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.dbutil.MySqlConnection;
import com.app.model.Player;
import com.app.dao.PlayerDAO;

public class PlayerDAOImpl implements PlayerDAO {
	
	@Override
	public int createPlayer(Player player) {
		int c = 0;
		try(Connection connection = MySqlConnection.getConnection()) {
			String sql = "INSERT INTO player(id,name,age,city,gender,teamName) VALUES(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getCity());
			preparedStatement.setString(5, player.getGender());
			preparedStatement.setString(6, player.getTeamName());
			
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return c;
	}

	@Override
	public List<Player> getAllPlayers() {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection = MySqlConnection.getConnection()) {
			String sql = "SELECT id, name, age, city, gender, teamName FROM player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setTeamName(resultSet.getString("teamName"));
				player.setCity(resultSet.getString("city"));
				playersList.add(player);
			}
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playersList;
	}

	@Override
	public int updatePlayer(int id, String city) {

		try(Connection connection = MySqlConnection.getConnection()) {
			String sql = "UPDATE player SET city = ? WHERE id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, city);
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return 0;
	}
	

	@Override
	public void deletePlayer(int id) {
		try(Connection connection = MySqlConnection.getConnection()) {
			String sql = "DELETE FROM player WHERE id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
	}

}
