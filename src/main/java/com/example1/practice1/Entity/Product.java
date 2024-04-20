package com.example1.practice1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {
    
    @Id
    @Column(length = 8)
    private Integer prodid;
    @Column(length = 20)
    private String name;
    @Column(length = 10)
    private Float price;
}
