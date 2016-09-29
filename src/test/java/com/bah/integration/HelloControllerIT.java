package com.bah.integration;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.bah.web.controller.HelloControllerTest;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

    @LocalServerPort
    private int port;

    private URL base;
    
    private static final Logger logger = LoggerFactory.getLogger(HelloControllerIT.class);


    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() {
        try {
			this.base = new URL("http://localhost:" + port + "/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			logger.error("error happened in the HelloControllerIT class", e);
		}
    }

    @Test
    public void getHello() {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Welcome to devops pipeline demo using cloud!"));
    }
}
