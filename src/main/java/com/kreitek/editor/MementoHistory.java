package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public class MementoHistory {
    private static volatile MementoHistory instance = null;
    private List<Memento> mementoList;
    private MementoHistory() {
        this.mementoList = new ArrayList<>();
    }

    public static MementoHistory getInstance() {
        if (instance == null){
            synchronized (MementoHistory.class){
                if (instance == null){
                    instance = new MementoHistory();
                }
            }
        }
        return instance;
    }
    public void add(Memento state){
        mementoList.add(state);
    }
    public void undo(ArrayList<String> lines){
        if (!mementoList.isEmpty()) {
            lines = mementoList.get(mementoList.size()-1).getState();
        }
    }
}
