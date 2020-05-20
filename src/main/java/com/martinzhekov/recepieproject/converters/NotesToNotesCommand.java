package com.martinzhekov.recepieproject.converters;

import com.martinzhekov.recepieproject.commands.NotesCommand;
import com.martinzhekov.recepieproject.domain.Note;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;



/**
 * Created by martinzhekov on 19.05.20
 */

@Component
public class NotesToNotesCommand implements Converter<Note, NotesCommand> {

    @Synchronized
    @Nullable
    @Override
    public NotesCommand convert(Note source) {
        if (source == null) {
            return null;
        }

        final NotesCommand notes = new NotesCommand();
        notes.setId(source.getId());
        notes.setRecipeNotes(source.getRecipeNotes());
        return notes;
    }
}
