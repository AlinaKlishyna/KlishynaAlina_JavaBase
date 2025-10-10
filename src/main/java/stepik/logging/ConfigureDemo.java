package stepik.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class ConfigureDemo {
    private static void configureLogging() {
        // your implementation here
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new XMLFormatter());
        consoleHandler.setLevel(Level.ALL);

        Logger logger = Logger.getLogger("org.stepic.java");
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);
        loggerA.addHandler(consoleHandler);
        loggerA.setUseParentHandlers(false);

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);
        loggerB.addHandler(consoleHandler);
        loggerB.setUseParentHandlers(false);
    }
}
