import java.io.IOException;
import java.util.logging.*;

public class LoggerMP {

    Logger log ;
    FileHandler handler;
    SimpleFormatter sFormat;

    public LoggerMP() {
        log = Logger.getLogger(LoggerMP.class.getName());
        try {
            handler = new FileHandler(
                    "C:/Users/GeegBrains/Programming/Java/Homework/JAVA_OOP/Loggy.txt");
            log.addHandler(handler);
            sFormat = new SimpleFormatter();
            handler.setFormatter(sFormat);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public void setLogger(String data)  {
        
        log.info(data.toString());
    }

}
