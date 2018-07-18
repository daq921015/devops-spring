package top.smartpos.devops.controllers.swagger;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.smartpos.devops.beans.Models.baoli.BaoLiBasicModel;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class GroupController {
    @GetMapping(value = "/swagger-resources")
    public String getGroups() {
        return "[{\"name\":\"保利会员系统\",\"url\":\"/v2/api-docs?group=保利会员系统\",\"swaggerVersion\":\"2.0\",\"location\":\"/v2/api-docs?group=保利会员系统\"},{\"name\":\"海鼎POS系统\",\"url\":\"/v2/api-docs?group=海鼎POS系统\",\"swaggerVersion\":\"2.0\",\"location\":\"/v2/api-docs?group=海鼎POS系统\"}]";
    }

    @GetMapping(value = "/v2/api-docs")
    public String getBaoliApi() {
        return "{\"swagger\":\"2.0\",\"info\":{\"version\":\"1.0.0\",\"title\":\"保利会员系统\"},\"host\":\"localhost:8080\",\"basePath\":\"/\",\"tags\":[{\"name\":\"保利接口\"}],\"paths\":{\"/baoli/accountReduce\":{\"post\":{\"tags\":[\"保利接口\"],\"responses\":{\"200\":{\"description\":\"资源请求成功\",\"schema\":{\"$ref\":\"#/definitions/ResultData\"}}}}}},\"definitions\":{\"ResultData\":{\"type\":\"object\",\"description\":\"http请求是否ok\",\"properties\":{\"data\":{\"$ref\":\"#/definitions/businessData\"},\"data2\":{\"$ref\":\"#/definitions/data\"},\"is_success\":{\"type\":\"string\",\"description\":\"请求是否成功T 代表成功,F 代表失败\"},\"sign\":{\"type\":\"string\",\"description\":\"签名\"},\"sing_type\":{\"type\":\"string\",\"description\":\"签名方式,暂仅支持MD5\"}}},\"businessData\":{\"type\":\"object\",\"description\":\"业务处理是否ok\",\"properties\":{\"data\":{\"$ref\":\"#/definitions/data\"},\"info\":{\"type\":\"string\",\"description\":\"业务接口返回的提示信息\"},\"result_code\":{\"type\":\"string\",\"description\":\"业务接口返回的状态码\"}}},\"data\":{\"type\":\"object\",\"description\":\"获取的业务数据\",\"properties\":{\"balance\":{\"type\":\"string\",\"description\":\"交易后余额\",\"example\":\"交易后余额\"},\"datetime\":{\"type\":\"string\",\"description\":\"交易时间\"},\"memberid\":{\"type\":\"string\",\"description\":\"会员号\"},\"membername\":{\"type\":\"string\",\"description\":\"会员姓名\"},\"trace_no\":{\"type\":\"string\",\"description\":\"交易流水号\"}}}}}";
    }
}
