import db.DBHelper;
import db.DBPirate;
import db.DBShip;
import models.Ship;
import models.Pirate;
import models.Weapon;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Ship pearl = new Ship("The Black Pearl");
        DBHelper.save(pearl);

        Ship dutchman = new Ship("The Flying Dutchman");
        DBHelper.save(dutchman);

        File file1 = new File("Jack", "Sparrow", 32, Weapon.CUTLASS, pearl);
        DBHelper.save(file1);
        File file2 = new File("Hector", "Barbossa", 65, Weapon.PISTOL, pearl);
        DBHelper.save(file2);
        File file3 = new File("Will", "Turner", 23, Weapon.DAGGER, dutchman);
        DBHelper.save(file3);



        List<Pirate> pirates = DBHelper.getAll(Pirate.class);

        Pirate foundPirate = DBHelper.find(Pirate.class, pirate1.getId());

        int damageValue = foundPirate.getWeapon().getDamageValue();

        List<Pirate> piratesOnPearl = DBShip.getCrewForShip(pearl);

    }
}
