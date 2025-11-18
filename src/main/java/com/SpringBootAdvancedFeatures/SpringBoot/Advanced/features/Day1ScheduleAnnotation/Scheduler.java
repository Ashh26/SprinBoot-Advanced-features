package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day1ScheduleAnnotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

    // Method
    // To trigger the scheduler every 15 Seconds
    // between 19:00 PM to 19:15 PM
//    @Scheduled(cron = "0 * 9 * * ?")
//    //@Scheduled(cron = "0 * 9 * * ?",fixedRate = 2000) // can not take both element only single at a time.
//    public void scheduledTask(){
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
//
//        String strDate = dateFormat.format(new Date());
//        System.out.println("Cron Job Scheduler: Job running at "+strDate);

//    }



       // Method
//    // To trigger the scheduler to run every ten seconds
//    @Scheduled(fixedRate = 10000)
//    public void scheduledTask(){
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
//
//        String strDate = dateFormat.format(new Date());
//        System.out.println("Fixed Rate Scheduler: Job running at "+strDate);
//
//    }


    // Method
    // To trigger the scheduler every 3 seconds with
    // an initial delay of 5 seconds.
//    @Scheduled(initialDelay = 10000,fixedDelay = 3000)
    public void scheduledTask(){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        String strDate = dateFormat.format(new Date());
        System.out.println("Fixed Delay Scheduler: Job running at "+strDate);

    }

}
