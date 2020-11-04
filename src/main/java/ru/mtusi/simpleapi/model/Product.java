package ru.mtusi.simpleapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends AbstractBaseEntity{
    @NotBlank
    private String name;

    private String brand;

    private Integer price;

    private Integer quantity;
}
