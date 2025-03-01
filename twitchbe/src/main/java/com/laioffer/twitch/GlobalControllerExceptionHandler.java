package com.laioffer.twitch;

import com.laioffer.twitch.favorite.DuplicateFavoriteException;
import com.laioffer.twitch.model.TwitchErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author lintingxuan
 * @create 2024-12-01 2:22 PM
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(DuplicateFavoriteException.class)
    public final ResponseEntity<TwitchErrorResponse> handleDefaultException(Exception e) {
        return new ResponseEntity<>(
                new TwitchErrorResponse("Duplicate entry error.",
                        e.getClass().getName(),
                        e.getMessage()
                ),
                HttpStatus.BAD_REQUEST
        );
    }
}

