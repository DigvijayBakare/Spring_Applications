package com.springmvcsearch.entity;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "student_info")
public class Student {
    private String name;
    @Id
    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;

    @ElementCollection
    @CollectionTable(name = "student_courses", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "course_name")
    private List<String> courses;
    private String gender;
    private String type;

    @Embedded
    private Address address;
}
