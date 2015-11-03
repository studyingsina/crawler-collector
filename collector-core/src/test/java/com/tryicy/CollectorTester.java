package com.tryicy;

import java.io.File;

import org.archive.crawler.framework.CrawlJob;
import org.archive.crawler.framework.Engine;
import org.archive.util.TextUtils;
import org.junit.Test;

/**
 * Desc
 * 
 * @author: zhangjunwei
 * @Date: 2015年11月2日
 */
public class CollectorTester {

	@Test
	public void test() {
		String jobDir = "/Users/junweizhang/workspace/me/github/collector/collector-core/jobs";
		File jobDirFile = new File(jobDir);
		Engine engine = new Engine(jobDirFile);
		CrawlJob crawJob = engine.getJob(TextUtils.urlUnescape("job1"));
		// build job
		crawJob.validateConfiguration();
		// checkpoint
		// crawJob.getCheckpointService().setRecoveryCheckpointByName("");
		// launch job
		crawJob.launch();
		// pause job
		crawJob.getCrawlController().requestCrawlPause();
		// unpause or resume job
		crawJob.getCrawlController().requestCrawlResume();
		// pause job
		crawJob.getCrawlController().requestCrawlPause();
		// terminate job
		crawJob.terminate();
	}

}
