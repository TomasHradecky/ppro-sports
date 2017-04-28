package cz.uhk.sportportal.model;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 3, max = 20, message = "Název musí obsahovat 3-20 znaků!")
    private int birthyear;

    private String email;

    private String firstname;

    private String lastname;

    private String phonenumber;

    private int points;

    private String username;

    private String password;

    @OneToOne
    private Team team;

    @OneToOne
    private UserRole userRole;

    @ManyToMany
    @JoinTable(name = "personteamrole", joinColumns = @JoinColumn(name = "personid"), inverseJoinColumns = @JoinColumn(name = "roleid"))
    private Set<TeamRole> teamRoles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUseRRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Set<TeamRole> getTeamRoles() {
        return teamRoles;
    }

    public void setTeamRoles(Set<TeamRole> teamRoles) {
        this.teamRoles = teamRoles;
    }
}
