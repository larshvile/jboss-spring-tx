package webapp1;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.*;
import org.springframework.stereotype.Component;


@Component
public final class OtherBean {

    private final Log logger = LogFactory.getLog(getClass());


    @PostConstruct
    public void init() {
        logger.warn("I'm alive as well æøåÆØÅ");
    }
}

