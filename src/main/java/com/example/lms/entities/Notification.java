package com.example.lms.entities;


import java.time.LocalDate;

public class Notification {
    private LocalDate notificationDate;
    private LocalDate validUntilDate;
    private String notificationMessage;


    public Notification(LocalDate notificationDate, LocalDate validUntilDate, String notificationMessage) {
        this.notificationDate = notificationDate;
        this.validUntilDate = validUntilDate;
        this.notificationMessage = notificationMessage;
    }

    public LocalDate getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(LocalDate notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public void setValidUntilDate(LocalDate validUntilDate) {
        this.validUntilDate = validUntilDate;
    }

    public LocalDate getValidUntilDate() {
        return validUntilDate;
    }
}
