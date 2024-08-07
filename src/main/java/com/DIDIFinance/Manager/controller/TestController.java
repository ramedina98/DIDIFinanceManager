//NOTA: Esta clase sera borrada en un futuro... servira como de ejemplo...

package com.DIDIFinance.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.DataSource;
import java.sql.Connection;


@RestController
public class TestController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/testConnection")
    public String testConnection(){
        try(Connection connection = dataSource.getConnection()){
            return "Connection successfully";
        } catch(Exception e){
            return "Connection failed: " + e.getMessage();
        }
    }

}
