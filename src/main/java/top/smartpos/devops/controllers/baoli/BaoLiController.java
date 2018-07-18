package top.smartpos.devops.controllers.baoli;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.annotations.ApiRestAction;
import top.smartpos.devops.beans.Models.baoli.AccounReduceModel;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.domains.baoli.result.ResultAccountReduceDomain;
import top.smartpos.devops.beans.domains.baoli.result.ResultGetVipInfoDomain;
import top.smartpos.devops.services.BaoLiService;

@RestController
@RequestMapping(value = "/baoli")
@Api()
public class BaoLiController {
    @PostMapping(value = "/getVipInfo")
    @ApiRestAction(modelClass = GetVipInfoModel.class, serviceClass = BaoLiService.class, methodName = "getVipInfo")
    public ResultGetVipInfoDomain getVipInfo() {
        return null;
    }
    @PostMapping(value = "/accountReduce")
    @ApiRestAction(modelClass = AccounReduceModel.class, serviceClass = BaoLiService.class, methodName = "accountReduce")
    public ResultAccountReduceDomain accountReduce() {
        return null;
    }
}
