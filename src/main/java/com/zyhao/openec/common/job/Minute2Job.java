package com.zyhao.openec.common.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Minute2Job implements Job {
	Log logger = LogFactory.getLog(getClass());

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("JobName2: "+ context.getJobDetail().getKey().getName());
	}

}
