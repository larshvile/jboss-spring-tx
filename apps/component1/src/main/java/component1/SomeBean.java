package component1;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.*;
import org.springframework.stereotype.Component;


@Component
public final class SomeBean {

    private final Log logger = LogFactory.getLog(getClass());


    @PostConstruct
    public void init() {
        logger.warn("I'm alive");
    }


    public String utf8String() {
        return "æøåÆØÅ";
    }
}

