package UI;

import java.time.LocalDate;
import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Entities.Gamer;

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
	}

}
