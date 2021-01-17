package io.hexlet.xo.model;

public class Game {
    private final Player[] players;

    private final Field field;

    private final String name;

    public Game(Player[] players, Field field, String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }
}
