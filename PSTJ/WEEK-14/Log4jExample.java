import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.debug("Debugging info");

        try {
            int x = 10/0;
        } catch(Exception e){
            logger.error("Error occurred: " + e.getMessage());
        }

        logger.info("Application finished");
    }
}