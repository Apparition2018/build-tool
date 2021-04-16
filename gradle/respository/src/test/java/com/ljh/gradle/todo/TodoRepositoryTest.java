package com.ljh.gradle.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TodoRepositoryTest
 *
 * @author Administrator
 * created on 2021/4/6 13:53
 */
public class TodoRepositoryTest {
    private TodoRepository repository = new TodoRepository();
    
    @Test
    public void testSave() {
        TodoItem item = new TodoItem("ljh");
        repository.save(item);
        Assertions.assertNull(repository.query(item.getName()));
    } 
}
