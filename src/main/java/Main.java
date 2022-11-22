import Weapon.Pistol;

import java.nio.file.Paths;

public class Main {
    static final String weaponJsonData = Paths.get("").toAbsolutePath().toString()
            + "\\src\\main\\resources\\";

    public static void main(String[] args) {
        var fileName = "test.json";

        var weaponData = JsonWeaponWorker.getWeaponData(weaponJsonData + fileName);

        var pistols= weaponData.getPistols();

        System.out.println(pistols);

        System.out.println("Пистолеты из России: ");

        System.out.println(Pistol.getPistolsFrom(pistols, "Russia"));

        System.out.println("Все пистолеты и их страны: ");

        System.out.println(Pistol.getPistolsNameAndCountry(pistols));

        System.out.println("Пистолеты отсортированные по калибру: ");

        System.out.println(Pistol.getSortedByCalibre(pistols));

        System.out.println("Пистолеты отсортированные по магазину: ");

        System.out.println(Pistol.getSortedByMagazine(pistols));
    }
}
