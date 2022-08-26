package com.fspa.login.service;

import com.fspa.login.modal.Manufacturer;
import com.fspa.login.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    /**
     * Method for getting all users
     *
     * @return List of user objects.
     */
    public List<Manufacturer> findAllUsers() {
        return this.manufacturerRepository.findAll();
    }
}
