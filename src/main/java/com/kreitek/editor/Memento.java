package com.kreitek.editor;

import java.util.ArrayList;

public class Memento {
    private ArrayList<String> state = new ArrayList<String>();

    public Memento(ArrayList<String> state) {
        this.state = state;
    }

    public ArrayList<String> getState() {
        return state;
    }
}
