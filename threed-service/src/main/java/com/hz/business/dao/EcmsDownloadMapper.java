package com.hz.business.dao;

import com.hz.business.pojo.EcmsDownload;
import com.hz.business.pojo.EcmsDownloadExample;
import com.hz.business.pojo.EcmsDownloadWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcmsDownloadMapper {
    long countByExample(EcmsDownloadExample example);

    int deleteByExample(EcmsDownloadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcmsDownloadWithBLOBs record);

    int insertSelective(EcmsDownloadWithBLOBs record);

    List<EcmsDownloadWithBLOBs> selectByExampleWithBLOBs(EcmsDownloadExample example);

    List<EcmsDownload> selectByExample(EcmsDownloadExample example);

    EcmsDownloadWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcmsDownloadWithBLOBs record, @Param("example") EcmsDownloadExample example);

    int updateByExampleWithBLOBs(@Param("record") EcmsDownloadWithBLOBs record, @Param("example") EcmsDownloadExample example);

    int updateByExample(@Param("record") EcmsDownload record, @Param("example") EcmsDownloadExample example);

    int updateByPrimaryKeySelective(EcmsDownloadWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EcmsDownloadWithBLOBs record);

    int updateByPrimaryKey(EcmsDownload record);
    
    
    List<EcmsDownload> listFilesByClassId(Integer classid);
    
    List<EcmsDownload> listFilesById(Integer id);
}