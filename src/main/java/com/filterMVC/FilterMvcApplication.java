package com.filterMVC;

import com.filterMVC.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.filterMVC")
public class FilterMvcApplication implements CommandLineRunner {
    @Autowired
    AsyncService asyncService;


    public static void main(String[] args) {
        SpringApplication.run(FilterMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        asyncService.doAcync();
        asyncService.doAcync();
        asyncService.doAcync();
    }
}
