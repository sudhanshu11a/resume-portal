package org.kakia.resume.resumeportal.models;

import javax.persistence.*;

@Entity
@Table
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String skillType;

    private String name;

    private String logoPath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skillType='" + skillType + '\'' +
                ", name='" + name + '\'' +
                ", logoPath='" + logoPath + '\'' +
                '}';
    }
}
