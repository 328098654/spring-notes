package org.zp.notes.spring.beans.autowire;

public class Poetry {
    String name;

    public Poetry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
