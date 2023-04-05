package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.memento.CareTaker;
import com.kreitek.editor.memento.Memento;

import java.util.ArrayList;

public class UndoCommand implements Command {
    private final CareTaker history = CareTaker.getInstance();

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        Memento memento = history.undo();
        history.deleteLast();
        documentLines.addAll(memento.getState());

    }
}
