package Concrete;

import Abstract.IGamerService;
import Abstract.IUserValidationService;
import Entities.Gamer;

public class GamerManager implements IGamerService {

	IUserValidationService _userValidationService;
	
	public GamerManager(IUserValidationService _userValidationService) {
		this._userValidationService = _userValidationService;
	}

	@Override
	public void Add(Gamer gamer) {
		if (_userValidationService.Validate(gamer))
        {
            System.out.println("Kayýt oldu");
        }
        else
        {
            System.out.println("Doðrulama baþarýsýz. Kayýt baþarýsýz");
        }
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Kayýt güncellendi");
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Kayýt silindi");
	}

}
