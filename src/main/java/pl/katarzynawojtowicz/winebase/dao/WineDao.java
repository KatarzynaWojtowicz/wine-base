package pl.katarzynawojtowicz.winebase.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import pl.katarzynawojtowicz.winebase.model.Wine;

public class WineDao {

	private static final String SQL_SELECT_ALL = "SELECT "
			+ "wine_name, wine_country, wine_year, wine_price, wine_type, grape_variety, colour FROM wine "
			+ "INNER JOIN wine_type ON wine.id_type = wine_type.id_type "
			+ "INNER JOIN grape_variety ON wine.id_grape_variety = grape_variety.id_grape_variety "
			+ "INNER JOIN colour ON wine.id_colour = colour.id_colour";

	private static final String DB_PASSWORD = "password";
	private static final String DB_USER = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/winebase";
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";

	public List<Wine> findWine() {
		List<Wine> wineList = new ArrayList<Wine>();
		try {
			Class.forName(DB_DRIVER).newInstance();
			Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL);

			while (resultSet.next()) {
				Wine w = new Wine();
				w.setWineName(resultSet.getString("wine_name"));
				w.setWineCountry(resultSet.getString("wine_country"));
				w.setWineYear(resultSet.getInt("wine_year"));
				w.setWinePrice(resultSet.getDouble("wine_price"));
				w.setWineType(resultSet.getString("wine_type"));
				w.setGrapeVariety(resultSet.getString("grape_variety"));
				w.setColour(resultSet.getString("colour"));

				wineList.add(w);
			}

			statement.close();
			connection.close();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wineList;

	}

	public void addWine(Wine wine) {

		String typeSelect = String.format(Locale.US, "SELECT id_type FROM wine_type WHERE wine_type = '%s'",
				wine.getWineType());
		String grapeVarietySelect = String.format(Locale.US,
				"SELECT id_grape_variety FROM grape_variety WHERE grape_variety = '%s'", wine.getGrapeVariety());
		String colourSelect = String.format(Locale.US, "SELECT id_colour FROM colour WHERE colour = '%s'",
				wine.getColour());
		String insertQuery = String.format(Locale.US,
				"INSERT INTO wine VALUES (NULL, '%s', '%s', %d, %.2f, '%s', (%s), (%s), (%s))",
				wine.getWineName(),
				wine.getWineCountry(),
				wine.getWineYear(),
				wine.getWinePrice(),
				wine.getWineDescription(),
				typeSelect,
				grapeVarietySelect,
				colourSelect);

		System.out.println(insertQuery);
	}
}
