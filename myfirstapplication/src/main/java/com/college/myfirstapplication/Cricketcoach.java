package com.college.myfirstapplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class Cricketcoach implements Coach {

   public String dailyworkout(){

        return "Practice cricket";

    }
}
