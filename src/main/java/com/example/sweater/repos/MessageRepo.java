package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    // findByTag стандартный метод описаный в документации Spring JPA
    List<Message> findByTag(String tag);
}
