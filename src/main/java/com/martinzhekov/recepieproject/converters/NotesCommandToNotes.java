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
public class NotesCommandToNotes implements Converter<NotesCommand, Note> {

    @Synchronized
    @Nullable
    @Override
    public Note convert(NotesCommand source) {
        if (source == null) {
            return null;
        }

        final Note notes = new Note();
        notes.setId(source.getId());
        notes.setRecipeNotes(source.getRecipeNotes());
        return notes;
    }
}
