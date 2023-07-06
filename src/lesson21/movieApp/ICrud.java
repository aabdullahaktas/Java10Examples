package lesson21.movieApp;

import java.util.List;

public interface ICrud<T,ID> {
	
	T kayitEt(List<T> list, T t);
	void guncelle(T t);
	void sil(ID id);
	
	
}
