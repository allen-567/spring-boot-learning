package com.cube.springbootes.dao;

import com.cube.springbootes.domain.HouseResource;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Component;

/**
 * @Author: 滕飞
 * @Date: 2019/9/5 8:10 PM
 * @Description:
 */
@Component
public interface HouseRepository extends ElasticsearchCrudRepository<HouseResource, Long>{
}
