package ro.sci.databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public static void main(String[] args) throws SQLException {

		loadDriver();

		Connection connection = getConnection("postgresql", "localhost", 5432, "eShop", "postgres", "scoalainformala");
		if (connection == null)
			return;

		CustomerDAO cDAO = new CustomerDAOImpl();
		OrderDAO oDAO = new OrderDAOImpl();
		OrderItemDAO iDAO = new OrderItemDAOImpl();
		ProductDAO pDAO = new ProductDAOImpl();
		cDAO.createCustomer(connection);
		cDAO.getAllCustomers(connection);
		cDAO.updateCustomer(connection);
		cDAO.deleteCustomer(connection);

		oDAO.createOrder(connection);
		oDAO.getAllOrders(connection);
		oDAO.updateOrder(connection);
		oDAO.deleteOrder(connection);

		iDAO.createItem(connection);
		iDAO.getAllItems(connection);
		iDAO.updateItem(connection);
		iDAO.deleteItem(connection);

		pDAO.createProduct(connection);
		pDAO.getAllProducts(connection);
		pDAO.updateProduct(connection);
		pDAO.deleteProduct(connection);

		closeConnection(connection);
	}

	public static Connection getConnection(String type, String host, int port, String dbName, String user, String pw) {

		Connection connection = null;
		DriverManager.setLoginTimeout(60);
		try {
			String url = new StringBuilder().append("jdbc:").append(type).append("://").append(host).append(":")
					.append(port).append("/").append(dbName).append("?user=").append(user).append("&password=")
					.append(pw).toString();

			System.out.println("URL:" + url);
			connection = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.err.println("Cannot connect to the database: " + e.getMessage());
		}

		return connection;
	}

	public static void loadDriver() {

		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection connection) {
		try {

			if (connection == null)
				return;

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
