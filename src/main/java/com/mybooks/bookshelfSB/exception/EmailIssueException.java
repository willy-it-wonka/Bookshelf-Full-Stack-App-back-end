package com.mybooks.bookshelfSB.exception;

public class EmailIssueException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmailIssueException(String message) {
        super(String.format("This email %s.", message));
    }
}
