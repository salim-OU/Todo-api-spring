package com.commerce.todo_api_v1.repository;

import com.commerce.todo_api_v1.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITodoRepository extends JpaRepository<Todo, Long> {
}
