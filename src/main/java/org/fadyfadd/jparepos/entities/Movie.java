package org.fadyfadd.jparepos.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Table(name = "movie")
@Setter
@Getter
public class Movie {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="film_id")
    Integer filmId;
    @Column(name="description")
    String description;
    @Column(name="title")
    String title;
    @Column(name="release_year")
    Date releaseYear;
    @Column(name="language_id")
    Integer languageId;
    @Column(name="original_language_id")
    Integer originalLanguageId;
    @Column(name="rental_rate")
    Integer rentalRate;
    @Column(name="length")
    Integer length;
    @Column(name="replacement_cost")
    Double replacementCost;
    @Column(name="rating")
    String rating;
    @Column(name="special_features")
    String specialFeatures;
    @Column(name="last_update")
    Date lastUpdate;



}
