package araclar;

public class Minibus extends Arac{

	public Minibus(int hGSNumarasi, String sahibi, int bakiye) {
		super(hGSNumarasi, sahibi, bakiye);
		sinif=2;
		ucret=20;
	}
	
	@Override
	public String toString() {
		return "Minibus "+ super.toString();
	}
}

