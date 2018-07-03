package jp.co.np.logging.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Parent {
    public static void execute() {
        Log logger = LogFactory.getLog(Parent.class);
        logger.fatal("parentふぇーたる");
        logger.error("parentえらー");
        logger.warn("parentわーん");
        logger.info("parentいんほ");
        logger.debug("parentでばっぐ");
        logger.trace("parentとれーす");
    }
}
