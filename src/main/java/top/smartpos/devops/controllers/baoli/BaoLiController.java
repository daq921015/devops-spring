package top.smartpos.devops.controllers.baoli;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.annotations.ApiRestAction;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.protocol.Result;
import top.smartpos.devops.services.DEnvService;
import top.smartpos.devops.utils.ResultUtils;
import top.smartpos.devops.utils.SpringUtils;

@RestController
//@RequestMapping(value = "/baoli")
@Api(tags = "保利接口", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@ApiResponses({@ApiResponse(code = 200, message = "操作成功", response = Result.class),
        @ApiResponse(code = 401, message = "权限不足", response = Result.class),
        @ApiResponse(code = 403, message = "禁止访问", response = Result.class),
        @ApiResponse(code = 404, message = "资源未找到", response = Result.class)
})
public class BaoLiController {
    @GetMapping(value = "/getVipInfo/{id}")
    @ApiOperation(value = "获取会员信息", notes = "根据会员手机号、卡号、动态会员号等查询会员信息,三者必须传其一")
    @ApiImplicitParams({@ApiImplicitParam(name = "cellphone", value = "手机号(11~20位整数)", dataType = "int"),
            @ApiImplicitParam(name = "card", value = "卡号", dataType = "string")})
    @ApiRestAction(modelClass = GetVipInfoModel.class, serviceClass = DEnvService.class, methodName = "findAll")
    public Result getVipInfo() {
        return null;
    }
}
