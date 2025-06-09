package org.example.springbootvjezba2.repository;
import org.example.springbootvjezba2.domain.Hardware;
import org.example.springbootvjezba2.domain.Type;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class MockHardwareRepository implements HardwareRepository{

    private final List<Hardware> MOCKED_HARDWARE = List.of(
            new Hardware("Asus TUF RTX 3080", Type.GPU, "1234561", 0, BigDecimal.valueOf(1599.00)),
            new Hardware("EVGA XC3 RTX 3070 Ti", Type.GPU, "1234562", 0, BigDecimal.valueOf(1299.00)),
            new Hardware("AMD Ryzen 5950X", Type.CPU, "1234563", 0, BigDecimal.valueOf(899.00)),
            new Hardware("Samsung 980 PRO SSD 1TB", Type.STORAGE, "1234564", 0, BigDecimal.valueOf(299.00)),
            new Hardware("Kingston FURY Beast DDR5 32GB", Type.RAM, "1234565", 0, BigDecimal.valueOf(699.00))
    );


    @Override
    public List<Hardware> findAll() {
        return MOCKED_HARDWARE;
    }

    @Override
    public Optional<Hardware> findByCode(String code) {
        return MOCKED_HARDWARE.stream().filter(hardware -> Objects.equals(hardware.getCode(), code)).findAny();
    }
}
