package com.productcrud.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter@Setter@ToString
@NoArgsConstructor@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Column(length = 3000)
    private String description;
    private long price;
}
