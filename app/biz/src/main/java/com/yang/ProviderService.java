package com.yang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    @Value("${server.port}")
    String port ;

    public String getPort(){
        return port;
    }

}
