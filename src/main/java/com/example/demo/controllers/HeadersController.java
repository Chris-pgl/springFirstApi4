package com.example.demo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;


    @RestController
    //@RequestMapping
    public class HeadersController {

        @GetMapping("/headers")
        public String getHostInfo(HttpServletRequest request){
            return ("The host is: " + request.getHeader("Host").split(":")[0]
                    + " and the port is: " + request.getHeader("Host").split(":")[1]);
        }



        @GetMapping("/headers2")
        public String getHostInfo2(@RequestHeader HttpHeaders headers){
            //prendo oggetto Host
            InetSocketAddress host = headers.getHost();
            return ("The host is: " + host.getHostName()
                    + " and the port is: " + host.getPort());
        }

    }
