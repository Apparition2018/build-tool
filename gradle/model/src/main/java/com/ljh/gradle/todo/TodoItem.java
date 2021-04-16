package com.ljh.gradle.todo;

/**
 * TodoItem
 *
 * @author Arsenal
 * created on 2021/4/2 1:51
 */
public class TodoItem {

    // 代办事项名称
    private String name;
    // 已完成
    private boolean hasDone;

    public TodoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }

    @Override
    public String toString() {
        return name + (hasDone ? " hasDone" : " need to do") + "!";
    }
}
