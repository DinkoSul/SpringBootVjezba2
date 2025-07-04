package org.example.springbootvjezba2.repository;
import org.example.springbootvjezba2.domain.Hardware;

import java.util.List;
import java.util.Optional;

public interface HardwareRepository {

    List<Hardware> findAll();

    Optional<Hardware> findByCode(String code);

}