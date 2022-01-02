package br.com.seteideias.springopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@SpringBootApplication
@RestController
public class SpringOpenShiftApplication {

    @RequestMapping("/")
    public String welcome(){
        return "bem vindo";
    }

    @RequestMapping("/teste")
    public String welcome2(){
        return "bem vindo... a pagina 2";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringOpenShiftApplication.class, args);
    }

}
