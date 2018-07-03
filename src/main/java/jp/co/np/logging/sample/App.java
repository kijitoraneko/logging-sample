package jp.co.np.logging.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class App {
    public static void main(String[] args) {
        Log logger = LogFactory.getLog(App.class);
        logger.debug("hello world");
    }
}
