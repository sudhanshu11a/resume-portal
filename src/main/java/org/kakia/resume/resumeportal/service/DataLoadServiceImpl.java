package org.kakia.resume.resumeportal.service;

import org.kakia.resume.resumeportal.models.*;
import org.kakia.resume.resumeportal.user.UserProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import javax.transaction.Transactional;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

@Component
@Transactional
public class DataLoadServiceImpl implements ApplicationListener<ApplicationReadyEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataLoadServiceImpl.class);

    @Autowired
    private UserProfileRepository userProfileRepository;

    public void loadStaticUserData() {
        Skill skill = new Skill();
        skill.setSkillType("Technical");
        skill.setName("Java");

        Education education = new Education();
        education.setUniversity("GGSIPU");
        education.setCollege("DIAS");
        education.setStartDate(LocalDate.of(2009, 06, 01));
        education.setStartDate(LocalDate.of(2012, 05, 01));

        Job job = new Job();
        job.setCompany("Natwest");
        job.setDesignation("Sr. Software Designer");
        job.setResponsibilities(Arrays.asList("Designing the financial applications"));
        job.setCurrentJob(true);
        job.setCompanyURL("https://www.natwest.com/");
        job.setStartDate(LocalDate.of(2019, 11, 01));

        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setType("LinkedIn");
        socialMedia.setUsername("sudhanshu11a");


        PersonalProject personalProject = new PersonalProject();
        personalProject.setName("Vaccine Finder");
        personalProject.setAbout("Application to find the available vaccine in the area");

        UserProfile userProfile = new UserProfile();
        userProfile.setUserName("sudhanshu");
        userProfile.setAddress("New Delhi, India");
        userProfile.setProfileURL("http://google.com");
        userProfile.setProfilePicture("/images/sudhanshu/me.jpg");
        userProfile.setProfileBackgroundPicture("/images/sudhanshu/bg-1.jpg");
        userProfile.setEmail("sudhanshu11a@gmail.com");
        userProfile.setFirstName("Sudhanshu");
        userProfile.setLastName("Sharma");
        userProfile.setPhone("+91-9818763577");
        userProfile.setEducations(Arrays.asList(education));
        LOGGER.info(Base64.getEncoder().encodeToString("sudhanshu".getBytes(StandardCharsets.UTF_8)));
        userProfile.setJobs(Arrays.asList(job));
        userProfile.setPersonalProjects(Arrays.asList(personalProject));
        userProfile.setSkills(Arrays.asList(skill));
        userProfile.setSocialMedia(Arrays.asList(socialMedia));
        userProfile.setWebsite("http://google.com");
        userProfile.setSummary("FULL STACK JAVA DEVELOPER");
        userProfile.setAboutMe("Hello! I am Sudhanshu Sharma, A Full Stack Java Developer with 7 years of Professional Experience in developing robust End to End Web Applications.");
        userProfile.setTheme(1);

        userProfileRepository.save(userProfile);
        LOGGER.info("DATA LOADED : " + userProfile);
    }


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        LOGGER.info("onApplicationEvent called DataLoadServiceImpl");
        try{
            loadStaticUserData();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        LOGGER.info("onApplicationEvent Ends DataLoadServiceImpl");
    }
}
