package Patterns.Generative.Singleton;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Singleton {

    private static Singleton singleton = new Singleton(23);

    private int id;

    private Singleton(int id) { this.id = id; }

    @Contract(value = " -> new", pure = true)
    public static @NotNull Singleton getInstance() { return singleton; }

    public int getId() { return id; }



}

// Класс имеет один экзкмпляр
// private - Конструктор, static Метод который возвращает единственный обьект
