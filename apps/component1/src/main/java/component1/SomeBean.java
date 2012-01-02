package component1;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component
public final class SomeBean {

    @PostConstruct
    public void init() {
        System.out.println("I'm alive");
    }


    public String utf8String() {
        return "æøåÆØÅ";
    }
}

