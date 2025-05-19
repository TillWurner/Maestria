package Logger;

public class SeverityLogger extends LoggerDecorator {
    private String severity;

    public SeverityLogger(Logger innerLogger, String severity) {
        super(innerLogger);
        this.severity = severity;
    }

    @Override
    public void log(String message) {
        innerLogger.log("[" + severity.toUpperCase() + "] " + message);
    }
}
