package com.kreitek.editor.commands;

import com.kreitek.editor.Command;

import java.util.ArrayList;

public class UndoCommand implements Command {
    private final String lineBuffer;
    private final int position;

    public UndoCommand(String previousLine, int position) {
        this.lineBuffer = previousLine;
        this.position = position;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.remove(position);
        documentLines.add(position, lineBuffer);
    }
}
