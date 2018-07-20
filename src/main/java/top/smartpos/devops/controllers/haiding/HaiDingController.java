package top.smartpos.devops.controllers.haiding;

import io.swagger.annotations.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.beans.Models.haiding.SaleSaveModel;
import top.smartpos.devops.beans.domains.haiding.ResultHaiDingDomain;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/haiding")
@Api(tags = "海鼎接口")
public class HaiDingController {
    @PostMapping(value = "/saleSave", produces = {"application/json"}, consumes = {"application/json"})
    @ApiOperation(tags = "海鼎接口", value = "上传销售数据(该接口不进行积分计算)", notes = "上传流水数据，包括订单详情、订单流水以及订单支付")
//    @ApiRestAction(modelClass = SaleSaveModel.class, serviceClass = HaiDingService.class, methodName = "saleSave")
    @ApiResponses({@ApiResponse(code = 200, message = "successful operation", response = ResultHaiDingDomain.class)})
    public ResultHaiDingDomain saleSave(@ApiParam(name = "body", value = "post请求体", required = true) @Valid @RequestBody SaleSaveModel body) {
        System.out.println("123456");
        return null;
    }

//    @PostMapping(value = "/getPosInfo")
//    @ApiOperation(value = "获取收银机相关信息", notes = "资料校验接口，根据收银机号获取相关数据")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "posId", value = "收银机号", dataType = "String", required = true, paramType = "query")
//    })
//    @ApiRestAction(modelClass = GetPosInfoModel.class, serviceClass = HaiDingService.class, methodName = "getPosInfo")
//    public ResultHaiDingDomain getPosInfo() {
//        return null;
//    }
}
