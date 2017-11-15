package hepu.online.shixun.sos.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import hepu.online.shixun.sos.project.model.Balance;
import hepu.online.shixun.sos.project.model.BalanceExample;
import hepu.online.shixun.sos.project.model.Treasure;
import hepu.online.shixun.sos.project.model.User;

public interface TreasureMapper {
	int countByExample(BalanceExample example);

    int deleteByExample(BalanceExample example);

    int deleteByPrimaryKey(int id);

    int insert(Balance record);

    int insertSelective(Balance record);

    List<User> selectByExample(BalanceExample example);

    User selectByPrimaryKey(int id);

    int updateByExampleSelective(@Param("record") Balance record, @Param("example") BalanceExample example);

    int updateByExample(@Param("record") Balance record, @Param("example") BalanceExample example);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
    
    
    
    public List<Treasure> getCurrentTreasure(Treasure t);//获得余额宝账户
    public void insertYuebao(Treasure t);
    public void inTreasure(Treasure t);//余额宝的转入
    public void outTreasure(Treasure t);//余额宝的转出
}
