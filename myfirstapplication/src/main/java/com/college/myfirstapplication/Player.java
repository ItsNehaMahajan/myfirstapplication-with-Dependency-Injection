package com.college.myfirstapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Player {
  Coach coach;

@Autowired
 Player(Coach ncoach){

    this.coach=ncoach;
}
@GetMapping ("/dailyworkout")
public String dailyworkout(){

    return coach.dailyworkout();
    }


}
