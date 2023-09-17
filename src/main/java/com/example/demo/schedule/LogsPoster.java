package com.example.demo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LogsPoster {
    private final static Logger LOGGER = LoggerFactory.getLogger(LogsPoster.class);

    @Scheduled(fixedRate = 100)
    public void postTraced(){LOGGER.trace("Trace message!");}

    @Scheduled(fixedRate = 200)
    public void postDebag(){LOGGER.debug("Trace debug!");}

    @Scheduled(fixedRate = 300)
    public void postInfo(){LOGGER.info("Trace info!");}

    @Scheduled(fixedRate = 500)
    public void postWarn(){LOGGER.warn("Trace warn!");}

    @Scheduled(fixedRate = 1000)
    public void postError(){LOGGER.error("Trace error!");}

    @Scheduled(fixedRate = 1000)
    public void postEcxeption(){
        throw new RuntimeException("Exception");
    }
}
