package com.shihe.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 自定义线程池
 */
@Configuration
@EnableAsync
public class ExecutorConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.shihe.config.ExecutorConfig.class);

    /**
     * Set the ThreadPoolExecutor's core pool size.
     */
    private int corePoolSize = 15;
    /**
     * Set the ThreadPoolExecutor's maximum pool size.
     */
    private int maxPoolSize = 50;
    /**
     * Set the capacity for the ThreadPoolExecutor's BlockingQueue.
     */
    private int queueCapacity = 100000;

    private String threadNamePrefix = "SGDExecutor-";

    @Bean(name = "poolTaskExecutor")
    public ThreadPoolTaskExecutor asyncServiceExecutor(){
        LOGGER.info("start asyncServiceExecutor config");
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
        //核心线程数 i
        pool.setCorePoolSize(corePoolSize);
        //最大线程数
        pool.setMaxPoolSize(maxPoolSize);
        //阻塞队列大小
        pool.setQueueCapacity(queueCapacity);
        //线程池名称
        pool.setThreadNamePrefix(threadNamePrefix);
        //拒绝策略
        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        pool.setWaitForTasksToCompleteOnShutdown(true);
        pool.setAwaitTerminationSeconds(60);

        LOGGER.info("end asyncServiceExecutor config");
        return pool;
    }

}
