package ro.sci.databaseproject;

import java.sql.Connection;

public interface OrderItemDAO {

	void createItem(Connection connection);

	void deleteItem(Connection connection);

	void updateItem(Connection connection);

	void getAllItems(Connection connection);

}
