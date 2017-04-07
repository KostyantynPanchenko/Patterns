
package chainofresponsibility;

public class Demo {

    private static Logger getChainOfLoggers() {

        Logger consoleLogger = new ConsoleLogger(Logger.DEBUG);
        Logger fileLogger = new FileLogger(Logger.INFO);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an information.");
        System.out.println("*******************************");
        loggerChain.logMessage(Logger.DEBUG, "This is an debug level information.");
        System.out.println("*******************************");
        loggerChain.logMessage(Logger.ERROR, "This is an error information.");
    }

}
