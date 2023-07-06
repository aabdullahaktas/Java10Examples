package lesson012.oop;

public class Test {

	public static void main(String[] args) {
		
		UserProfile profile1 = new UserProfile();
		profile1.name = "Abdullah";
		profile1.surName="Aktaş";
		profile1.username="aabdullahaktas";
		profile1.followers=100;
		profile1.following=105;
		profile1.repositories = 85.0;
		
		
		System.out.println(profile1.username);
		System.out.println(profile1.name+""+profile1.surName);
		System.out.println(profile1.followers);
		System.out.println(profile1.following);
		System.out.println(profile1.repositories);
		profile1.editProfile();
		profile1.createRepository();
		

	}

}
