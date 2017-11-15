package hepu.online.shixun.sos.project.dao;

import hepu.online.shixun.sos.project.model.Adminstor;
import hepu.online.shixun.sos.project.model.AdminstorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminstorMapper {
    int countByExample(AdminstorExample example);

    int deleteByExample(AdminstorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Adminstor record);

    int insertSelective(Adminstor record);

    List<Adminstor> selectByExample(AdminstorExample example);

    Adminstor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Adminstor record, @Param("example") AdminstorExample example);

    int updateByExample(@Param("record") Adminstor record, @Param("example") AdminstorExample example);

    int updateByPrimaryKeySelective(Adminstor record);

    int updateByPrimaryKey(Adminstor record);

	List<Adminstor> getAllAdminstor();
}