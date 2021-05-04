package Adapters;

import Abstract.IUserValidationService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserValidationService {
	@Override
	public boolean Validate(Gamer gamer) {
		try {
			KPSPublicSoap client = new KPSPublicSoapProxy();
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
