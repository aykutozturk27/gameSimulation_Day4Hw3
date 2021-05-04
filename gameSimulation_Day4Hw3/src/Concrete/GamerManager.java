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
            System.out.println("Kay�t oldu");
        }
        else
        {
            System.out.println("Do�rulama ba�ar�s�z. Kay�t ba�ar�s�z");
        }
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Kay�t g�ncellendi");
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Kay�t silindi");
	}

}
