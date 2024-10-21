package com.CRUD.rest_demo.controller;


import com.CRUD.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
        /* new CloudVendor("c1", "vendor1",
        "Address one","XXXXX"); */
    }
@PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
    {
    this.cloudVendor = cloudVendor;
    return "Cloud vendor Created";
    }
@PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud vendor deleted sucessfully";
    }
}
