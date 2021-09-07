/**
 * 
 */
package com.org;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * @author Aqeel
 * @version 1.0
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException {
    public ResouceNotFoundException(String message) {
        super(message);
    }
}
