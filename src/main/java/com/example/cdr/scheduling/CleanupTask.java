package com.example.cdr.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanupTask {

  @Scheduled(cron = "0 0 2 * * *")
  public void purgeOldRecords() {
    
  }
}
