import java.util.*;

public class Tren {
	
	
	public String destinatie;
	public String ora_plecare;
	public String cod;

	
	public Tren(String destinatie, String ora_plecare, String cod) {
		super();
		this.destinatie = destinatie;
		this.ora_plecare = ora_plecare;
		this.cod = cod;
	}
	
	public String getDestinatie() {
		return destinatie;
	}
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}
	public String getOra_plecare() {
		return ora_plecare;
	}
	public void setOra_plecare(String ora_plecare) {
		this.ora_plecare = ora_plecare;
	}
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String toString()
	{
	return("Codul"+getCod()+"Destinatie"+getDestinatie()+"Ora_plecare"+getOra_plecare())+"\n";
	}
	}
