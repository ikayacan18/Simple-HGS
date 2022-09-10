package araclar;

import java.util.ArrayList;
import java.util.Date;

public abstract class Arac {
	protected int HGSNumarasi;
	protected String sahibi;
	protected int sinif;
	protected ArrayList<Date> gectigiTarihler=new ArrayList<Date>();
	protected double bakiye;
	protected double ucret;
	
	public Arac(int HGSNumarasi, String sahibi, int sinif, int bakiye) {
		this.HGSNumarasi = HGSNumarasi;
		this.sahibi = sahibi;
		this.sinif = sinif;
		this.bakiye = bakiye;
	}

	public Arac(int HGSNumarasi, String sahibi, int bakiye) {
		this.HGSNumarasi = HGSNumarasi;
		this.sahibi = sahibi;
		this.bakiye=bakiye;
	}
	
	public double gec() {
		if(bakiye>=ucret) {
			gectigiTarihler.add(new Date());
			bakiye -= ucret;
			return ucret;
		} else {
			return -1;
		}
	}

	public int getHGSNumarasi() {
		return HGSNumarasi;
	}

	public ArrayList<Date> getGectigiTarihler() {
		return gectigiTarihler;
	}

	public double getBakiye() {
		return bakiye;
	}

	public double getUcret() {
		return ucret;
	}

	@Override
	public String toString() {
		return "[HGSNumarasi=" + HGSNumarasi + ", Sahibi=" + sahibi + ", Sinif=" + sinif + ", Gectigi tarihler=" + gectigiTarihler;
	}
	



}
