package lesson21.movieApp;

public class Cast {
	
	private Long id;
	private String isim;
	private String soyIsim;
	public Cast(String isim, String soyIsim) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	public Cast(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cast [id=" + id + ", isim=" + isim + ", soyIsim=" + soyIsim + "]";
	}



	
}
