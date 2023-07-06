package lesson21.movieApp;

import java.util.List;

public class Manager<T,ID> implements ICrud<T,ID>{

	@Override
	public T kayitEt(List<T> list, T t) {
		list.add(t);
		return t;
	}

	@Override
	public void guncelle(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sil(ID id) {
		System.out.println(id.getClass().getName());
		
	}







}
