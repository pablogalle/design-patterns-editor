package com.kreitek.editor.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private static volatile CareTaker instance = null;
    private List<Memento> mementoList = new ArrayList<>();

    private CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    public static CareTaker getInstance() {
        if (instance == null) {
            synchronized (CareTaker.class) {
                if (instance == null) {
                    instance = new CareTaker();
                }
            }
        }
        return instance;
    }

    public void add(Memento state) {
        mementoList.add(state);
    }

    public void deleteLast() {
        if (!mementoList.isEmpty()) {
            mementoList.remove(mementoList.size() - 1);
        }
    }

    public Memento undo() {
        try {
            int index = mementoList.size() - 2;
            return mementoList.get(index);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No more changes to undo");
        }
        return MementoFactory.getMemento();
    }
}
