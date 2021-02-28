package tech.magratheaai.extensionapi.annotation;

/**
 * Annotation to inject extension values
 * (temporarily String and primitives only).
 *
 * @author  NikitaBolshakov
 * @version 1.0
 */

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
