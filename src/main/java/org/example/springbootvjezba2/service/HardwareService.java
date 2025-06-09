package org.example.springbootvjezba2.service;

import org.example.springbootvjezba2.dto.HardwareDTO;

import java.util.List;

public interface HardwareService {

    List<HardwareDTO> findAll();

    HardwareDTO findByCode(String code);

}
