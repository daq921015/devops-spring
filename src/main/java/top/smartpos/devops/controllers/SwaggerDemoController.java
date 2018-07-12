package top.smartpos.devops.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {
    @Autowired
    private DEnvService dEnvService;

    private static final Logger logger = LoggerFactory.getLogger(SwaggerDemoController.class);


    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @GetMapping(value = "/test")
    public List<DEnv> getStudent() {
        logger.info("开始查询某个学生信息");
        return dEnvService.findAll();
    }


}