package top.smartpos.devops.mappers;

import org.apache.ibatis.annotations.Mapper;
import top.smartpos.devops.domains.DEnv;

import java.util.List;

@Mapper
public interface DEnvMapper {
    List<DEnv> findAll();
}