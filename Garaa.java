import java.util.*;
public final class Garaa  {
	static ArrayList<Tren> trenuri=new ArrayList<Tren>();
	public void Adaugare_tren(Tren a)
	{
		trenuri.add(a);	
	}
	
	public ArrayList<Tren> afiseazaTren()
	{
		return trenuri;
	}
	public static String getTren(String j){
		
		int i=trenuri.size()-1;
		while(i!=-1){
		String x=trenuri.get(i).getCod();
		if(x.equals(j)){
			return (trenuri.get(i).toString());}
		else i--;
		}
		return("Trenul nu a fost gasit!");
	}
	public static ArrayList<Tren> Getrains(){
		
        return trenuri;
	}
	public ArrayList<Tren> afiseazaTrenCrescator()
	{
		trenuri.sort(Comparator.comparing(Tren::getOra_plecare));
		return trenuri;
	}

	public static ArrayList<Tren> getTrenuri() {
		return trenuri;
	}

	public void setTrenuri(ArrayList<Tren> trenuri) {
		this.trenuri = trenuri;
	}
	

}
