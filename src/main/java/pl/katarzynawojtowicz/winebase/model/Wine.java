package pl.katarzynawojtowicz.winebase.model;

public class Wine {
	private int idWine;
	private String wineName;
	private String wineCountry;
	private int wineYear;
	private double winePrice;
	private String wineDescription;
	private int idType;
	private int idGrapeVariety;
	private int idColour;

	public int getIdWine() {
		return idWine;
	}

	public void setIdWine(int idWine) {
		this.idWine = idWine;
	}

	public String getWineName() {
		return wineName;
	}

	public void setWineName(String wineName) {
		this.wineName = wineName;
	}

	public String getWineCountry() {
		return wineCountry;
	}

	public void setWineCountry(String wineCountry) {
		this.wineCountry = wineCountry;
	}

	public int getWineYear() {
		return wineYear;
	}

	public void setWineYear(int wineYear) {
		this.wineYear = wineYear;
	}

	public double getWinePrice() {
		return winePrice;
	}

	public void setWinePrice(double winePrice) {
		this.winePrice = winePrice;
	}

	public String getWineDescription() {
		return wineDescription;
	}

	public void setWineDescription(String wineDescription) {
		this.wineDescription = wineDescription;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public int getIdGrapeVariety() {
		return idGrapeVariety;
	}

	public void setIdGrapeVariety(int idGrapeVariety) {
		this.idGrapeVariety = idGrapeVariety;
	}

	public int getIdColour() {
		return idColour;
	}

	public void setIdColour(int idColour) {
		this.idColour = idColour;
	}
}
