package top.smartpos.devops.controllers.haiding;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "海鼎接口")
public class HaiDingController {
    @PostMapping(value = "/saleSave")
    @ApiOperation(value = "上传销售数据(该接口不进行积分计算)", notes = "上传流水数据，包括订单详情、订单流水以及订单支付")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "body", value = "body内容", dataType = "SaleSaveModel", required = true, paramType = "body")
    })
    @ApiRestAction(modelClass = SaleSaveModel.class, serviceClass = HaiDingService.class, methodName = "saleSave")
    public ResultHaiDingDomain saleSave() {
        return null;
    }

    @PostMapping(value = "/getPosInfo")
    @ApiOperation(value = "获取收银机相关信息", notes = "资料校验接口，根据收银机号获取相关数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "posId", value = "收银机号", dataType = "String", required = true, paramType = "query")
    })
    @ApiRestAction(modelClass = GetPosInfoModel.class, serviceClass = HaiDingService.class, methodName = "getPosInfo")
    public ResultHaiDingDomain getPosInfo() {
        return null;
    }
}
