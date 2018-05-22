package com.nguyen.hien.powerball.Repository;

import com.nguyen.hien.powerball.Entity.PowerballDraw;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PowerballRepository extends MongoRepository<PowerballDraw, String>{
}
