package top.smartpos.devops.controllers.haiding;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.protocol.Result;
import top.smartpos.devops.utils.ResultUtils;
import top.smartpos.devops.utils.SpringUtils;

@RestController
@RequestMapping(value = "/haiding")
@Api(tags = "海鼎接口", produces = "application/json, application/xml", protocols = "http")
public class HaiDingController {
    @GetMapping(value = "/saleSave")
    @ApiOperation(value = "销售数据接口", notes = "上传流水数据，包括订单详情、订单流水以及订单支付", tags = {"上传销售数据"},
            produces = "application/json, application/xml", consumes = "application/json, application/xml")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "学生ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "name", value = "学生NAME", required = true, dataType = "String")})
    @ApiResponses({@ApiResponse(code = 400, message = "Invalid Order")})
    @ResponseHeader(name = "head1", description = "response head conf")
    public Result saleSave() throws Exception {
        Object obj = SpringUtils.validateAndThrow(GetVipInfoModel.class);
        return ResultUtils.success(obj);
    }
}
