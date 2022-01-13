package org.suptech.productmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    @Id
    private String ref ;
    private String label ;
    private String description ;
    private double price ;
    private int quantity;
    private Date creation_date;
}
