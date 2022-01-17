package org.kakia.resume.resumeportal.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_profile_id")
    private int userProfileId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String website;
    private int theme;
    private String summary;
    private String profilePicture;
    private String profileBackgroundPicture;
    private String profileURL;
    private String resumePath;
    private String aboutMe;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "user_profile_id")
    List<Job> jobs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "user_profile_id")
    List<Education> educations = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "user_profile_id")
    List<SocialMedia> socialMedia = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "user_profile_id")
    List<Skill> skills = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "user_profile_id")
    List<PersonalProject> personalProjects = new ArrayList<>();

    public List<PersonalProject> getPersonalProjects() {
        return personalProjects;
    }

    public void setPersonalProjects(List<PersonalProject> personalProjects) {
        this.personalProjects = personalProjects;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public int getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(int userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getProfileBackgroundPicture() {
        return profileBackgroundPicture;
    }

    public void setProfileBackgroundPicture(String profileBackgroundPicture) {
        this.profileBackgroundPicture = profileBackgroundPicture;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = resumePath;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userProfileId=" + userProfileId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", theme=" + theme +
                ", summary='" + summary + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", profileBackgroundPicture='" + profileBackgroundPicture + '\'' +
                ", profileURL='" + profileURL + '\'' +
                ", jobs=" + jobs +
                ", educations=" + educations +
                ", socialMedia=" + socialMedia +
                ", skills=" + skills +
                ", personalProjects=" + personalProjects +
                '}';
    }
}
