package com.abhi.ecommercedemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderProduct {
    
    @EmbeddedId
    @JsonIgnore
    private OrderProductPK orderProductPK;

    @Column(nullable = false)
    int quantity;
}
