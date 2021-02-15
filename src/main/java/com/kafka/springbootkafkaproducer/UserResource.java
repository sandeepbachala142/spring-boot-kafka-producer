package com.kafka.springbootkafkaproducer;

import com.kafka.springbootkafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    KafkaTemplate<String,User> kafkaTemplate;

    private static final String topic ="TestTopic";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name){
        kafkaTemplate.send(topic,new User(name,30,5464));
        return  "Published Successfully";
    }

    @PostMapping ("/test")
    public String method(){
        return "Got it";
    }





}
