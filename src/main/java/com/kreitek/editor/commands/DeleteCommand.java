package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;
import com.kreitek.editor.MementoHistory;

import java.util.ArrayList;

public class DeleteCommand implements Command {
    private final int lineNumber;
    private final MementoHistory history;

    public DeleteCommand(int lineNumber, MementoHistory history) {
        this.lineNumber = lineNumber;
        this.history = history;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        history.add(new Memento(documentLines));
        documentLines.remove(lineNumber);
    }
}
