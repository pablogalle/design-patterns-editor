package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.MementoHistory;

import java.util.ArrayList;

public class UndoCommand implements Command {
    private MementoHistory history;
    public UndoCommand(MementoHistory history) {
        this.history = history;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        history.undo(documentLines);
    }
}
