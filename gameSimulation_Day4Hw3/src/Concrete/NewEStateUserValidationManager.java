package Concrete;

import Abstract.IUserValidationService;
import Entities.Gamer;

public class NewEStateUserValidationManager implements IUserValidationService {

	@Override
	public boolean Validate(Gamer gamer) {
		return true;
	}

}
