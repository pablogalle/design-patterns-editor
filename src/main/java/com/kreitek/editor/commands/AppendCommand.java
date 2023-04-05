package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;
import com.kreitek.editor.MementoHistory;

import java.util.ArrayList;

public class AppendCommand implements Command {
    private final String text;
    private final MementoHistory history;

    public AppendCommand(String text, MementoHistory history) {
        this.text = text;
        this.history = history;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        history.add(new Memento(documentLines));
        documentLines.add(text);
    }
}
