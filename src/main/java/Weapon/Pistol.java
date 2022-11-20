package Weapon;

import lombok.Data;

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
}
