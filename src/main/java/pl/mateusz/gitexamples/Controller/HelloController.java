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


        modelAndView.addObject("User",name);
        modelAndView.setViewName("home");

        return modelAndView;
    }
}
