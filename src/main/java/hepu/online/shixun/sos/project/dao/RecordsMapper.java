package hepu.online.shixun.sos.project.dao;

import hepu.online.shixun.sos.project.model.Records;
import hepu.online.shixun.sos.project.model.RecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordsMapper {
	
	List<Records> allfundRecords(int id);
	
    int countByExample(RecordsExample example);

    int deleteByExample(RecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Records record);

    int insertSelective(Records record);

    List<Records> selectByExample(RecordsExample example);

    Records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExample(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKey(Records record);
}