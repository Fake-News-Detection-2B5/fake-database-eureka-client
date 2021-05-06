package fakenewsdetection.fakedatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "lol")
public class DummyController {

    @GetMapping(path = "/getDummy")
    public List<Integer> getSomething(){
        return List.of(1);
    }

    @GetMapping(path = "/getLol")
    public List<Integer> getLol() {
        return List.of(2);
    }
}
