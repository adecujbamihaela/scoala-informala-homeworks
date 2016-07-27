package ro.sci.databaseproject;

public abstract class AbstractModelDAO {

	protected void getDBConnection() {
		ConnectionManager.getConnection("postgresql", "localhost", 5432, "eShop", "postgres", "scoalainformala");

	}

}
