package com.github.ruchir.springapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    class Person{
        String name;
        Integer age;
        Person(String name,Integer age){
            this.name = name;
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @GetMapping("/")
    public ResponseEntity<Person> sayHello(){
        String message = "Hello From Spring";
        Person ruchir = new Person("Ruchir",24);
        ResponseEntity<Person> res = new ResponseEntity(ruchir,HttpStatus.OK);
        return res;
    }
}
