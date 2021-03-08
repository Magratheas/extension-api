package tech.magratheaai.extensionapi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to inject extension values
 * (All serializable classes).
 *
 * @author  NikitaBolshakov
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
    /**
     * Name of parameter.
     * @return Name of injected parameter
     */
    String name();

    /**
     * Has check parameter state.
     * @return Is parameter optional?
     */
    boolean optional() default true;
}
