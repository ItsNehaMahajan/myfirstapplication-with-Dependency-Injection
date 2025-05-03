package com.college.myfirstapplication;

import org.springframework.stereotype.Component;

@Component
public class Footballcoach implements Coach {

    public String dailyworkout(){

        return "Practice Football";

    }
}
