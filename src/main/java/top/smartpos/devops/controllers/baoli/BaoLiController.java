package top.smartpos.devops.controllers.baoli;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.annotations.ApiRestAction;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.protocol.Result;
import top.smartpos.devops.services.DEnvService;

@RestController
@RequestMapping(value = "/baoli")
@Api(tags = "保利接口", produces = "application/json, application/xml", protocols = "http")
public class BaoLiController {
    @GetMapping(value = "/getVipInfo")
    @ApiOperation(value = "获取会员信息会员查询验证接口", notes = "根据会员手机号、卡号、动态会员号等查询会员信息,三者必须传其一", tags = {"获取会员信息"},
            produces = "application/json, application/xml", consumes = "application/json, application/xml")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "学生ID", required = true, dataType = "integer"),
            @ApiImplicitParam(name = "name", value = "学生NAME", required = true, dataType = "String")})
    @ApiResponses({@ApiResponse(code = 400, message = "Invalid Order")})
    @ResponseHeader(name = "head1", description = "response head conf")
    @ApiRestAction(modelClass = GetVipInfoModel.class, serviceClass = DEnvService.class, methodName = "findAll")
    public Result getVipInfo() throws Exception {
        return null;
    }
}
