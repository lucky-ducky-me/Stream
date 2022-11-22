package Weapon;

import lombok.Data;
import org.javatuples.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
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
    public static ArrayList<Pistol> getPistolsFrom(@NotNull ArrayList<Pistol> pistols, @NotNull String country) {
        return pistols.stream()
                .filter(pistol -> pistol.getCountry().equals(country))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение списка названий пистолетов и их стран-производителей.
     * @param pistols пистолеты.
     * @return список названий пистолетов и их стран-производителей
     */
    public static ArrayList<Pair<String, String>> getPistolsNameAndCountry(@NotNull ArrayList<Pistol> pistols) {
        return pistols.stream()
                .map(pistol -> new Pair<>(pistol.name, pistol.country))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение отстортированных пистолетов по калибру.
     * @param pistols пистолеты.
     * @return отстортированные пистолеты по калибру.
     */
    public static ArrayList<Pistol> getSortedByCalibre(@NotNull ArrayList<Pistol> pistols) {
         return pistols.stream()
                 .sorted(Comparator.comparingDouble(Pistol::getCalibre))
                 .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение отстортированных пистолетов по ёмкости магазина.
     * @param pistols пистолеты.
     * @return отстортированные пистолеты по ёмкости магазина.
     */
    public static ArrayList<Pistol> getSortedByMagazine(@NotNull ArrayList<Pistol> pistols) {
        return pistols.stream()
                .sorted(Comparator.comparingInt(Pistol::getMagazine))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Вывод пистолетов в консоль.
     * @param pistols пистолеты.
     */
    public static void printPistolsInConsole(@NotNull ArrayList<Pistol> pistols) {
        pistols.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return String.format("Навзвание: %s\n" +
                        "Страна производитель: %s\n" +
                        "Калибр: %s\n" +
                        "Ёмкость магазина: %s\n"
                , getName()
                , getCountry()
                , getCalibre()
                , getMagazine());
    }
}
