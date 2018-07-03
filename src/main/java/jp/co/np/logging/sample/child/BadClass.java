package jp.co.np.logging.sample.child;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BadClass {
    public static void main(String[] args) {
        Log logger = LogFactory.getLog(BadClass.class);
        logger.debug("bad Class");
    }
}
