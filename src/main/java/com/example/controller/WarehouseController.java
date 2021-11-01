package com.example.controller;

import com.example.entity.Location;
import com.example.entity.Warehouse;
import com.example.service.LocationService;
import com.example.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping("")
    public Iterable<Warehouse> getAllWarehouse() {
        return warehouseService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Warehouse> searchWarehouse(@PathVariable int id) {
        return warehouseService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.insert(warehouse);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Warehouse warehouse) {
        warehouseService.updateWarehouse(warehouse);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCategory(@RequestBody Warehouse warehouse) {
        warehouseService.deleteWarehouse(warehouse);
    }


}
