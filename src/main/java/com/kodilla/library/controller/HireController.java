package com.kodilla.library.controller;

import com.kodilla.library.domain.HireDto;
import com.kodilla.library.mapper.HireMapper;
import com.kodilla.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/hire")
public class HireController {
    @Autowired
    private DbService service;

    @Autowired
    private HireMapper hireMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getHires")
    public List<HireDto> getHire() {
        return hireMapper.mapToHireDtoList(service.getAllHires());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getHire")
    public HireDto getHire(@RequestParam Long hireId) throws HireNotFoundException {
        return hireMapper.mapToHireDto(service.getHireById(hireId).orElseThrow(HireNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteHire")
    public void deleteHire(@RequestParam Long hireId) {
        service.deleteHireById(hireId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateHire")
    public HireDto updateHire(@RequestBody HireDto hireDto) {
        return hireMapper.mapToHireDto(service.saveHire(hireMapper.mapToHire(hireDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createHire", consumes = APPLICATION_JSON_VALUE)
    public void createHire (@RequestBody HireDto hireDto) {
        service.saveHire(hireMapper.mapToHire(hireDto));
    }
}