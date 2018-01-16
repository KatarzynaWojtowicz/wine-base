package pl.katarzynawojtowicz.winebase;

public class ComboBoxes {
	private static final String[] colourWine = { "pink", "red", "white", "other" };

	private static final String[] crapeVariety = { "chardonnay", "sauvignon blanc", "riesling", "cabernet sauvignon",
			"merlot", "pinot noir", "syrah" };

	private final static String[] type = { "dry", "semi - dry", "sweet", "semi - sweet" };

	public static String[] getColourwine() {
		return colourWine;
	}

	public static String[] getCrapevariety() {
		return crapeVariety;
	}

	public static String[] getType() {
		return type;
	}

}
