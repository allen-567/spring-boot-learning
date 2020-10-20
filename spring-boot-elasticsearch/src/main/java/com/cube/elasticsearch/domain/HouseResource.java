package com.cube.elasticsearch.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 滕飞
 * @Date: 2019/9/5 8:07 PM
 * @Description:
 */
@Document(indexName = "dkbs_pangu",type = "houseSource")
@Data
public class HouseResource implements Serializable{

    /**
 * 搜索点到小区的距离（m）默认设置为1000 2018年3月9日15:12:03
 */
    private String distance = "1000";

    private String fireHouse;

    /**
     * 活动名称
     */
    private String activityName;

    private Date rentEndDate;

    private Long id;

    private String brand;

    private String rentType;

    private String city;

    private String district;

    private String subway;

    private String block;

    private Integer price;

    private Integer bedroomNum;

    private String hasToilet;

    private String hasBalcony;

    private String hasShower;

    private String bedroomType;

    private String face;

    private String searchText;

    private String subwayLines;

    private String xiaoquName;

    private String xiaoquAlias;

    private String xiaoquNameNotAnaly;

    private String xiaoquAliasNotAnaly;

    private String block_analyzed;

    private String district_analyzed;

    /** 酷家乐装修图 供应链提供的 suite_decorations.kujiale_image 字段 */
    private String kujialeImage;

    /**
     * 房屋附近的热门地标  可能是商圈、小区、写字楼
     *     优先级 1.	近30天，附近2km内搜索+筛选热度最高的3个位置（超过100uv），距房屋的距离
     *     优先级 2.	近30天，附近5km内搜索+筛选热度最高的3个位置（超过100uv），距房屋的距离
     *     优先级 3.	如1+2=0时，展示与list页一致的短地址即可（当前线上逻辑不变）
     *   示例; 1.  朝阳门热门Top1
     *   示例; 2.  悠唐生活广场热门Top1
     *   示例; 3.  朝阳门热门Top1
     * 附近最热门的地标 2018-12-08 add by 刘吉祥
     */
    private String nearTopHotSite;

    /** 是否属于集中盘房源 */
    private String isInCentralize;

    private String subway_analyzed;

    /** 房屋排序值 */
    private Integer houseRank;

    // liyunfeng modify start
    private String subwayNotAnalyzed;

    public String getSubwayNotAnalyzed() {
        return subwayNotAnalyzed;
    }

    public void setSubwayNotAnalyzed(String subwayNotAnalyzed) {
        this.subwayNotAnalyzed = subwayNotAnalyzed;
    }
    // liyunfeng modify start

    private Integer roomId;

    private Integer suiteId;

    private String roomNumber;

    private Integer roomArea;

    private Integer monthPrice;

    private String roomStatus;

    private String availableDate;

    private String hasImage;

    /** 视频看房 有,无 */
    private String hasVideo;


    private String roomImages;

    private Integer floor;

    private Integer totalFloor;

    private Integer toiletNum;

    private Integer suiteArea;

    private String suiteImages;

    private String hasLift;

    private String heating;

    private String suiteProperty;  // 房屋类型：公租房、商住两用、经适房等

    private String hotWaterType;

    private String subwayNearby;

    private String isMonth;

    private String panorama;

    private Date taskTimeStamp = new Date();
    private long taskTimeStampT = System.currentTimeMillis();

    private String suiteStatus;

    private Integer cityId;

    private Integer districtId;

    private Integer blockId;

    private Integer xiaoquId;

    private String cityLonLat;

    private String districtLatLon;

    private String blockLatLon;

    private String xiaoquLonLat;

    private String subwayLonLat;

    private String cityLonLatString;

    private String districtLatLonString;

    private String blockLatLonString;

    private String xiaoquLonLatString;

    private String hasRoomImages;

    // liyunfeng modify2018.7.17 start
    private String hasActivityName;



    private String searchTextNotAnalyzed;

    private Integer subwayDistance;

    private Integer subwayDuration;

    private Integer publicSpaceNum;

    private String version;

    private String style;

    private int hasError;  //是否问题房源  1:有问题 0：无
    private int housekeeperId;  // 公寓负责人

    private String isSeparatedRoom; //是否隔断房
    private Integer isNewTrend; // 是否新风寓  1：是  0：否
    private String sciRoomNumber; //房间号

    //add by liuhao 销售个人私海id
    private Integer privateId;

    private String signType; // 房间 - 梧桐湾标识


}
