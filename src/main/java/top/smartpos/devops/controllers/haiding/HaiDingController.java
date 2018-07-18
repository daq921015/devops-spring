package top.smartpos.devops.controllers.haiding;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.annotations.ApiRestAction;
import top.smartpos.devops.beans.Models.haiding.GetPosInfoModel;
import top.smartpos.devops.beans.Models.haiding.SaleSaveModel;
import top.smartpos.devops.beans.domains.haiding.ResultHaiDingDomain;
import top.smartpos.devops.services.HaiDingService;

@RestController
@RequestMapping(value = "/haiding")
public class HaiDingController {
    @PostMapping(value = "/saleSave")
    @ApiRestAction(modelClass = SaleSaveModel.class, serviceClass = HaiDingService.class, methodName = "saleSave")
    public ResultHaiDingDomain saleSave() {
        return null;
    }
    @PostMapping(value = "/getPosInfo")
    @ApiRestAction(modelClass = GetPosInfoModel.class, serviceClass = HaiDingService.class, methodName = "getPosInfo")
    public ResultHaiDingDomain getPosInfo() {
        return null;
    }
}
