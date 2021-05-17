package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isimli oyuncu kayýt oldu.");
			
		}
		else {
			System.out.println("Kimlik bilgileri doðrulanamadýðýndan kayýt iþlemi baþarýsýz oldu.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli oyuncu güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli oyuncu silindi.");
		
	}

}
