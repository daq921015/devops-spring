package top.smartpos.devops.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.smartpos.devops.beans.Models.baoli.GetVipInfoModel;
import top.smartpos.devops.beans.domains.DEnv;
import top.smartpos.devops.enums.ResultEnum;
import top.smartpos.devops.exceptions.ApiException;
import top.smartpos.devops.mappers.DEnvMapper;
import top.smartpos.devops.utils.LogUtils;

import java.util.List;

@Service
public class DEnvService {
    @Autowired
    private DEnvMapper dEnvMapper;

    public List<DEnv> findAll(GetVipInfoModel getVipInfoModel) {
        return dEnvMapper.findAll();
    }
}
