package com.restSample.domain.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestError {
    /**
     * A custom error code specific to this error.
     */
    private String code;

    /**
     * An (optional) customMessage indicating whu this error is being returned.
     */
    private String message;

    /**
     * Data that pertains to the exception.
     */
    private Map<String, Object> response;
}
