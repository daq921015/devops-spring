package top.smartpos.devops.controllers.baoli;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.annotations.ApiRestAction;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.protocol.Result;
import top.smartpos.devops.services.DEnvService;

@RestController
@RequestMapping(value = "/baoli")
@Api(tags = "保利接口")
public class BaoLiController {
    @PostMapping(value = "/getVipInfo")
    @ApiOperation(value = "获取会员信息", notes = "根据会员手机号、卡号、动态会员号等查询会员信息,三者必须传其一")
    @ApiRestAction(modelClass = GetVipInfoModel.class, serviceClass = DEnvService.class, methodName = "findAll")
    public Result getVipInfo(GetVipInfoModel getVipInfoModel) {
        return null;
    }
}
