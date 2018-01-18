package pl.katarzynawojtowicz.winebase.view;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class NonEditableJTable extends JTable {

	public NonEditableJTable() {
		super();
	}

	public NonEditableJTable(int numRows, int numColumns) {
		super(numRows, numColumns);
	}

	public NonEditableJTable(Object[][] rowData, Object[] columnNames) {
		super(rowData, columnNames);
	}

	public NonEditableJTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
		super(dm, cm, sm);
	}

	public NonEditableJTable(TableModel dm, TableColumnModel cm) {
		super(dm, cm);
	}

	public NonEditableJTable(TableModel dm) {
		super(dm);
	}

	public NonEditableJTable(Vector rowData, Vector columnNames) {
		super(rowData, columnNames);
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

}
