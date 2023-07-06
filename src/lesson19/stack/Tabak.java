package lesson19.stack;
/*
 * 
 * 
 * 
 * 
 */
public class Tabak {
	
	private int id;
	private Boolean kirliMi;
	
	
	public Tabak(int id, Boolean kirliMi) {
		super();
		this.id = id;
		this.kirliMi = kirliMi;
	}
	public Tabak(int id) {
		super();
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getKirliMi() {
		return kirliMi;
	}
	public void setKirliMi(Boolean kirliMi) {
		this.kirliMi = kirliMi;
	}
	
	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}
	public boolean isKirliMi() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	

}
