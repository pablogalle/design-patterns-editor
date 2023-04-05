package com.kreitek.editor.memento;

import java.util.ArrayList;

public class Memento {
    private ArrayList<String> state = new ArrayList<>();

    public ArrayList<String> getState() {
        return state;
    }

    public void setState(ArrayList<String> state) {
        this.state.addAll(state);
    }
}
