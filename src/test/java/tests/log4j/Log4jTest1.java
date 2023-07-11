package tests.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest1 {

    private static Logger logger=LogManager.getLogger(Log4jTest1.class.getName());

    @Test
    public void log4jTest1(){
        logger.info("Log Info");
        logger.debug("Log Debug");
        logger.error("Log Error");
        logger.fatal("Log Fatal");
    }
}
