package ro.sci.databaseproject;

import java.sql.Connection;

public interface OrderDAO {

	void createOrder(Connection connection);

	void deleteOrder(Connection connection);

	void updateOrder(Connection connection);

	void getAllOrders(Connection connection);

}
