package log4j.demo;


import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class);
        logger.info("sssssssssssssssssssss");
        logger.error("这是错误");
    }
}
