package com.springmvcsearch.entity;


import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class Address {
    private String street;
    private String city;
}
