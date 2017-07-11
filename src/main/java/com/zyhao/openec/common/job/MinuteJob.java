package com.zyhao.openec.common.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 该方法仅仅用来测试每分钟执行
 * @author lance
 */
public class MinuteJob implements Job{
	Log logger = LogFactory.getLog(getClass());

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("JobName: "+ context.getJobDetail().getKey().getName());
	}
}