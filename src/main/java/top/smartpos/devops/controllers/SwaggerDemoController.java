package top.smartpos.devops.controllers;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.smartpos.devops.domains.DEnv;
import top.smartpos.devops.services.DEnvService;

import java.util.List;

/**
 * Created by Administrator on 2017/9/13.
 */
@RestController
@RequestMapping("/api")
@Api(tags = "保利接口", produces = "application/json, application/xml", protocols = "http")
public class SwaggerDemoController {
    @Autowired
    private DEnvService dEnvService;

    private static final Logger logger = LoggerFactory.getLogger(SwaggerDemoController.class);


    @ApiOperation(
            value = "根据id查询学生信息",
            notes = "查询数据库中某个的学生信息",
            tags = {"学生信息"},
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "学生ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "name", value = "学生NAME", required = true, dataType = "String")
    })
    @ApiResponses({@ApiResponse(code = 400, message = "Invalid Order")})
    @ResponseHeader(name = "head1", description = "response head conf")
    @GetMapping(value = "/test")
    public List<DEnv> getStudent() {
        logger.info("开始查询某个学生信息");
        return dEnvService.findAll();
    }


}