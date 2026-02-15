package com.sainik.tacocloud.repository;

import com.sainik.tacocloud.models.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
