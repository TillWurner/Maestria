package Logger;

import java.time.LocalDate;

public class DateLogger extends LoggerDecorator {
    public DateLogger(Logger innerLogger) {
        super(innerLogger);
    }

    @Override
    public void log(String message) {
        String date = "[" + LocalDate.now() + "]";
        innerLogger.log(date + " " + message);
    }
}
