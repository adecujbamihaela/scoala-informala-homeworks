package ro.sci.databaseproject;

import java.sql.Connection;

public interface CustomerDAO {

	void createCustomer(Connection connection);

	void deleteCustomer(Connection connection);

	void updateCustomer(Connection connection);

	void getAllCustomers(Connection connection);

}
