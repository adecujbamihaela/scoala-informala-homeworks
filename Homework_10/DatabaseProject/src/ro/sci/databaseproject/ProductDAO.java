package ro.sci.databaseproject;

import java.sql.Connection;

public interface ProductDAO {

	void createProduct(Connection connection);

	void deleteProduct(Connection connection);

	void updateProduct(Connection connection);

	void getAllProducts(Connection connection);

}
