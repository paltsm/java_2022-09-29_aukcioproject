package com.example.aukcioproject;

import java.time.LocalDateTime;

//TODO: 18:00,
public class Festmeny {
	public static final int KEZDETI_LICIT = 100;
	private String cim;
	private String festo;
	private String stilus;
	private int licitekSzama;
	private int legmagasabbLicit;
	private LocalDateTime legutolsoLicitIdeje;
	private boolean elkelt;

	public String getCim() {
		return cim;
	}

	public String getFesto() {
		return festo;
	}

	public String getStilus() {
		return stilus;
	}

	public int getLicitekSzama() {
		return licitekSzama;
	}

	public int getLegmagasabbLicit() {
		return legmagasabbLicit;
	}

	public LocalDateTime getLegutolsoLicitIdeje() {
		return legutolsoLicitIdeje;
	}

	public boolean isElkelt() {
		return elkelt;
	}

	public void setElkelt(boolean elkelt) {
		this.elkelt = elkelt;
	}

	public void licit() {
		//TODO: eljárás megvalósítása
		if (this.elkelt) {
			throw new RuntimeException("A festmény már elkelt");
		}
		if (this.licitekSzama == 0) {
			this.legmagasabbLicit = KEZDETI_LICIT;
		} else {
			int ujLicit = (int) (this.legmagasabbLicit * 1.1);
			this.legmagasabbLicit=getVeglegesLicitMatematika(ujLicit);
		}
		this.licitekSzama++;
		this.legutolsoLicitIdeje = LocalDateTime.now();
	}
	private int getVeglegesLicitMatematika(int ujLicit){
		int osztasokSzama=0;
		while (ujLicit>100){
			ujLicit/=10;
			osztasokSzama++;
		}
		return (int) (ujLicit*Math.pow(10,osztasokSzama));
	}


	public Festmeny(String cim, String festo, String stilus) {
		this.cim = cim;
		this.festo = festo;
		this.stilus = stilus;
		// TODO: többi adattag beállítása
	}


}
