package com.kh.finalproject.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.finalproject.dto.PointHistoryDto;

@Repository
public class PointItemDao {
@Autowired
private SqlSession sqlSession;

//1.등록 C
public void insert(PointHistoryDto pointHistoryDto)
{ 
	sqlSession.insert("pointhistory.insert",pointHistoryDto);
}
//2 수정 U
public boolean update(PointHistoryDto pointHistoryDto)
{
	return sqlSession.update("pointhistory.update",pointHistoryDto)>0;
	
}
//3.(1).회원아이디 기준으로 전체출력
public List<PointHistoryDto> selectList()
{
	return sqlSession.selectList("pointhistory.selectList");
}
//3.(2).번호기준조회
public PointHistoryDto selectOneNumber(int pointHistoryNo)
{
  return sqlSession.selectOne("pointhistory.selectOneNumber", pointHistoryNo);
}

//4..삭제
 
public boolean delete(int pointHistoryNo)
{
	return sqlSession.delete("pointhistory.delete",pointHistoryNo)>0;
}

}