package araclar;

public class Otobus extends Arac{

	public Otobus(int hGSNumarasi, String sahibi, int bakiye) {
		super(hGSNumarasi, sahibi, bakiye);
		sinif=3;
		ucret=30;
	}
	
	@Override
	public String toString() {
		return "Otobus "+ super.toString();
	}
}
