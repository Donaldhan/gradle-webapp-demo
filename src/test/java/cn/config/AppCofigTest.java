package cn.config;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.home.config.AppConfig;
import cn.home.modules.beans.entity.DbInfo;
import cn.home.util.JacksonUtil;


public class AppCofigTest {
	private static final Logger log = LoggerFactory.getLogger(AppCofigTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		DbInfo dbInfo = ctx.getBean(DbInfo.class);
		log.info("dbInfo:{}",JacksonUtil.getInstance().toJson(dbInfo));
	}

}
