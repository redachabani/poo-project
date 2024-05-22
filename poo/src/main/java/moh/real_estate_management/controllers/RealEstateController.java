package moh.real_estate_management.controllers;

import lombok.AllArgsConstructor;
import moh.real_estate_management.service.RealEstateService;
import moh.real_estate_management.models.RealEstate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/real-estate")
@AllArgsConstructor
public class RealEstateController {
    private final RealEstateService realEstateService;

    @GetMapping("/all")
    public List<RealEstate> getRealEstates() {
        return realEstateService.getRealEstates();
    }

    @GetMapping(value = "/get-real-estate/{id}")
    public RealEstate getRealEstate(@PathVariable String id){
        return realEstateService.getRealEstate(id);
    }

    @PostMapping(value = "/add")
    public String addRealEstate(@RequestBody RealEstate realEstate){
        realEstateService.addRealEstate(realEstate);
        return "Real Estate created successfully";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteRealEstate(@PathVariable String id){
        realEstateService.deleteRealEstate(id);
        return "Real Estate deleted successfully";
    }

}
