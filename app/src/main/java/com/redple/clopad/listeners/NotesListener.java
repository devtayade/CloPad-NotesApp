package com.redple.clopad.listeners;

import com.redple.clopad.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
