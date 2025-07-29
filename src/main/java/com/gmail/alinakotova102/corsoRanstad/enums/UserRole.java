package com.gmail.alinakotova102.corsoRanstad.enums;

public enum UserRole {
    ADMIN("Admins have the highest level of access and can manage users, settings, and content. " +
            "They can modify the system's structure and functionality"),
    USER("Users have access to specific features and functionalities based on their assigned roles. " +
            "They can typically perform actions related to their work or projects"),
    GUEST("Guests usually have very limited access, often restricted to specific projects or areas. " +
            "They might be able to view content, collaborate on specific tasks, or make limited changes");

    private String message;

    UserRole(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
