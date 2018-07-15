package top.smartpos.devops.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import top.smartpos.devops.beans.domains.DEnv;

import java.util.List;

@Mapper
@Component
public interface DEnvMapper {
    List<DEnv> findAll();
}
