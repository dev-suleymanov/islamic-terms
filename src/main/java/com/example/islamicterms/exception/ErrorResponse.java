package com.example.islamicterms.exception;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {
    @NonNull
    private String message;
    @NonNull
    private int status;
    private LocalDateTime timestamp = LocalDateTime.now();
}
