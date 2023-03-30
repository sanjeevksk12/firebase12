package com.gw.hrconnectapp;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication(scanBasePackages = {
		"com.gw.hrconnect.domain.repository, com.gw.hrconnect.domain.entity,com.gw.hrconnect,com.gw.hrconnect.service" })

@ComponentScan(basePackages = "com.gw.hrconnect,com.gw.hrconnect.service,com.gw.hrconnectapp")
@Configuration("com.gw.hrconnect.domain.repository")
@EnableJpaRepositories("com.gw.hrconnect.domain.repository")
@EntityScan("com.gw.hrconnect.domain.entity")
public class HrConnectAppApplication {

    public static void main(String[] args) throws IOException {
        FileInputStream serviceAccount = new FileInputStream("src/main/resources/serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
        try {
        	 FirebaseApp.initializeApp(options);
        	
        }catch(Exception e){
        	e.printStackTrace()   ; 	
        }
       

        SpringApplication.run(HrConnectAppApplication.class, args);
	}
    



}
