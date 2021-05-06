package fakenewsdetection.fakedatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "lol")
public class DummyController {

    @GetMapping(path = "/getDummy")
    public void getSomething(){

    }
}
