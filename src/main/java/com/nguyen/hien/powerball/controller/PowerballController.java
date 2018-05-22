package com.nguyen.hien.powerball.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.nguyen.hien.powerball.Entity.PowerballDraw;
import com.nguyen.hien.powerball.Repository.PowerballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PowerballController {

    @Autowired
    private PowerballRepository repository;

    @Autowired
    MongoClient mongoClient;

    @RequestMapping("/helloworld")
    public @ResponseBody String helloWorld(){

        PowerballDraw powerballDraw = new PowerballDraw();

        List<Integer> winningNumbers = new ArrayList<>();

        winningNumbers.add(1);
        winningNumbers.add(2);
        winningNumbers.add(3);
        winningNumbers.add(4);
        winningNumbers.add(5);

        powerballDraw.setDraw(1);
        powerballDraw.setDrawDate(new Date());
        powerballDraw.setWinningNumbers(winningNumbers);
        powerballDraw.setPowerNumber(5);

        //repository.save(powerballDraw);

        MongoDatabase database = mongoClient.getDatabase("powerball");

        database.createCollection("PowerballDraws");

        MongoCollection<org.bson.Document> collection = database.getCollection("PowerballDraws");

        org.bson.Document document1 = new org.bson.Document();

        document1.put("test","test");

        collection.insertOne(document1);
        //mongoOperations.insert(powerballDraw);
        return "Hello World!";
    }
}
