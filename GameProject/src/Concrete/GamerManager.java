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
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isimli oyuncu kay�t oldu.");
			
		}
		else {
			System.out.println("Kimlik bilgileri do�rulanamad���ndan kay�t i�lemi ba�ar�s�z oldu.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli oyuncu g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli oyuncu silindi.");
		
	}

}
