package cz.uhk.sportportal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private int id;

    private Date created;

    @Size(min = 3)
    private String text;

    @OneToOne
    private Person person;

    @OneToOne
    private SportMatch sportmatch;

    @OneToOne
    private Team team;
}
