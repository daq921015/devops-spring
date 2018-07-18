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
        return "{\n" +
                "  \"swagger\": \"2.0\",\n" +
                "  \"info\": {\n" +
                "    \"version\": \"1.0.0\",\n" +
                "    \"title\": \"保利会员系统\"\n" +
                "  },\n" +
                "  \"host\": \"localhost:8080\",\n" +
                "  \"basePath\": \"/\",\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"name\": \"保利接口\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"paths\": {\n" +
                "    \"/baoli/accountReduce\": {\n" +
                "      \"post\": {\n" +
                "        \"tags\": [\n" +
                "          \"保利接口\"\n" +
                "        ],\n" +
                "        \"parameters\": [\n" +
                "          {\n" +
                "            \"in\": \"body\",\n" +
                "            \"name\": \"body\",\n" +
                "            \"description\": \"body内容\",\n" +
                "            \"required\": true,\n" +
                "            \"schema\": {\n" +
                "              \"$ref\": \"#/definitions/SaleSaveModel\"\n" +
                "            }\n" +
                "          }\n" +
                "        ],\n" +
                "        \"responses\": {\n" +
                "          \"200\": {\n" +
                "            \"description\": \"资源请求成功\",\n" +
                "            \"schema\": {\n" +
                "              \"$ref\": \"#/definitions/ResultData\"\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"definitions\": {\n" +
                "    \"ResultData\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"description\": \"http请求是否ok\",\n" +
                "      \"properties\": {\n" +
                "        \"data\": {\n" +
                "          \"$ref\": \"#/definitions/businessData\"\n" +
                "        },\n" +
                "        \"is_success\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"请求是否成功T 代表成功,F 代表失败\"\n" +
                "        },\n" +
                "        \"sign\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"签名\"\n" +
                "        },\n" +
                "        \"sing_type\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"签名方式,暂仅支持MD5\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"businessData\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"description\": \"业务处理是否ok\",\n" +
                "      \"properties\": {\n" +
                "        \"objectData\": {\n" +
                "          \"$ref\": \"#/definitions/data\"\n" +
                "        },\n" +
                "        \"arrayData\": {\n" +
                "          \"type\": \"array\",\n" +
                "          \"items\": {\n" +
                "            \"$ref\": \"#/definitions/data\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"info\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"业务接口返回的提示信息\"\n" +
                "        },\n" +
                "        \"result_code\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"业务接口返回的状态码\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"data\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"description\": \"获取的业务数据\",\n" +
                "      \"properties\": {\n" +
                "        \"balance\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"交易后余额\"\n" +
                "        },\n" +
                "        \"datetime\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"交易时间\"\n" +
                "        },\n" +
                "        \"memberid\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"会员号\"\n" +
                "        },\n" +
                "        \"membername\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"会员姓名\"\n" +
                "        },\n" +
                "        \"trace_no\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"交易流水号\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"SaleSaveModel\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"properties\": {\n" +
                "        \"posNo\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"收银机号\",\n" +
                "          \"example\": \"9999\"\n" +
                "        },\n" +
                "        \"flowNo\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"交易流水号\",\n" +
                "          \"example\": \"No20150722\"\n" +
                "        },\n" +
                "        \"ocrTime\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"交易发生时间\",\n" +
                "          \"example\": \"2014.09.18 15:22:24\"\n" +
                "        },\n" +
                "        \"backTime\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"退货原交易发生时间\",\n" +
                "          \"example\": \"2014.09.18 15:22:24\"\n" +
                "        },\n" +
                "        \"score\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"交易总积分\",\n" +
                "          \"example\": 88\n" +
                "        },\n" +
                "        \"qty\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"交易总数量\",\n" +
                "          \"example\": 88\n" +
                "        },\n" +
                "        \"realAmt\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"实际总金额\",\n" +
                "          \"example\": 888\n" +
                "        },\n" +
                "        \"cardNo\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"会员卡号\",\n" +
                "          \"example\": \"No001\"\n" +
                "        },\n" +
                "        \"payments\": {\n" +
                "          \"type\": \"array\",\n" +
                "          \"description\": \"交易付款明细\",\n" +
                "          \"items\": {\n" +
                "            \"$ref\": \"#/definitions/payment\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"products\": {\n" +
                "          \"type\": \"array\",\n" +
                "          \"description\": \"交易商品明细\",\n" +
                "          \"items\": {\n" +
                "            \"$ref\": \"#/definitions/product\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"payment\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"properties\": {\n" +
                "        \"line\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"行号\",\n" +
                "          \"example\": \"1\"\n" +
                "        },\n" +
                "        \"payment\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"付款方式 uuid\",\n" +
                "          \"example\": \"9c9a3005a23c4be48461b5fa1ddaea82\"\n" +
                "        },\n" +
                "        \"total\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"付款金额\",\n" +
                "          \"example\": 888\n" +
                "        },\n" +
                "        \"charge\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"找零金额\",\n" +
                "          \"example\": 0\n" +
                "        },\n" +
                "        \"discharge\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"不找零金额\",\n" +
                "          \"example\": 0\n" +
                "        },\n" +
                "        \"cardNo\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"会员卡号\",\n" +
                "          \"example\": \"N101\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"product\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"properties\": {\n" +
                "        \"line\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"行号\",\n" +
                "          \"example\": 1\n" +
                "        },\n" +
                "        \"product\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"商品 uuid\",\n" +
                "          \"example\": \"9c9a3005a23c4be48461b5fa1ddaea81\"\n" +
                "        },\n" +
                "        \"productName\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"商品名称\"\n" +
                "        },\n" +
                "        \"qty\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"数量\",\n" +
                "          \"example\": 11\n" +
                "        },\n" +
                "        \"price\": {\n" +
                "          \"type\": \"number\",\n" +
                "          \"format\": \"double\",\n" +
                "          \"description\": \"单价\",\n" +
                "          \"example\": 11\n" +
                "        },\n" +
                "        \"total\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"总金额\",\n" +
                "          \"example\": 888\n" +
                "        },\n" +
                "        \"score\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"商品行积分\",\n" +
                "          \"example\": 88\n" +
                "        },\n" +
                "        \"discount\": {\n" +
                "          \"type\": \"number\",\n" +
                "          \"format\": \"double\",\n" +
                "          \"description\": \"优惠金额\",\n" +
                "          \"example\": 88\n" +
                "        },\n" +
                "        \"proms\": {\n" +
                "          \"type\": \"array\",\n" +
                "          \"description\": \"优惠明细\",\n" +
                "          \"items\": {\n" +
                "            \"$ref\": \"#/definitions/prom\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"prom\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"properties\": {\n" +
                "        \"promType\": {\n" +
                "          \"type\": \"string\",\n" +
                "          \"description\": \"优惠类型\",\n" +
                "          \"example\": \"card\"\n" +
                "        },\n" +
                "        \"promTotal\": {\n" +
                "          \"type\": \"integer\",\n" +
                "          \"format\": \"int\",\n" +
                "          \"description\": \"优惠金额\",\n" +
                "          \"example\": 88\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
}
