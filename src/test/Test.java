package test;

import araclar.*;
import sistem.*;
public class Test {

	public static void main(String[] args) {
		Yonetim yonetim = new Yonetim();
		Gise gise = new Gise();
		
		Otomobil otomobil1 = new Otomobil(1 ,"isim1 soyisim1", 100);
		Otomobil otomobil2 = new Otomobil(2 ,"isim2 soyisim2", 15);

		Otobus otobus1 = new Otobus(3 ,"isim3 soyisim3", 80);
		
		Minibus minibus1 = new Minibus(4 ,"isim4 soyisim4", 70);
		

		
		System.out.println("Otomobil1 gisede - Bakiyesi: " + otomobil1.getBakiye() + " - Ucret: " + otomobil1.getUcret());
		gise.gecis(otomobil1);
		System.out.println("otomobil1 bakiyesi: " + otomobil1.getBakiye());
		System.out.println("gise bakiyesi: " + yonetim.getBakiye());
		
		System.out.println("------------------------------------------------------------");
		
		try {  //farkli gecis tarihlerini test etmek icin.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Otomobil2 gisede - Bakiyesi: " + otomobil2.getBakiye() + " - Ucret: " + otomobil2.getUcret());
		gise.gecis(otomobil2);
		System.out.println("Otomobil2 bakiyesi: " + otomobil2.getBakiye());
		System.out.println("Gise bakiyesi: " + yonetim.getBakiye());
		
		System.out.println("------------------------------------------------------------");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Otomobil2 gisede - Bakiyesi: " + otomobil2.getBakiye() + " - Ucret: " + otomobil2.getUcret());
		gise.gecis(otomobil2);
		System.out.println("Otomobil2 bakiyesi: " + otomobil2.getBakiye());
		System.out.println("Gise bakiyesi: " + yonetim.getBakiye());
		
		System.out.println("------------------------------------------------------------");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Otobus1 gisede - Bakiyesi: " + otobus1.getBakiye() + " - Ucret: " + otobus1.getUcret());
		gise.gecis(otobus1);
		System.out.println("Otobus1 bakiyesi: " + otobus1.getBakiye());
		System.out.println("Gise bakiyesi: " + yonetim.getBakiye());
		
		System.out.println("------------------------------------------------------------");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Minibus1 gisede - Bakiyesi: " + minibus1.getBakiye() + " - Ucret: " + minibus1.getUcret());
		gise.gecis(minibus1);
		System.out.println("Minibus1 bakiyesi: " + minibus1.getBakiye());
		System.out.println("Gise bakiyesi: " + yonetim.getBakiye());
		
		System.out.println("------------------------------------------------------------");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Otobus1 gisede - Bakiyesi: " + otobus1.getBakiye() + " - Ucret: " + otobus1.getUcret());
		gise.gecis(otobus1);
		System.out.println("otobus1 bakiyesi: " + otobus1.getBakiye());
		System.out.println("Gise bakiyesi: " + yonetim.getBakiye());
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Gecen araclar:\n");
		for (Arac arac:gise.getAraclar()){
			System.out.println(arac);
		}
		
		System.out.println("\nBugun elde edilen gise bakiyesi: " + yonetim.gunlukBakiyeHesapla());
		
	}

}
