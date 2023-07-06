package lesson21.movieApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {
	public static void main(String[] args) {
		
		Manager<Film,String> filmManager = new Manager<>();
		Manager<Cast,Long> castManager = new Manager<>();
		Yonetmen yonetmen = new Yonetmen("miyazaki", null);
		
		castManager.kayitEt(Database.casts,yonetmen);
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		String id = UUID.randomUUID().toString();
		System.out.println(id);
		
		
		castManager.sil(15345L);
		filmManager.sil("fds");
		
		Film film = new Film("ruhların kaçısı", List.of(ETur.ANIME,ETur.DRAMA), yonetmen);
		
		filmManager.kayitEt(Database.filmList,film);
		
		List<Film> list = new ArrayList<>();
		listeyeEkle(list, film);
		System.out.println(list.get(0));
		
		
	}
	
	public static <T> void listeyeEkle(List<T> list, T t) {
		list.add(t);
	}

}
