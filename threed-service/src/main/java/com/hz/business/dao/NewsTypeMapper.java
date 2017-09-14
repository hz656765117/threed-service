package com.hz.business.dao;

import com.hz.business.pojo.NewsType;
import com.hz.business.pojo.NewsTypeExample;
import com.hz.business.pojo.NewsTypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsTypeMapper {
    long countByExample(NewsTypeExample example);

    int deleteByExample(NewsTypeExample example);

    int deleteByPrimaryKey(Short classid);

    int insert(NewsTypeWithBLOBs record);

    int insertSelective(NewsTypeWithBLOBs record);

    List<NewsTypeWithBLOBs> selectByExampleWithBLOBs(NewsTypeExample example);

    List<NewsType> selectByExample(NewsTypeExample example);

    NewsTypeWithBLOBs selectByPrimaryKey(Short classid);

    int updateByExampleSelective(@Param("record") NewsTypeWithBLOBs record, @Param("example") NewsTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsTypeWithBLOBs record, @Param("example") NewsTypeExample example);

    int updateByExample(@Param("record") NewsType record, @Param("example") NewsTypeExample example);

    int updateByPrimaryKeySelective(NewsTypeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsTypeWithBLOBs record);

    int updateByPrimaryKey(NewsType record);
}