package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Sales;

public class SalesManager implements ISalesService {

	@Override
	public void Sell(Sales sales, Campaign campaign) {
		System.out.println("Sat�� yap�ld�: " + sales.getSalesPrice() + "TL Sat�� Miktar�: " + sales.getSalesAmount() + "Adet");
		if (sales.getSalesAmount() == 0)
        {
			System.out.println("Kampanya uyguland�");
        }
        else
        {
        	System.out.println("�zg�n�z: " + campaign.getCampaignName() + " kampanya uygulanamad�");
        }
	}

}
