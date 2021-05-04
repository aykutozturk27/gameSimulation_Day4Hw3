package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Sales;

public class SalesManager implements ISalesService {

	@Override
	public void Sell(Sales sales, Campaign campaign) {
		System.out.println("Satýþ yapýldý: " + sales.getSalesPrice() + "TL Satýþ Miktarý: " + sales.getSalesAmount() + "Adet");
		if (sales.getSalesAmount() == 0)
        {
			System.out.println("Kampanya uygulandý");
        }
        else
        {
        	System.out.println("Üzgünüz: " + campaign.getCampaignName() + " kampanya uygulanamadý");
        }
	}

}
