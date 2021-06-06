package zivotinje;

public class Ribe extends Zivotinje {
	/*
	 * Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka,
	 * slana voda) i vrsta peraja. Sisari su kicmenjaci koje se razlikuju po boji
	 * dlake i po broju nogu.
	 */
	
	private String vrstaVode;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String nazivZivotinje, String omiljenaHrana, String vrstaVode, String vrstaPeraja) {
		super(vrsta, nazivZivotinje, omiljenaHrana);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getVrsta());
		sb.append(" ");
		sb.append(super.getNazivZivotinje());
		sb.append(" ");
		sb.append(super.getOmiljenaHrana());
		sb.append(" ");
		sb.append(vrstaVode);
		sb.append(" ");
		sb.append(vrstaPeraja);
		
		return sb.toString();
	}
	
	
	
}
