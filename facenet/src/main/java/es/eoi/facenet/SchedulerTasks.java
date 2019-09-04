package es.eoi.facenet;

import java.util.Calendar;
import java.util.logging.Logger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTasks {

	Logger logger = Logger.getLogger("SchedulerTasks");
//
//	@Scheduled(fixedRate = 2000)
//	public void scheduleTaskWithFixedRate() {
//		logger.info("Fixed Rate Task :: Execution Time - {}" + Calendar.getInstance());
//	}
//
//	public void scheduleTaskWithFixedDelay() {
//	}
//
//	public void scheduleTaskWithInitialDelay() {
//	}
//
//	public void scheduleTaskWithCronExpression() {
//	}
}