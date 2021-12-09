package com.mock;

public class Person extends Inherit {
	String Harsha;
	String kothagudem;
	public Person(String name, String place, String harsha, String kothagudem) {
		super(name, place);
		Harsha = harsha;
		this.kothagudem = kothagudem;
	}
	public void onlyeat() {
	System.out.println("rice");
	}
	public String getHarsha() {
		return Harsha;
	}
	public void setHarsha(String harsha) {
		Harsha = harsha;
	}
	public String getKothagudem() {
		return kothagudem;
	}
	public void setKothagudem(String kothagudem) {
		this.kothagudem = kothagudem;
	}
	
	

}
