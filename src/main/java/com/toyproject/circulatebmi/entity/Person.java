package com.toyproject.circulatebmi.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 *
 * author tripleJ
 */
@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public int height;

    @Column(nullable = false)
    public int weight;


}
