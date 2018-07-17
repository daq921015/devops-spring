package top.smartpos.devops.controllers.baoli;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "保利接口")
public class BaoLiController {
    @PostMapping(value = "/getVipInfo")
    @ApiOperation(value = "获取会员、卡及优惠券信息", notes = "根据会员手机号、卡号、动态会员号等查询会员信息,三者必须传其一")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cellphone", value = "会员手机号(11~20位的整数)", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "card", value = "会员卡号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "dynamiccard", value = "动态会员号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "service", value = "查询会员接口名称", defaultValue = "cw.member.all", required = true, dataType = "String", paramType = "query")
    })
    @ApiRestAction(modelClass = GetVipInfoModel.class, serviceClass = BaoLiService.class, methodName = "getVipInfo")
    public ResultGetVipInfoDomain getVipInfo() {
        return null;
    }

    @PostMapping(value = "/accountReduce")
    @ApiOperation(value = "会员储值支付", notes = "扣减会员帐户中的余额，1手机号+验证码 2会员卡磁轨信息 3会员动态卡三者必须传其一\n")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cellphone", value = "会员手机号(11~20位的整数)", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "validate", value = "手机验证码", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "cardtrack", value = "会员卡磁轨信息", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "dynamiccard", value = "会员动态卡号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "transid", value = "事务ID", defaultValue = "123456", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "money", value = "扣减金额", defaultValue = "10.22", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "scenecode", value = "由商家自行定义，但需要在汉朔系统里录入，用于报表展现等", defaultValue = "餐饮", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "类型(1扣减2扣减查询3撤销4撤销查询(10天内))", defaultValue = "1", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "storeid", value = "门店号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "posid", value = "交易终端号，如pos机号等", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "invoice_no", value = "交易流水号", defaultValue = "123456", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "invoice_name", value = "交易流水名称,默认为:小票", defaultValue = "小票", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "operid", value = "操作员号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "service", value = "会员储值支付接口名称", defaultValue = "cw.member.account.reduce", required = true, dataType = "String", paramType = "query")
    })
    @ApiRestAction(modelClass = AccounReduceModel.class, serviceClass = BaoLiService.class, methodName = "accountReduce")
    public ResultAccountReduceDomain accountReduce() {
        return null;
    }
}
