package top.smartpos.devops.services;

import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.stereotype.Service;
import top.smartpos.devops.beans.Models.baoli.AccounReduceModel;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.domains.baoli.result.ResultAccountReduceDomain;
import top.smartpos.devops.beans.domains.baoli.result.ResultGetVipInfoDomain;

@Service
public class BaoLiService {
    public ResultGetVipInfoDomain getVipInfo(GetVipInfoModel getVipInfoModel) throws JSONException {
        String jsonString = "{\"is_success\":\"T\",\"sing_type\":\"MD5\",\"sign\":\"85bf83f78d5cefb804bd805532fc688e\",\"data\":{\"status\":200,\"result_code\":200,\"info\":\"ok\",\"data\":{\"memberid\":\"1644425\",\"name\":\"北辰\",\"cellphone\":\"18611802513\",\"levelid\":\"17\",\"level_name\":\"华贵白金\",\"email\":\"wangfeng@clinkworld.com\",\"sex\":\"女\",\"birthday\":\"2016-09-30\",\"passport\":null,\"photourl\":null,\"value\":\"550.30\",\"value2\":\"57.00\",\"point_exchange\":\"9\",\"min_stock_use_limit\":0,\"balance\":\"10172.00\",\"discount\":0,\"card\":[{\"CardNo\":\"1000875\",\"Status\":\"1\"}],\"coupon\":[{\"couponkeys\":\"8980541503684\",\"title\":\"发券测试\",\"couponvalue\":\"10.0\",\"starttime\":\"2016-11-23 17:25:07\",\"endtime\":\"2016-11-28 17:25:07\",\"type\":\"2\",\"typedesc\":\"代金券\",\"max\":\"10.0\",\"condition\":\"10\"}]}}}";
        return new Gson().fromJson(jsonString, ResultGetVipInfoDomain.class);
    }

    public ResultAccountReduceDomain accountReduce(AccounReduceModel accounReduceModel) {
        String jsonString = "{\"is_success\":\"T\",\"sing_type\":\"MD5\",\"sign\":\"85bf83f78d5cefb804bd805532fc688e\",\"data\":{\"info\":\"ok\",\"result_code\":\"200\",\"data\":{\"memberid\":\"12321321321321\",\"membername\":\"张三\",\"balance\":\"98.00\",\"datetime\":\"2016-03-24 14:13:23\",\"trace_no\":\"99882324\"}}}";
        return new Gson().fromJson(jsonString, ResultAccountReduceDomain.class);
    }
}
