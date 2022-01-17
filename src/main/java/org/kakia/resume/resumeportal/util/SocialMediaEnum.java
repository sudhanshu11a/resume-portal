package org.kakia.resume.resumeportal.util;

public enum SocialMediaEnum {

    FACEBOOK("Facebook", "https://www.facebook.com/", "fa-facebook"),
    LINKEDIN("LinkedIn", "https://www.linkedin.com/in/", "fa-linkedin"),
    INSTAGRAM("Instagram","https://www.instagram.com/", "fa-instagram");

    private String title;
    private String url;
    private String cssName;

    private SocialMediaEnum(String title, String url, String cssName) {
        this.title = title;
        this.url = url;
        this.cssName = cssName;
    }
}
