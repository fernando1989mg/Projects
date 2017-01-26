package cl.vmetrix.finduroop.run;

import cl.vmetrix.finduroop.api.Column;
import cl.vmetrix.finduroop.api.Entity;
import cl.vmetrix.finduroop.api.annotation.VColumn;
import cl.vmetrix.finduroop.api.annotation.VQuery;
import cl.vmetrix.finduroop.api.annotation.VTable;

import com.olf.openjvs.OException;

@VTable(name="ext_table")
public class TableNegocio extends Entity<TableNegocio>{

	public TableNegocio() throws OException {
		super();
	}

	private Column<Integer> transNum;
	
	private Column<String> detail;
	
	private Column<Integer> dealNum;
	
	public Column<Integer> getTransNum() {
		return transNum;
	}

	public Column<String> getDetail() {
		return detail;
	}

	public Column<Integer> getDealNum() {
		return dealNum;
	}
}
