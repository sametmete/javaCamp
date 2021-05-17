package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buyGame(GameSale gameSale, Gamer gamer, Campaign campaign) {
		double total = (gameSale.getGamePrice())-((gameSale.getGamePrice()*campaign.getDiscount())/100);
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isimli kullanýcý "
				+gameSale.getGameName()+" isimli oyunu fiyatý : "+gameSale.getGamePrice()+" TL'den %"
				+campaign.getDiscount()
				+" indirim oraný uygulanarak "+total+"TL'den satýn aldý.");
		
		
	}



}
