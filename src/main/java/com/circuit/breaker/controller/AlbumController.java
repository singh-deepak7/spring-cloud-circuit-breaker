package com.circuit.breaker.controller;

import com.circuit.breaker.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService service;

    @GetMapping("/albums")
    public String albums() {
        return service.getAlbumList();
    }
}
