package lesson29;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SerializationTest {
	
	public static void main(String[] args) {
		Movie movie = new Movie("Seven", "Drama", LocalDate.of(1995, 05, 06));
		Movie movie3 = new Movie("Pulp Fiction", "Drama", LocalDate.of(1994, 05, 06));
		
		List<Movie> movieList = new ArrayList<>(List.of(movie,movie3));
		//serilization(movieList);
		serilizationList2(movieList);
		deserilizationList2(movieList);
//		List<Movie> yeniListe = deserilizationList();
//		if (yeniListe.isEmpty()) {
//			System.out.println("basarısız");
//		}else {
//			yeniListe.forEach(System.out::println);
//		}
		
		
//		//serilization(movie);
//		Optional<Movie> movie2 =deserilization();
//		if (movie2.isEmpty() ) {
//			System.out.println("deserilize islemi basarısız");
//		}else {
//			System.out.println("deserilize basarılı");
//			System.out.println(movie2.get());
//		}
	}
	
	private static List<Movie> deserilizationList2(List<Movie> movieList) {
		List<Movie> list = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:/Users/Asus/Desktop/intellij-projects/Listeeee/seri.txt"))){
			list = (List<Movie>)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private static void serilizationList2(List<Movie> movieList) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Asus/Desktop/intellij-projects/Listeeee/seri3.txt"))){
			oos.writeObject(movieList);
			System.out.println("serilize islemi basarılı");
		} catch (Exception e) {
			System.out.println("serilize islemi basarısız");
			e.printStackTrace();
		}
	}

	public static void serilization(List<Movie> movieList) {
		try (ObjectOutputStream oos 
	               = new ObjectOutputStream(new FileOutputStream("C:/Users/Asus/Desktop/intellij-projects/Listeeee/seri.txt"))){
			for (Movie movie : movieList) {
				oos.writeObject(movie);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Movie> deserilizationList(){
		List<Movie> movieList = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:/Users/Asus/Desktop/intellij-projects/Listeeee/seri.txt"))){
			
			Movie movie = null;
			while ((movie = (Movie) ois.readObject())!= null) {
				movieList.add(movie);
			}
			
		}catch (EOFException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return movieList;
	}

	public static void serilization(Movie movie) {
		try (ObjectOutputStream oos 
               = new ObjectOutputStream(new FileOutputStream("C:/Users/Asus/Desktop/intellij-projects/Listeeee/seri.txt"))){
			oos.writeObject(movie);
			System.out.println("serileştirme basarılı");
		} catch (FileNotFoundException e) {
			System.out.println("serileştirme basarısız");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("serileştirme basarısız");
			e.printStackTrace();
		}
	}
	public static Optional<Movie> deserilization() {
		Movie movie = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/Asus/Desktop/intellij-projects/Listeeee/seri.txt"))){
				movie = (Movie)ois.readObject();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(movie);
	}
}
