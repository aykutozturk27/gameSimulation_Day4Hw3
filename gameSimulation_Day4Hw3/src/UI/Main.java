package UI;

import java.time.LocalDate;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Sales;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Aykut");
		gamer.setLastName("Öztürk");
		gamer.setDateOfBirth(LocalDate.of(1992, 4, 27));
		gamer.setNationalityId("12345678910");
		gamerManager.Add(gamer);
		
        Campaign campaign = new Campaign();
        campaign.setCampaignName("4 al 3 öde");
        campaign.setCampaignStart(LocalDate.of(2021, 4, 10));
        campaign.setCampaignFinish(LocalDate.of(2021, 5, 10));
        
        SalesManager salesManager = new SalesManager();
        Sales sales = new Sales();
        sales.setSalesPrice(300);
        sales.setSalesAmount(10);

        salesManager.Sell(sales, campaign);
	}

}
