package com.fspa.login.resource;

import com.fspa.login.modal.Manufacturer;
import com.fspa.login.service.ManufacturerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ManufacturerResource {

    private final Logger log = LoggerFactory.getLogger(ManufacturerResource.class);

    @Autowired
    private ManufacturerService manufacturerService;

    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Manufacturer>> getUsers()
    {
        log.debug("CLIENT REST REQUEST!");

        List<Manufacturer> userList = manufacturerService.findAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
