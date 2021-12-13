package sample.vulnerable.log4j.direct.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger("App");
	
    public static void main(String[] args) {
		logger.error("Args: {}", (Object[])(args));
    }
}
