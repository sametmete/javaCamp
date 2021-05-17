package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buyGame(GameSale gameSale, Gamer gamer, Campaign campaign) {
		double total = (gameSale.getGamePrice())-((gameSale.getGamePrice()*campaign.getDiscount())/100);
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isimli kullan�c� "
				+gameSale.getGameName()+" isimli oyunu fiyat� : "+gameSale.getGamePrice()+" TL'den %"
				+campaign.getDiscount()
				+" indirim oran� uygulanarak "+total+"TL'den sat�n ald�.");
		
		
	}



}
