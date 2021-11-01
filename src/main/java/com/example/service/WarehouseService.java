package com.example.service;

import com.example.entity.Warehouse;
import com.example.repository.WarehouseRepository;
import com.example.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    public void insert(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }


    public Optional<Warehouse> findById(int id) {
        return warehouseRepository.findById(id);
    }

    public Iterable<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }

    public void updateWarehouse(Warehouse warehouse) {

        warehouseRepository.save(warehouse);
    }

    public void deleteWarehouse(Warehouse warehouse) {

        warehouseRepository.delete(warehouse);
    }
}
