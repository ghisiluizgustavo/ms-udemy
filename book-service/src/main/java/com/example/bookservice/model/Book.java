package com.example.bookservice.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    @Temporal(TemporalType.DATE)
    private Date launchDate;
    private Double price;
    private String title;

    @Transient
    private String currency;

    @Transient
    private String environment;
}
