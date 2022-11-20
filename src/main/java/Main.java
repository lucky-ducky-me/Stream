import Weapon.Pistol;

import java.nio.file.Paths;

public class Main {
    static final String weaponJsonData = Paths.get("").toAbsolutePath().toString()
            + "\\src\\main\\resources\\";

    public static void main(String[] args) {
        var fileName = "test.json";

        var weaponData = JsonWeaponWorker.getWeaponData(weaponJsonData + fileName);
    }
}
