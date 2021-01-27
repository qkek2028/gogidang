package com.spring.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.spring.gogidang.domain.Criteria;
import com.spring.gogidang.domain.ReviewVO;

public interface ReviewMapper {

	public List<ReviewVO> getList();
	public List<ReviewVO> getListWithPaging(Criteria cri);
	public List<ReviewVO> getListByIdWithPaging(@Param("pageNum") int pageNum, @Param("amount") int amount, @Param("u_id") String u_id);
	public List<ReviewVO> getListBySnWithPaging(@Param("pageNum") int pageNum, @Param("amount") int amount, @Param("s_num") int s_num);
	
	public ReviewVO getReview(int review_num);
	public void regReview(ReviewVO review);
	public int getTotal(Criteria cri);
	
	public List<ReviewVO> getReviewListAjax(Map<String, String[]> mapp);
}

//public int update(ReviewVO review);
//public int delete(int review_num);
