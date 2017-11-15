package hepu.online.shixun.sos.project.dao;

import hepu.online.shixun.sos.project.model.SystemMessage;
import hepu.online.shixun.sos.project.model.SystemMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMessageMapper {
    int countByExample(SystemMessageExample example);

    int deleteByExample(SystemMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemMessage record);
    
    int insertSelective(SystemMessage record);

    List<SystemMessage> selectByExample(SystemMessageExample example);

    SystemMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemMessage record, @Param("example") SystemMessageExample example);

    int updateByExample(@Param("record") SystemMessage record, @Param("example") SystemMessageExample example);

    int updateByPrimaryKeySelective(SystemMessage record);

    int updateByPrimaryKey(SystemMessage record);
    
    int sendMessage(@Param("userName")String userName, @Param("title")String title, @Param("messages")String messages);

	SystemMessage getSystemMessage(String userName);
}