package hepu.online.shixun.sos.project.dao;

import hepu.online.shixun.sos.project.model.Loan;
import hepu.online.shixun.sos.project.model.LoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanMapper {
    int countByExample(LoanExample example);

    int deleteByExample(LoanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExample(LoanExample example);

    Loan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByExample(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);

	List<Loan> getAllLoan();

	void agreeProcess(int id);

	void disagreeProcess(int id);

	Loan selectLoanByName(String userName);
	/**
	 * 新增一条loan数据
	 */
	public void insertLoan(Loan loan);

}