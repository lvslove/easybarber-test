package com.dreamteam.easybarber.domain;

import lombok.Data;

import javax.persistence.*;

// класс услуги
@Entity
@Data
public class BarberService
{
    @EmbeddedId
    MstrServiceEmbed mstrServiceEmbed;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    User master;

    @ManyToOne
    @MapsId("service_id")
    @JoinColumn(name = "service_id")
    BaseServices services;

    private String description;
    private String imageFileName;
    private Long cost;
    private Long count;
}
