package org.example;
//immutable Allocation - kan ikke ændres efter create
public class Allocation {
    private final String room;
    private final String tas;

    public Allocation(String room, String tas) {
        this.room = room;
        this.tas = tas;
    }

    public String getRoom() {
        return room;
    }

    public String getTas() {
        return tas;
    }
}
