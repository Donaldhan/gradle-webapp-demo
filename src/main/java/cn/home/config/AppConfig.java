package cn.home.config;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import cn.home.modules.beans.entity.DbInfo;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "cn.home.modules")
@PropertySource("classpath:jdbc.properties")
public class AppConfig  {
	private static final Logger log = LoggerFactory.getLogger(Logger.class);
	private static final String JDBC_URL = "jdbc.url";
	private static final String JDBC_USERNAME = "jdbc.username";
	private static final String JDBC_PASSWORD = "jdbc.password";
	private static final String JDBC_DRIVE_CLASS_NAME = "jdbc.driverClassName";
	// 初始化时数据库连接数
	private static final int INITIAL_THREAD = 5;
	// 空闲时保存数据库连接数
	private static final int MINIDLE_THREAD = 2;
	// 数据库连接池最大连接数
	private static final int MAX_ACTIVE_THREAD = 100;
	// 数据库连接等待的最长时间
	private static final int MAX_WAIT = 1000;
	// 检查连接是否正常的查询
	private static final String CHECK_CONNECTION_QUERY = "Select 'X'";
	// 连接池状态监控过滤器名
	private static final String STAT_FILETER = "mergeStat";

	// MyBait sql文件
	private static final String MY_BAITS_MAPPER_PATH = "classpath*:mappers/**/**.xml";
	@Autowired
	Environment env;
	@Bean
	DbInfo dbInfo() {
		DbInfo dbInfo = new DbInfo();
		dbInfo.setUrl(env.getProperty(JDBC_URL));
		dbInfo.setDriverClassName(env.getProperty(JDBC_USERNAME));
		dbInfo.setUsername(env.getProperty(JDBC_PASSWORD));
		dbInfo.setPassword(env.getProperty(JDBC_DRIVE_CLASS_NAME));
		return dbInfo;
	}
	
}
