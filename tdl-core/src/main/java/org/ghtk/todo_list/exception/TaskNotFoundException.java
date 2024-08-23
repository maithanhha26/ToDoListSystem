package org.ghtk.todo_list.exception;

import org.ghtk.todo_list.core_exception.exception.NotFoundException;

public class TaskNotFoundException extends NotFoundException {

  public TaskNotFoundException() {
    setStatus(404);
    setCode("TaskNotFoundException");
  }
}
