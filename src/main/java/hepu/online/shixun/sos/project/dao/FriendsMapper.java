package hepu.online.shixun.sos.project.dao;

import hepu.online.shixun.sos.project.model.Friends;
import hepu.online.shixun.sos.project.model.FriendsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendsMapper {
    int countByExample(FriendsExample example);

    int deleteByExample(FriendsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Friends record);

    int insertSelective(Friends record);

    List<Friends> selectByExample(FriendsExample example);

    Friends selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByExample(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByPrimaryKeySelective(Friends record);

    int updateByPrimaryKey(Friends record);
}