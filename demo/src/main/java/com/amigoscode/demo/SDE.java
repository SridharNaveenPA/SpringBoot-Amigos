package com.amigoscode.demo;

import java.util.Objects;

public class SDE {
    String name;
    Integer id;
    String stack;

    public SDE(String name, Integer id, String stack) {
        this.name = name;
        this.id = id;
        this.stack = stack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SDE sde = (SDE) o;
        return Objects.equals(name, sde.name) && Objects.equals(id, sde.id) && Objects.equals(stack, sde.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, stack);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
}
