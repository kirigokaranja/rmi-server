package com.example.rmiserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

import javax.management.remote.rmi.RMIServerImpl;

@Configuration
public class Config {

    @Bean
    RemoteExporter registerRMI(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("CalculateRMI");
        exporter.setServiceInterface(Calculate.class);
        exporter.setService(new CalculateImpl());
        return exporter;
    }
}
