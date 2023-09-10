package org.wtest;

import Mail.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

    @Autowired
    GetMap gmap;
    @GetMapping("getmap")
    public GetMap getM(){
        return gmap;
    }

//    @Autowired
//    SendMail sm;

}
