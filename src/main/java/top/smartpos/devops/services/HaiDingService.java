package top.smartpos.devops.services;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import top.smartpos.devops.beans.Models.haiding.GetPosInfoModel;
import top.smartpos.devops.beans.Models.haiding.SaleSaveModel;
import top.smartpos.devops.beans.domains.haiding.ResultHaiDingDomain;

@Service
public class HaiDingService {
    public ResultHaiDingDomain saleSave(SaleSaveModel saleSaveModel) {
        String jsonString = "{\"success\":true,\"statusCode\":\"0\",\"message\":\"调用成功\"}";
        System.out.println(saleSaveModel.toString());
        return new Gson().fromJson(jsonString, ResultHaiDingDomain.class);
    }

    public ResultHaiDingDomain getPosInfo(GetPosInfoModel getPosInfoModel) {
        System.out.println(getPosInfoModel.toString());
        String jsonString = "{\"success\":true,\"statusCode\":\"0\",\"message\":\"调用成功\",\"body\":{\"payments\":[{\"uuid\":\"ze23232323ce90802340h343z\",\"code\":\"001\",\"name\":\"银行卡\"}],\"banks\":[{\"code\":\"001\",\"name\":\"中国银行\",\"uniCode\":\"09\",\"type\":\"内卡\"}],\"products\":[{\"uuid\":\"zsss00s00000s0d0s0d00s0000wqwe\",\"code\":\"001\",\"name\":\"cup\",\"store\":[{\"uuid\":\"zsss00s00000s0d0s0d00s0000wqwe\",\"code\":\"001\",\"name\":\"周浦万达广场\"}],\"tenant\":[{\"uuid\":\"zsss00s00000s0d0s0d00s0000wqwe\",\"code\":\"001\",\"name\":\"李林\"}]}]}}";
        return new Gson().fromJson(jsonString, ResultHaiDingDomain.class);
    }
}
