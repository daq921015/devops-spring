package top.smartpos.devops.services;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.domains.DEnv;
import top.smartpos.devops.enums.ResultEnum;
import top.smartpos.devops.exceptions.ApiException;
import top.smartpos.devops.mappers.DEnvMapper;

import java.util.List;

@Service
public class DEnvService {
    @Autowired
    private DEnvMapper dEnvMapper;

    public List<DEnv> findAll(GetVipInfoModel getVipInfoModel) {
//        String cellphone = getVipInfoModel.getCellphone();
//        String catd = getVipInfoModel.getCard();
//        String dynamiccard = getVipInfoModel.getDynamiccard();
//        if (!(StringUtils.isNotBlank(cellphone) || StringUtils.isNotBlank(catd) || StringUtils.isNotBlank(dynamiccard))) {
//            throw new ApiException(ResultEnum.BAOLI_VIP_VALIDATE_ERROR);
//        }
        return dEnvMapper.findAll();
    }
}
