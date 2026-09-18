package org.example;

public class Allocation {
    private String room;
    private String tas;

    public Allocation(String room, String tas) {
        this.room = room;
        this.tas = tas;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTas() {
        return tas;
    }

    public void setTas(String tas) {
        this.tas = tas;
    }
}
