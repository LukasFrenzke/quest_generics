package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericList<I> {
    private List<I> items;

    public GenericList() {
        this.items = new ArrayList<>();
    }

    public void addItem(I object) {
        this.items.add(object);
    }

    public I removeItem(int index) {
        return this.items.remove(index);
    }

    public I getItem(int index) {
        return this.items.get(index);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }


}