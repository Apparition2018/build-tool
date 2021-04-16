package com.ljh.gradle.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * TodoRepository
 *
 * @author Administrator
 * created on 2021/4/6 10:44
 */
public class TodoRepository {
    private static Map<String, TodoItem> items = new HashMap<>();
    
    public void save(TodoItem item) {
        System.out.println("" + item);
        items.put(item.getName(), item);
    }
    
    public TodoItem query(String name) {
        return items.get(name);
    }
}
