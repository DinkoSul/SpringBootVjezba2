package org.example.springbootvjezba2.service;

import org.example.springbootvjezba2.dto.HardwareDTO;
import org.example.springbootvjezba2.repository.HardwareRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardwareServiceImpl implements HardwareService{

    private final HardwareRepository hardwareRepository;

    public HardwareServiceImpl(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    @Override
    public List<HardwareDTO> findAll() {
        return hardwareRepository.findAll().stream().map(HardwareDTO::new).collect(Collectors.toList());
    }

    @Override
    public HardwareDTO findByCode(String code) {
        return hardwareRepository.findByCode(code).map(HardwareDTO::new).orElse(null);
    }
}
