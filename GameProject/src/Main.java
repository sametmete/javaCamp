import java.time.LocalDate;

import Abstract.CampaignService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Samet");
		gamer1.setLastName("Mete");
		gamer1.setDateOfBirth(LocalDate.of(1994, 2, 26));
		gamer1.setNationalityId("21237864537");
		
		gamerManager.add(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign("Haftasonu fýrsatý",20);
		campaignManager.add(campaign1);
		
		SalesManager salesManager = new SalesManager();
		GameSale game1 = new GameSale("Mafia 3",320);
		salesManager.buyGame(game1, gamer1, campaign1);
	}

}
