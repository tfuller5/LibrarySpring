package com.example.demo.Test;



import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class timeService {
    // Services: seperation of concerns: keep the business logic away from controller
    // Models: Student, name, age,
    // Stand up which is mainly scrum this is daily - 15 mins
    // sprints which is 2 weeks (10 working days)
    // before each sprint starts we have a refinement session which involves poker planning
    // . go through user stories all together and we size each one
    // sizing is done in fubinacci and then it gets revealed

    // towards end of sprint we have a small session to discuss what each dev did
    // soon -> before refinement each dev can go through the code of each US

    // vodaphone: paymonthly section
    public static String getCurrentTime() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        return timeStamp;
    }
}
