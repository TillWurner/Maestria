package Logger;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeLogger extends LoggerDecorator {
    public TimeLogger(Logger innerLogger) {
        super(innerLogger);
    }

    @Override
    public void log(String message) {
        String time = "[" + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "]";
        innerLogger.log(time + " " + message);
    }
}
