package com.manager.credentials.controllers.management;

import com.manager.credentials.beans.CredentialDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

@Controller
public class CreationController {

    @RequestMapping(value="/",method= RequestMethod.POST)
    public ResponseEntity<String> create(@RequestBody CredentialDTO credentialDTO){
        return null;
    }

}
