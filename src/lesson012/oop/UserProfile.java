package lesson012.oop;

public class UserProfile {
	
	String avatar;
	String username;
	String name;
	String surName;
	int followers;
	int following;
	double repositories;
	
	
	public void editProfile() {
		System.out.println(name+"profil düzenlendi.");
	}
	public void createRepository () {
		System.out.println("yeni bir repository olusturuldu.");
	}
	
	public void RandomFollowers() {
		
	}
	public void getInformation() {
		System.out.println("profil bilgileri ======");
	}
	
	
	
}
