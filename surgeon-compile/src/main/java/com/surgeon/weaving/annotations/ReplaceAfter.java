package com.surgeon.weaving.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Called after when target function called.
 */
@Retention(CLASS)
@Target({METHOD})
public @interface ReplaceAfter {
    /**
     * The namespace of target function.
     */
    String namespace();

    /**
     * Function name
     */
    String function();
}
