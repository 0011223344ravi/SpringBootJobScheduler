package com.example.jobscheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name ="User_Table")
public class User {


    @Id
    @GeneratedValue
    private String id;
    private String name ;
}
