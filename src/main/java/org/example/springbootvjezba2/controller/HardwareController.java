package org.example.springbootvjezba2.controller;
import org.example.springbootvjezba2.dto.HardwareDTO;
import org.example.springbootvjezba2.service.HardwareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hardware")
public class HardwareController {

    private final HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @GetMapping
    public List<HardwareDTO> getAll() {
        return hardwareService.findAll();
    }

    @GetMapping(params = "code")
    public HardwareDTO getByCode(@RequestParam final String code) {
        return hardwareService.findByCode(code);
    }
//    link?code=223232

}
