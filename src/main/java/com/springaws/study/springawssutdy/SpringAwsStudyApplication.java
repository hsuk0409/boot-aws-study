package com.springaws.study.springawssutdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringAwsStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAwsStudyApplication.class, args);
    }

}
