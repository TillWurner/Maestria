package Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new DateLogger(
                            new TimeLogger(
                                new SeverityLogger(
                                    new BasicLogger(),
                                    "ERROR"
                                )
                            )
                        );

        logger.log("Mensaje de error");
    }
}
