package org.teamone.tempository.project.query.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages  = "org.teamone.tempository.project", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
