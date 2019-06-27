package log4j.demo;


import org.apache.log4j.Logger;

import java.util.Date;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = CustomLog.getInstance().createLogger("d:/logggg/", "wd_error", "--->"+new Date(), true);
        CustomLog.getInstance().customLog(logger,"测试");
        CustomLog.getInstance().customLog(logger,"222222222222");
        CustomLog.getInstance().closeCustomLog(logger);


    }
}
