
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garaa gara =new Garaa();
		Tren tren1 = new Tren("Bucuresti", "12:00", "1595");
		
		Tren tren2 = new Tren("Craiova", "11:11", "1588");
		
		Tren tren3 = new Tren("Cluj", "11:15", "3326");
		
		Tren tren4 = new Tren("Timisoara", "11:14", "1295");
	
		Tren tren5 = new Tren("Brasov", "11:12", "3595");
		
	
		gara.Adaugare_tren(tren1);
		gara.Adaugare_tren(tren2);
		gara.Adaugare_tren(tren3);
		gara.Adaugare_tren(tren4);
		gara.Adaugare_tren(tren5);
		//System.out.println(gara.afiseazaTren());
		//System.out.println("\n\n");
		//System.out.println(gara.afiseazaTrenCrescator());
		System.out.println(gara.getTren("1595"));
	}

}
