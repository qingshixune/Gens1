package hepu.online.shixun.sos.project.dao;

import hepu.online.shixun.sos.project.model.User;
import hepu.online.shixun.sos.project.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> getAllUser();

	void lockUserById(int id);

	void unlockUserById(int id);

	User selectUserByName(String userName);

	void addMoney(double loanMoney,String userName);
	public void insertUser(User user);//注册一个用户
    public List<User> getCurrentUser(User user);//查询当前用户
    public void userLogin(User user);//用户登录
    public void clearUser(User user);//用户注销
    public void insertUserBalance(User user);//余额宝账户认证
    public void rechange(User user);//账户充值
    public void unRechange(User user);//账户提现
    public void inTreasure(User user);//余额宝转入
    public void outTreasure(User user);//余额宝转出
    public void editInformation(User user);//个人资料编辑

	void updateInfo(String userName,String idNumber,String payword,int id);
    
}
