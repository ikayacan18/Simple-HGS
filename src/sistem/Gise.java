package sistem;

import java.util.ArrayList;

import araclar.Arac;

public class Gise {

	private static ArrayList<Arac> araclar;
	private static double bakiye;

	public Gise() {
		araclar=new ArrayList<Arac>();
		bakiye=0;
	}

	public void gecis(Arac arac) {
		double ucret=arac.gec();
		if(ucret != -1) {
			System.out.println(arac.getHGSNumarasi() + " HGS numarali arac HGS'den gecti.");
			if (!araclar.contains(arac))
				araclar.add(arac);
			bakiye+=ucret;
		} else {
			System.out.println(arac.getHGSNumarasi() + " - YETERSIZ BAKIYE!");
		}
	}
	
	public static double getBakiye() {
		return bakiye;
	}
	
	public static ArrayList<Arac> getAraclar(){
		return araclar;
	}
}
