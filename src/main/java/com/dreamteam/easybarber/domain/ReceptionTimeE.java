package com.dreamteam.easybarber.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class ReceptionTimeE {

    @EmbeddedId
    UsrReceptionTime usrReceptionTime;

    private String clientName; //имя клиента
    private String clientPhonenumber; // id клиента
    private String clientEmail; // id клиента
    private Long serviceId; // id услуги
    private Statuses status;

}
