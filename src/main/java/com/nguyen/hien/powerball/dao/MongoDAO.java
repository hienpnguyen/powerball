package com.nguyen.hien.powerball.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

public class MongoDAO {

    @Autowired
    MongoRepository mongoRepository;

    public String mongoTest(){
        return mongoRepository.findAll().toString();
    }
}
