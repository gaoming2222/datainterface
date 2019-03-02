package com.itclj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by gaoming on 2019/1/3.
 */
@ServletComponentScan
@SpringBootApplication
public class ItcljApplication {

  public static void main(String[] args) {
    SpringApplication.run(ItcljApplication.class,args);
  }

}
