package com.noteapp.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by usuario on 11/01/2017.
 */

public class Notes implements Enumerable<Note> {

    private List<Note> noteList= new LinkedList<>();

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void add(Note element) {
        noteList.add(element);

    }

    @Override
    public void remove(int index) {
        noteList.remove(index);

    }

    @Override
    public void update(int index, Note newElement) {
        noteList.set(index, newElement);

    }

    @Override
    public List<Note> getAll() {
        return noteList;
    }
}
