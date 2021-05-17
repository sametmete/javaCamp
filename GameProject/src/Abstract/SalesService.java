package Abstract;

import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public interface SalesService {

	void buyGame(GameSale gameSale,Gamer gamer,Campaign campaign);
}
