package edu.fra.uas.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private String message;
    private Integer counter = 0;  // Zähler-Variable hinzugefügt

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Neue Methode increment, die den counter erhöht
    public void increment() {
        this.counter++; // Erhöht den Zähler um 1
    }

    // Getter für den counter
    public Integer getCounter() {
        return counter;
    }
}