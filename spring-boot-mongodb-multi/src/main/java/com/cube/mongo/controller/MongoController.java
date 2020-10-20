package com.cube.mongo.controller;

import com.cube.mongo.dao.CustomerDao;
import com.cube.mongo.domain.Customer;
import com.cube.mongo.ds.util.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Author: 滕飞
 * Date: 2019-09-23 16:10
 * Description:
 */
@RestController
public class MongoController {

    @Resource
    private CustomerDao customerDao;


    /**
     * 各种查询样例  https://www.jb51.net/article/124396.htm
     * @return
     */
    @GetMapping("/save")
    public String save () {
        Customer testBean = new Customer();
        testBean.setName("小明00007777");
        testBean.setAge(18);

        customerDao.save(testBean);
        return "success";
    }

    @GetMapping("/findTest")
    public String findTest () {

        Customer one = customerDao.findOne(new Query().addCriteria(Criteria.where("name").is("小明00007777")));
        System.out.println(one);
        return "success";
    }

    @GetMapping("/findTest1")
    public String findTest1 (Map<String , String> params) {
        int currPage = Integer.parseInt(params.get("page").toString());
        int pageSize = Integer.parseInt(params.get("limit").toString());

        Query query = new Query();
        //条件查询
        //普通条件 = 比较 is
        String mobile = params.get("mobile");
        if(mobile != null){
            Criteria c = Criteria.where("mobile").is(mobile );
            query.addCriteria(c);
        }
        //时间 大于$gt  小于$lt 查询
        String starttime = params.get("starttime");
        String endtime = params.get("endtime");
        if(StringUtils.isNotEmpty(starttime) && StringUtils.isNotEmpty(endtime)){
            Criteria c = Criteria.where("createTime").lt(DateUtils.dateToISODate(endtime))
                    .gte(DateUtils.dateToISODate(starttime));
            query.addCriteria(c);
        }
        //排序
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        query.with(sort);

        //分页
        query.skip((currPage-1)*pageSize);
        query.limit(pageSize);

        return "success";
    }

}
