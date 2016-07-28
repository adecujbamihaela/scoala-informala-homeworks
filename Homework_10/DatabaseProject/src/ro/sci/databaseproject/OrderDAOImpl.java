package ro.sci.databaseproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDAOImpl extends AbstractModelDAO implements OrderDAO {

	@Override
	public void createOrder(Connection connection) {
		Statement ps;
		try {
			ps = connection.createStatement();
			String sql = "INSERT INTO orders " + "VALUES (1, '300', '2016.8.3', 'yes', 1)";
			ps.executeUpdate(sql);
			String sql2 = "INSERT INTO orders " + "VALUES (2, '250', '2016.8.6', 'yes', 2)";
			ps.executeUpdate(sql2);
			String sql3 = "INSERT INTO orders " + "VALUES (3, '420', '2016.8.17', 'no', 3)";
			ps.executeUpdate(sql3);
			System.out.println("Adeed values into the table");
		} catch (SQLException se) {
			System.err.println("Failed queri " + se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOrder(Connection connection) {
		Statement ps;
		try {
			ps = connection.createStatement();
			String sql = "DELETE FROM orders " + "WHERE id=2";
			ps.executeUpdate(sql);
			String sql1 = "DELETE FROM orders " + "WHERE id=1";
			ps.executeUpdate(sql1);
			System.out.println("Values deleted from the table");
		} catch (SQLException se) {
			System.err.println("Failed query" + se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getAllOrders(Connection connection) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Date date = null;

		final String format = "%10s%20s%30s%40s%50s\n";
		try {

			String sqlQuery = "SELECT * FROM orders WHERE id>? AND value=? AND date=? AND confirmed=? AND id_customer=?";
			ps = connection.prepareStatement(sqlQuery);
			ps.setInt(1, 3);
			ps.setInt(2, 400);
			ps.setDate(3, date);
			ps.setBoolean(4, false);
			ps.setInt(5, 2);

			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {
				System.out.format(format, "id", "value", "date", "confirmed", "id_customer");
				do {
					System.out.format(format, rs.getInt("id"), rs.getInt("value"), rs.getDate("date"),
							rs.getBoolean("confirmed"), rs.getInt("id_customer"));

				} while (rs.next());
			} else {
				System.out.println("Entries not found");
			}
		} catch (SQLException e) {
			System.err.println("Failed query " + e.getMessage());
		}
	}

	@Override
	public void updateOrder(Connection connection) {
		Statement ps;
		try {
			ps = connection.createStatement();
			String sql = "UPDATE orders " + "SET id = 5 WHERE id in (2)";
			ps.executeUpdate(sql);
			sql = "SELECT id, value, date, confirmed, id_customer FROM orders";
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				int value = rs.getInt("value");
				Date date = rs.getDate("date");
				boolean confirmed = rs.getBoolean("confirmed");
				int id_customer = rs.getInt("id_customer");

				System.out.print("ID: " + id);
				System.out.print(", Value: " + value);
				System.out.print(", Date: " + date);
				System.out.print(", Confirmed: " + confirmed);
				System.out.print(", Customer_ID: " + id_customer);
			}

			System.out.println("Selected values from table");
		} catch (SQLException se) {
			System.err.println("Failed query " + se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
