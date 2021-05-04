package Abstract;

import Entities.Campaign;
import Entities.Sales;

public interface ISalesService {
	void Sell(Sales sales, Campaign campaign);
}
