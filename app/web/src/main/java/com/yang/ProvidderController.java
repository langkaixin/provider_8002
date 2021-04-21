package com.yang;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProvidderController {

//    @Value("${server.port}")
//    private String port;

    @Autowired
    private ProviderService providerService;

    @GetMapping("getPort")
    public String getPort(){
        return providerService.getPort();
    }


}
