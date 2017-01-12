package com.noteapp.model;

import java.util.List;

/**
 * Created by usuario on 11/01/2017.
 */

public interface Enumerable<T> {
    int count();
    void add (T element);
    void remove (int index);
    void update (int index, T newElement);
    List<Note> getAll();
}
