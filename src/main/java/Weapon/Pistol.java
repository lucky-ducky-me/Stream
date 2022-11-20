package Weapon;

import lombok.Data;
import org.javatuples.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Пистолет.
 */
@Data
public class Pistol {
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
     * Получение пистолетов из указанной стран.
     * @param pistols пистолеты.
     * @param country указанная страна.
     * @return пистолеты из указанной страны.
     */
    static ArrayList<Pistol> getPistolsFrom(@NotNull ArrayList<Pistol> pistols, @NotNull String country) {
        return pistols.stream()
                .filter(pistol -> pistol.getCountry().equals(country))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение списка названий пистолетов и их стран-производителей.
     * @param pistols пистолеты.
     * @return список названий пистолетов и их стран-производителей
     */
    static ArrayList<Pair<String, String>> getPistolsNameAndCountry(ArrayList<Pistol> pistols) {
        return pistols.stream()
                .map(pistol -> new Pair<>(pistol.name, pistol.country))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
