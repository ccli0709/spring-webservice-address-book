package tw.com.sdms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tw.com.sdms.model.Tbdu01;

@Mapper
public interface Tbdu01Mapper {
    int deleteByPrimaryKey(@Param("compno") String compno, @Param("userno") String userno);

    int insert(Tbdu01 record);

    Tbdu01 selectByPrimaryKey(@Param("compno") String compno, @Param("userno") String userno);

    List<Tbdu01> selectAll();

    int updateByPrimaryKey(Tbdu01 record);
}