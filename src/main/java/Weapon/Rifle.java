package Weapon;

import lombok.Data;
import org.javatuples.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
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
    static ArrayList<Rifle> getRiflesFrom(@NotNull ArrayList<Rifle> rifles, @NotNull String country) {
        return rifles.stream()
                .filter(rifle -> rifle.getCountry().equals(country))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение списка названий винтовок и их стран-производителей.
     * @param rifles винтовки.
     * @return список названий винтовок и их стран-производителей
     */
    static ArrayList<Pair<String, String>> getRiflesNameAndCountry(@NotNull ArrayList<Rifle> rifles) {
        return rifles.stream()
                .map(rifle -> new Pair<>(rifle.name, rifle.country))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение отстортированных винтовок по калибру.
     * @param rifles винтовки.
     * @return отстортированные винтовки по калибру.
     */
    static ArrayList<Rifle> getSortedByCalibre(@NotNull ArrayList<Rifle> rifles) {
        return rifles.stream()
                .sorted(Comparator.comparingDouble(Rifle::getCalibre))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Получение отстортированных винтовок по калибру.
     * @param rifles винтовки.
     * @return отстортированные винтовки по калибру.
     */
    static ArrayList<Rifle> getSortedByMagazine(@NotNull ArrayList<Rifle> rifles) {
        return rifles.stream()
                .sorted(Comparator.comparingInt(Rifle::getMagazine))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Вывод винтовок в консоль.
     * @param rifles винтовки.
     */
    static void printPistolsInConsole(@NotNull ArrayList<Pistol> rifles) {
        rifles.forEach(rifle -> {
            System.out.println(String.format("Навзвание: %s\n" +
                            "Страна производитель: %s\n" +
                            "Калибр: %s\n" +
                            "Ёмкость магазина: %s\n"
                    , rifle.getName()
                    , rifle.getCountry()
                    , rifle.getCalibre()
                    , rifle.getMagazine()));
        });
    }
}
