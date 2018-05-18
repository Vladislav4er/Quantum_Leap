package ru.javavlad.start;

/**
 * Создание исключительной ситуации для обеспечения
 * корректности пользовательского ввода.
 */

public class MenuOutException extends RuntimeException {
    public MenuOutException(String message) {
        super(message);
    }
}
