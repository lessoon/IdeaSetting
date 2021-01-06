#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

/**
 * ${Desc}
 *
 * @author Li Du
 * @date ${YEAR}-${MONTH}-${DAY} ${HOUR}-${MINUTE}-${SECOND}
 * @since JDK 1.8
 */
public record ${NAME}(#[[$END$]]#) {
}
