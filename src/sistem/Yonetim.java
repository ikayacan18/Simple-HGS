package sistem;

import java.text.SimpleDateFormat;
import java.util.Date;
import araclar.Arac;

public class Yonetim {

	public Yonetim() {
		
	}
	
	public double getBakiye() {  //tum gise bakiyesini al.
		return Gise.getBakiye();
	}

	public double gunlukBakiyeHesapla() {  //Sadece bugun elde edilen bakiyeyi hesapla.
		double bakiye=0;
		for (Arac arac: Gise.getAraclar()) {
			for (Date date: arac.getGectigiTarihler()) {
			    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			    Date today=new Date();
			    String todayFormatted=format.format(today);

				if(todayFormatted.equals(format.format(date))) {
					bakiye+=arac.getUcret();
				}
			}
		}
		return bakiye;
	}

}
