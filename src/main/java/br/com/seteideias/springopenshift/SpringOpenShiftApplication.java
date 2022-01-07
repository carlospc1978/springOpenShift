package br.com.seteideias.springopenshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenShiftApplication {

    @Value("$modo")
    String teste;

    @RequestMapping("/")
    public String welcome(){
        return "bem vindo";
    }

    @RequestMapping("/teste")
    public String welcome2(){
        return "bem vindo... a pagina  2 "+ teste;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringOpenShiftApplication.class, args);
    }

}
