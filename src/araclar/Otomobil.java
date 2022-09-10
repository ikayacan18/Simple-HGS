package araclar;

public class Otomobil extends Arac{

	public Otomobil(int hGSNumarasi, String sahibi, int bakiye) {
		super(hGSNumarasi, sahibi, bakiye);
		sinif=1;
		ucret=10;
	}
	
	@Override
	public String toString() {
		return "Otomobil "+ super.toString();
	}
}
