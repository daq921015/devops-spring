package top.smartpos.devops.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.domains.DEnv;
import top.smartpos.devops.services.DEnvService;

import java.util.List;

@RestController
@RequestMapping(value = "/DSearch")
public class DSearch {
    @Autowired
    private DEnvService dEnvService;
    private static final Logger LOGGER = LoggerFactory.getLogger(DSearch.class);

    @RequestMapping(value = "/history")
    public List<DEnv> list() {
        LOGGER.info("测试controller info");
        LOGGER.error("测试controller error");
        LOGGER.warn("测试controller warn");
        LOGGER.trace("trace log");
        LOGGER.debug("debug log");
        return dEnvService.findAll();
    }
}
