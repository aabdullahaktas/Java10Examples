package lesson26;
import java.time.DayOfWeek;
import java.time.LocalDate;
/*
 * 
 * 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Optional;

/*
 *1- Bir limanımız olacak bu limanada yuk yerleştirlcek alanlar olacak 
 *  limandaki yuk yerleştilecek alan sayısı liman olusturulurken belirlenebilir
 *  veya her liman için 10 adet yk yeri olabilir
 *   her yukun bir agırlık bir kabul tarıhi olsun 
 *  
 *   2-Kendi exception sınıfımız yartalım ve uygulamamızda bir yukyeri sec metodu yapalım 
 *   --eger sectiğimiz yer dolu ise doluyer secimi diye bir hata fırlatsın 
 *   -- bir limandaki iki yeri default olarak dolduralım 
 *   --daha sonra yuk yeri sec metodunu çalıştıralım 
 *  3- yukyerisec2 --> eger sectiğmiz yer sınırlar dısında ise  sınırlar dısında hatasını 
 *  fırlatsın eger sectiğimiz yer dolu ise dolu yer secimi hatasını fırlatsın
 *  ---------Odev-----
 *  
 *  4- tarihbelirle metodu yazalım---> utilitydeki tarhi deger alma kullanılabilinir
 *  -- a)eger geçmiş tarih girilmişşe  Gecersiz kabul tarhi hatası fırlatsın
 *  	b)girdiğimiz gun  cumartesi veya pazar ise mesai gunleri dısı hatası versin 
 *  
 *  5- yukOlusturmetodu yazalım==> dısarıdan bir isim agırlıkalacagız ve tarih alacagız 
 *  -- agırlık ve tarihi yazdıgımız metotlar uzerinden alacagız 
 *  --eger hata yoksa bize bir tane yuk donsun 
 *  --eger hata var ise bize bos bir optional donsun 
 *   
 *   6- bu metotlarıda bir yuk kabulu metotlarında toplayıp butun kontrolleimden geçmiş ise
 *   -- basta aldığım index degerine yuku setleyelim 
 *   -- yukyerisec2, yukolustur bu iki metoto basarılı çalışmıssa yuk olusturdan donen yuku 
 *   limandaki yukler arayına index degeri ile setleyeceğiz
 *   
 */
public class Uygulama {

	Liman liman;

	public Uygulama() {
		this.liman = new Liman();
	}

	public static void main(String[] args) {

		
		//Yuk yuk = new Yuk("Yuk1", 1000, LocalDate.now());
		Uygulama uygulama = new Uygulama();
		uygulama.liman.getYukler()[3] = new Yuk("Yuk3", 100, LocalDate.now().minusDays(5));
		uygulama.liman.getYukler()[5] = new Yuk("Yuk5", 100, LocalDate.now().minusWeeks(2));
		//uygulama.yukYeriSec(yuk);

		Uygulama uygulama2 = new Uygulama();
		Optional<Yuk> yuk2 = uygulama2.yukOlustur();
//		try {
//			int index = uygulama.yukyeriSec2();
//			uygulama.liman.getYukler()[index] = yuk;
//		} catch (LimanException e) {
//			e.printStackTrace();
//		}

//		try {
//			//uygulama.agirlikBelirle();
//			uygulama.tarihBelirle();
//		} catch (LimanAppException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println(Arrays.toString(uygulama.liman.getYukler()));

		System.out.println("Program devam ediyor");

	}

	public void yukYeriSec(Yuk yuk) {

		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz");
		try {
			if (liman.getYukler()[index] != null) {
				throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
			} else {

				liman.getYukler()[index] = yuk;
				System.out.println("işlem başarılı");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Yuk yeri secimi başırısız");
		}

	}

	public int yukyeriSec2() throws LimanAppException {

		int index = Utility.intDegerAlma("Lütfen bir yuk yeri seciniz");

		if (liman.getYukler().length <= index || index < 0) {
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);
		}
		if (liman.getYukler()[index] != null) {

			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
		}

		return index;
	}

	public double agirlikBelirle() throws LimanAppException {

		double agirlik = Utility.doubleDegerAlma("Lütfen bir agırlık belirleyiniz");

		if (agirlik < 100) {
			throw new LimanAppException(ErrorType.YETERSIZ_AGIRLIK);
		}

		return agirlik;
	}
	public LocalDate tarihBelirle() throws LimanAppException {
		LocalDate date = Utility.stringTarihDegeriAlma("lutfen tarih belirleyiniz");
		if (date.isBefore(LocalDate.now())) {
			throw new LimanAppException(ErrorType.GECERSIZ_KABUL_TARİHİ);
		}
		if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)||(date.getDayOfWeek().equals(DayOfWeek.SATURDAY))) {
			throw new  LimanAppException(ErrorType.MESAI_GUNLERI_DISI);
		}
		return date;
	}
	public Optional<Yuk> yukOlustur(){
		Yuk konteyner = null;
		try {
			LocalDate date = tarihBelirle();
			double tonaj = agirlikBelirle();
			String isim = Utility.stringDegerAlma("lutfen yük ismi girinizzz");
			konteyner = new Yuk(isim, tonaj, date);

		} catch (LimanAppException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Optional.ofNullable(konteyner);
	}
	
	public void yukKabul()  {
		int index = -1;
		Optional<Yuk> yuk=Optional.empty();;
		try {
			index = yukyeriSec2();
			yuk = yukOlustur();
			
		} catch (LimanAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (yuk.isEmpty()) {
				System.out.println("yukunuz kabul olmamıstır");
			}else {
				System.out.println("yukunuz kabul olmustur"+index+" nolu yere yerlestirildi");
				liman.getYukler()[index]=yuk.get();
			}
			
		}
		
		
	}
	// *   6- bu metotlarıda bir yuk kabulu metotlarında toplayıp butun kontrolleimden geçmiş ise
	// *   -- basta aldığım index degerine yuku setleyelim 
	// *   -- yukyerisec2, yukolustur bu iki metoto basarılı çalışmıssa yuk olusturdan donen yuku 
	// *   limandaki yukler arayına index degeri ile setleyeceğiz

}
