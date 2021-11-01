package com.example.controller;

import com.example.entity.Location;
import com.example.entity.Supplier;
import com.example.entity.TheLogConverter;
import com.example.service.LocationService;
import com.example.service.SupplierLogService;
import com.example.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping("")
    public Iterable<Location> getAllSupplier() {
        return locationService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Location> searchSupplier(@PathVariable int id) {
        return locationService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addLocation(@RequestBody Location location) {
        locationService.insert(location);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateLocation(@RequestBody Location location) {
        locationService.updateLocation(location);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteLocation(@RequestBody Location location) {
        locationService.deleteLocation(location);
    }
}
