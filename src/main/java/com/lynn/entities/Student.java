package com.lynn.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Table(name = "students")
@Entity
public class Student {
    public Student() {

    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public String name;
    public String admissionNo;
    public String streamName;
}
