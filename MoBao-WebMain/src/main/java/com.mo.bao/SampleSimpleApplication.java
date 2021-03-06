package com.mo.bao;

import com.mo.bao.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hadoop on 2016/9/25.
 */

public class SampleSimpleApplication implements CommandLineRunner {

    private HelloWorldService helloWorldService;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
        if (args.length > 0 && args[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleSimpleApplication.class, args);
    }

}
