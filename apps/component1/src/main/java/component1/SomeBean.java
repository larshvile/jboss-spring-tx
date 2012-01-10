package component1;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.*;
import org.springframework.stereotype.Component;


@Component
public final class SomeBean {

    private final Log logger = LogFactory.getLog(getClass());


    public SomeBean() {
        logger.warn("\nSomeBean-ctor\n");
    }


    @PostConstruct
    public void init() {
        logger.warn("\nI'm alive\n");
    }


    public String utf8String() {
        return "æøåÆØÅ";
    }
}

