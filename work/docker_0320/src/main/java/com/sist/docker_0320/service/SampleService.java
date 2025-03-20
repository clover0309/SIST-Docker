package com.sist.docker_0320.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.docker_0320.mapper.SampleMapper;
import com.sist.docker_0320.vo.SampleVO;

@Service
public class SampleService {
    @Autowired
    private SampleMapper sampleMapper;

    //List는 자료구조 = 연산을 함.
    // 배열은 배열자체가 데이터이며, 연산력이 없음.
    // 많은 데이터의 결과치를 줄때는 프론트단에서 편하게 값을 주기에는 배열이 낫다.
    public List<SampleVO> getall() {
        return sampleMapper.all();
    }

}
