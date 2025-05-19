package Logger;

public abstract class LoggerDecorator implements Logger {
    protected Logger innerLogger;

    public LoggerDecorator(Logger innerLogger) {
        this.innerLogger = innerLogger;
    }
}
