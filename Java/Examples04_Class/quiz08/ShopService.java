package q01.quiz04.quiz08;

public class ShopService {

	private static ShopService ss = new ShopService();
	
	public ShopService() {
	}
	
	public static ShopService getInstance(){
		return ss;
	}
	
}
