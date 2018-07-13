package top.smartpos.devops.controllers.baoli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.models.baoli.GetVipInfoModel;
import top.smartpos.devops.services.DEnvService;
import top.smartpos.devops.utils.SpringUtils;

@RestController
@RequestMapping(value = "/BaoLi")
public class BaoLiController {
    @Autowired
    private DEnvService dEnvService;
    private static final Logger LOGGER = LoggerFactory.getLogger(BaoLiController.class);

    @RequestMapping(value = "/getVipInfo", method = RequestMethod.GET)
    @ResponseBody
    public String list() throws Exception {
        try {
            Object obj = SpringUtils.validateAndThrow(GetVipInfoModel.class);
            return "123";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
