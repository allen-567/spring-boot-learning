package com.cube.elasticsearch.dao;

import com.cube.elasticsearch.domain.HouseResource;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: 滕飞
 * @Date: 2019/9/5 8:10 PM
 * @Description:
 */
@Component
public interface HouseRepository extends ElasticsearchCrudRepository<HouseResource, Long>{
}
