package pl.mateusz.gitexamples.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
private static final Logger Logger=LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    ModelAndView myFirstView(ModelAndView modelAndView,@RequestParam(defaultValue = "franek")String name){
        Logger.info("name: {}",name);


        modelAndView.addObject("user",name);

        modelAndView.setViewName("home");

        return modelAndView;
    }
    @GetMapping("/data")
    ModelAndView myFirstView(ModelAndView modelAndView,@RequestParam(defaultValue = "Karol")String name,@RequestParam(defaultValue ="Kowalski")String surname,@RequestParam(defaultValue = "35")int age){
        Logger.info("name: {}",name);
        Logger.info("surname: {}",surname);
        Logger.info("age: {}",age);
        modelAndView.addObject("name",name);
        modelAndView.addObject("surname",surname);
        modelAndView.addObject("age",age);
        modelAndView.setViewName("data");

        return modelAndView;
    }
}
