package jp.co.np.logging.sample.child;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Child {
    public static void execute() {
        Log logger = LogFactory.getLog(Child.class);
        logger.fatal("childふぇーたる");
        logger.error("childえらー");
        logger.warn("childわーん");
        logger.info("childいんほ");
        logger.debug("childでばっぐ");
        logger.trace("childとれーす");
    }
}
