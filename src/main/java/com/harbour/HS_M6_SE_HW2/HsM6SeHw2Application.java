package com.harbour.HS_M6_SE_HW2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HsM6SeHw2Application {

  private static final String FULL_NAME = "Nikalayenka Konstantin";
  private static final String FIRST_NAME = "Konstantin";

  @RequestMapping(value = "/")
  public String home() {
    return "Hello Stranger!";
  }

  @RequestMapping(value = "/v1/student/name")
  @ResponseBody
  public String studentName(@RequestParam(value = "formal", defaultValue = "true") Boolean formal) {
    String name;
    if (formal) {
      name = FULL_NAME;
    } else {
      name = FIRST_NAME;
    }
    return name;
  }

  public static void main(String[] args) {
    SpringApplication.run(HsM6SeHw2Application.class, args);
  }

}
