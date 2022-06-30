package com.shikha.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "demo_user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemoTable implements Serializable {
    @Id
    @Column(name ="user_id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (columnDefinition = "varchar(20) default 'ABC'")
    @Builder.Default
    private String name = "ABC";

    @Column (unique = true)
    private int age;

    @Column
    private double salary;

}
