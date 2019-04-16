package com.iscloud.demo.Controller;

import com.iscloud.demo.Exceptions.propertiesException;
import com.iscloud.demo.Services.propertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/configuration")
public class ConfigurationController {

    @Autowired
    propertiesService propertiesService;


    @GetMapping("/properties")
    public ResponseEntity<?> getAllPropierties(){
        try{
            return new ResponseEntity<>(propertiesService.getAllPropierties(), HttpStatus.ACCEPTED);
        } catch (propertiesException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(String DBSID,String DBIP,String DBPort,String DBUserName,String DBPassword, String PartitionCount,String MinConn,String MaxConn,String PDFPath, String[] adminEmail){
        try {
            propertiesService.updatePropierties(DBSID,DBIP,DBPort,DBUserName,DBPassword,PartitionCount,MinConn,MaxConn,PDFPath,adminEmail);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (propertiesException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
