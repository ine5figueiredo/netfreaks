package org.academiadecodigo.controller;

import org.academiadecodigo.converters.FreakDTOToFreak;
import org.academiadecodigo.converters.FreakToFreakDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.academiadecodigo.service.FreakService;
import java.util.List;

@RestController
@RequestMapping("/home")
public class RestFreakController {

    private FreakService freakService;
    private FreakDTOToFreak freakDTOToFreak;
    private FreakToFreakDTO freakToFreakDTO;

    @Autowired
    public void setFreakService(FreakService freakService) {
        this.freakService = freakService;
    }

    @Autowired
    public void setFreakDTOToFreak(FreakDTOToFreak freakDTOToFreak) {
        this.freakDTOToFreak = freakDTOToFreak;
    }

    @Autowired
    public void setFreakToFreakDTO(FreakToFreakDTO freakToFreakDTO) {
        this.freakToFreakDTO = freakToFreakDTO;
    }
}
