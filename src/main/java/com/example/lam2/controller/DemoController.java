package com.example.lam2.controller;

import com.example.lam2.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.xml.ws.Response;

@RestController
@RequestMapping(value = "/home")
public class DemoController {
    @Autowired
    Client c;

    @RequestMapping(method = RequestMethod.POST, value = "/client")
    public ResponseEntity<Client> doPost(@RequestBody Client client){
        client.setRes("OK");
        ResponseEntity <Client> rE = new ResponseEntity<>(client,null, HttpStatus.OK);
        return rE;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/client")
    public ResponseEntity<Client> doGet(
            @RequestParam() String hoTen,
            @RequestParam int maSV
    ){
        Client client = new Client();
        client.setRes("OK");
        client.setHoTen(hoTen);
        client.setMaSV(maSV+"");
        ResponseEntity <Client> rE = new ResponseEntity<>(client,null, HttpStatus.OK);
        return rE;
    }


}
