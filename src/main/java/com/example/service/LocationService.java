package com.example.service;

import com.example.entity.Location;
import com.example.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class LocationService {


    @Autowired
    private LocationRepository locationRepository;

    public void insert(Location supplier) {
        locationRepository.save(supplier);
    }


    public Optional<Location> findById(int id) {
        return locationRepository.findById(id);
    }

    public Iterable<Location> findAll() {
        return locationRepository.findAll();
    }

    public void updateLocation(Location location) {

        locationRepository.save(location);
    }

    public void deleteLocation(Location location) {

        locationRepository.delete(location);
    }
}
