package hepu.online.shixun.sos.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import hepu.online.shixun.sos.project.model.Balance;
import hepu.online.shixun.sos.project.model.BalanceExample;
import hepu.online.shixun.sos.project.model.User;

public interface BalanceMapper {
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
    
    
    public List<Balance> getCurrentCard(Balance balance);//得到当前用户绑定的银行卡
    public void addCard(Balance balance);//添加银行卡
    public void deleteCard(Balance balance);//解绑银行卡
    public void rechange(Balance balance);//账户充值
    public void unRechange(Balance balance);//账户提现
    
}
