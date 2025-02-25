package com.example.Spring_Ollama.Validations;

import org.springframework.stereotype.Component;

@Component
public class Validation {
    public Boolean isNull(String value) {
        return value == null || value.trim().isEmpty();
    }
}
