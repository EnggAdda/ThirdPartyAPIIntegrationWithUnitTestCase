package org.example.thirdpartyapiintegrationwithunittestcase;

// src/main/java/com/example/demo/controller/ApiController.java



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/call-api")
    public String callApi() {
        return apiService.callThirdPartyApi();
    }
}

