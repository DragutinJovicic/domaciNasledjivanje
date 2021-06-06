package zivotinje;

public class Sisari extends Zivotinje {
/*Sisari su kicmenjaci koje se razlikuju po boji
	 * dlake i po broju nogu.*/
	
	private String bojaDlake;
	private int brojNogu;
	
	public Sisari(String vrsta, String nazivZivotinje, String omiljenaHrana, String bojaDlake, int brojNogu) {
		super(vrsta, nazivZivotinje, omiljenaHrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}
	
	public void dodajNogu(double noga) {
		brojNogu += noga;
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
		sb.append(bojaDlake);
		sb.append(" ");
		sb.append(brojNogu);
		
		return sb.toString();
	}
	
	
	
	
}
