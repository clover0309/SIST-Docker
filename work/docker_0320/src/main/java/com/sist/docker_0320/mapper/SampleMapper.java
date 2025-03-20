package com.sist.docker_0320.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sist.docker_0320.vo.SampleVO;

@Mapper
public interface SampleMapper {
    // mapper안에 정의된 네임스페이스와 동일하게 지정해야함.
    List<SampleVO> all();
}
