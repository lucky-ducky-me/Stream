package Weapon;

import lombok.Data;

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
}
