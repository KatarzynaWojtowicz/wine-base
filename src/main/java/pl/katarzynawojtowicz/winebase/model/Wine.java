package pl.katarzynawojtowicz.winebase.model;

public class Wine {
	private Integer idWine;
	private String wineName;
	private String wineCountry;
	private Integer wineYear;
	private Double winePrice;
	private String wineDescription;
	private String wineType;
	private String grapeVariety;
	private String colour;

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

	public String getWineType() {
		return wineType;
	}

	public void setWineType(String wineType) {
		this.wineType = wineType;
	}

	public String getGrapeVariety() {
		return grapeVariety;
	}

	public void setGrapeVariety(String grapeVariety) {
		this.grapeVariety = grapeVariety;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
