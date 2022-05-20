package com.triangle.validateforminput;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:8084")
public class SideTypeController {

    //Handling query parameters
    @GetMapping("/")
    public String sideQueryParam(
            @RequestParam(name = "sideA")  Float sideA,
            @RequestParam(name = "sideB")  Float sideB,
            @RequestParam(name = "sideC")  Float sideC) {
            Float[] sidels = {sideA, sideB, sideC};
        String triangleType = CalcTri.tritype(sidels);
        return triangleType;
    }


}
