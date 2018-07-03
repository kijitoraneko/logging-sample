package jp.co.np.logging.sample.child.grandson;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Grandson {
    public static void execute() {
        Log logger = LogFactory.getLog(Grandson.class);
        logger.fatal("grandsonふぇーたる");
        logger.error("grandsonえらー");
        logger.warn("grandsonわーん");
        logger.info("grandsonいんほ");
        logger.debug("grandsonでばっぐ");
        logger.trace("grandsonとれーす");
    }
}
