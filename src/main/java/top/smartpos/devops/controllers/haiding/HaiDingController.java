package top.smartpos.devops.controllers.haiding;

import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.protocol.Result;
import top.smartpos.devops.utils.ResultUtils;
import top.smartpos.devops.utils.SpringUtils;

@RestController
//@RequestMapping(value = "/haiding")
@Api(tags = "海鼎接口", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ApiResponses({@ApiResponse(code = 200, message = "操作成功", response = Result.class),
        @ApiResponse(code = 401, message = "权限不足", response = Result.class),
        @ApiResponse(code = 403, message = "禁止访问", response = Result.class),
        @ApiResponse(code = 404, message = "资源未找到", response = Result.class)
})
public class HaiDingController {
    @GetMapping(value = "/saleSave")
    @ApiOperation(value = "上传销售数据", notes = "上传流水数据，包括订单详情、订单流水以及订单支付")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "学生ID", dataType = "int", required = true),
            @ApiImplicitParam(name = "name", value = "学生NAME", dataType = "String", required = true)})
    public Result saleSave() throws Exception {
        Object obj = SpringUtils.validateAndThrow(GetVipInfoModel.class);
        return ResultUtils.success(obj);
    }
}
