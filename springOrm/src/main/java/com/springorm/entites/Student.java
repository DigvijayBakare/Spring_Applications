package com.springorm.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Student {
    @Id
    @Column(name = "student_id")
    private int id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_city")
    private String city;

    @Override
    public String toString() {
        return id + " : " + name + " : " + city;
    }
}
