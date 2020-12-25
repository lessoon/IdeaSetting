#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ${Desc}
 *
 * @author Li Du
 * @date ${YEAR}-${MONTH}-${DAY} ${HOUR}-${MINUTE}-${SECOND}
 * @since JDK 1.8
 */
public class ${NAME} {
     private final Logger logger = LoggerFactory.getLogger(getClass());
}