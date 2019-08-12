package com.web.domain.enums;

public enum BoardType {
    notice("notice"),
    free("free board");

    private String value;

    BoardType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
