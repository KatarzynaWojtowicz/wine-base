package pl.katarzynawojtowicz.winebase;

public class ComboBoxes {
	private static final String[] colourWine = { "pink", "red", "white", "other" };

	private static final String[] CRAPE_VARIETY = { "chardonnay", "sauvignon blanc", "riesling", "cabernet sauvignon",
			"merlot", "pinot noir", "syrah" };

	private final static String[] TYPE = { "dry", "semi - dry", "sweet", "semi - sweet" };

	public static String[] getColourwine() {
		return colourWine;
	}

	public static String[] getCrapevariety() {
		return CRAPE_VARIETY;
	}

	public static String[] getType() {
		return TYPE;
	}

}
