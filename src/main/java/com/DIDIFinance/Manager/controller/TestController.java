//TODO: Esta solo es una clase que nos ayudara a probar que la conexion esta bien hecha...
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
