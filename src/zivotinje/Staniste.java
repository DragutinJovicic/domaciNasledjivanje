package zivotinje;

import java.util.List;

public class Staniste {
/*
 * Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu
	 * zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.*/
	
	private List<Zivotinje> listaZivotinja;
	private String nazivStanista;
	
	public Staniste(List<Zivotinje> listaZivotinja, String nazivStanista) {
		super();
		this.listaZivotinja = listaZivotinja;
		this.nazivStanista = nazivStanista;
	}

	public List<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public void setListaZivotinja(List<Zivotinje> listaZivotinja) {
		this.listaZivotinja = listaZivotinja;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(listaZivotinja);
		sb.append(" ");
		sb.append(nazivStanista);
		
		return sb.toString();
	}
	
	
	
}
