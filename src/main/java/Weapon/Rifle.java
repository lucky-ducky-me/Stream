package Weapon;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Винтовка.
 */
@Data
public class Rifle {
    /**
     * Название.
     */
    String name;

    /**
     * Калибр.
     */
    double calibre;

    /**
     * Страна-создатель.
     */
    String country;

    /**
     * Ёмкость магазина.
     */
    int magazine;

    /**
     * Получение винтовок из указанной стран.
     * @param rifles винтовки.
     * @param country указанная страна.
     * @return винтовки из указанной страны.
     */
    static ArrayList<Pistol>
    GetRiflesFrom(@NotNull ArrayList<Pistol> rifles, @NotNull String country) {
        return rifles.stream()
                .filter(rifle -> rifle.getCountry().equals(country))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
