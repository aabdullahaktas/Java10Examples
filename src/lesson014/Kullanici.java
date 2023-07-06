package lesson014;

public class Kullanici {

	private int id;
	private String username;
	private String pasword;
	private String isim;
	private Sepet sepet;
	
	
	public Kullanici(int id, String username, String pasword, String isim) {
		this(username,pasword, isim);
		this.id = id;
	}
	public Kullanici(String username, String pasword, String isim) {
		this.username = username;
		this.pasword = pasword;
		this.isim = isim;
		this.sepet = new Sepet();
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public Sepet getSepet() {
		return sepet;
	}
	public void setSepet(Sepet sepet) {
		this.sepet = sepet;
	}
	
	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", username=" + username + ", pasword=" + pasword + ", isim=" + isim + ", sepet="
				+ sepet + "]";
	}
	
	
	
	
	
}
