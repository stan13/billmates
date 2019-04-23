package com.au.billmates.domain;

public enum TimeUnit {
    DAY(1L),
    WEEK(2L),
    MONTH(3L),
    YEARLY(4L);

    private Long id;

    TimeUnit(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
