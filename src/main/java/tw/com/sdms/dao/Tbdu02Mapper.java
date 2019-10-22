package tw.com.sdms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tw.com.sdms.bean.Tbdu02;

@Mapper
public interface Tbdu02Mapper {
	int deleteByPrimaryKey(@Param("compid") String compid, @Param("userno") String userno);

	int insert(Tbdu02 record);

	Tbdu02 selectByPrimaryKey(@Param("compid") String compid, @Param("userno") String userno);

	List<Tbdu02> selectAll();

	int updateByPrimaryKey(Tbdu02 record);
}