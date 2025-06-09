package org.example.springbootvjezba2.dto;

import org.example.springbootvjezba2.domain.Hardware;

import java.math.BigDecimal;

public class HardwareDTO {
    private final String name;
    private final BigDecimal price;

    public HardwareDTO(Hardware hardware) {
        this.name = hardware.getName();
        this.price = hardware.getPrice();
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HardwareDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
