package com.portfolio.repositories;

import com.portfolio.entities.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by BHarris on 4/20/17.
 */
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
