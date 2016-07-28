package ro.sci.databaseproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAOImpl extends AbstractModelDAO implements CustomerDAO {

	@Override
	public void createCustomer(Connection connection) {
		Statement ps;
		try {
			ps = connection.createStatement();
			String sql = "INSERT INTO customers " + "VALUES (1, 'cujba.adelina@yahoo.es', 'Ade')";
			ps.executeUpdate(sql);
			String sql2 = "INSERT INTO customers " + "VALUES (2, 'maria@yahoo.com', 'Maria')";
			ps.executeUpdate(sql2);
			String sql3 = "INSERT INTO customers " + "VALUES (3, 'bogdan@yahoo.com', 'Bogdan')";
			ps.executeUpdate(sql3);
			System.out.println("Values added into the table");
		} catch (SQLException se) {
			System.err.println("Failed query: " + se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteCustomer(Connection connection) {
		Statement ps;
		try {
			ps = connection.createStatement();
			String sql = "DELETE FROM customers " + "WHERE id=2";
			ps.executeUpdate(sql);
			String sql1 = "DELETE FROM customers " + "WHERE id=1";
			ps.executeUpdate(sql1);
			System.out.println("Values deleted from the table");
		} catch (SQLException se) {
			System.err.println("Failed query " + se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getAllCustomers(Connection connection) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		final String format = "%10s%20s%30s\n";
		try {

			String sqlQuery = "SELECT * FROM customers WHERE id>? AND name=? AND email=?";
			ps = connection.prepareStatement(sqlQuery);
			ps.setInt(1, 2);
			ps.setString(2, "Maria");
			ps.setString(3, "maria@yahoo.com");

			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {
				System.out.format(format, "id", "name", "email");
				do {
					System.out.format(format);
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("email"));

				} while (rs.next());
			} else {
				System.out.println("Entries not found");
			}
		} catch (SQLException e) {
			System.err.println("Cannot execute query: " + e.getMessage());
		}

	}

	@Override
	public void updateCustomer(Connection connection) {
		Statement ps;
		try {
			ps = connection.createStatement();
			String sql = "UPDATE customers " + "SET id = 2 WHERE id in (1)";
			ps.executeUpdate(sql);
			sql = "SELECT id, name, email FROM customers";
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");

				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print(", email: " + email);
			}

			System.out.println("Selected values from the table");
		} catch (SQLException se) {
			System.err.println("Failed query " + se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
