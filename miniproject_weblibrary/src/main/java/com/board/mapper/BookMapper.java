package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.dtos.BookDto;


@Mapper
public interface BookMapper {

   
      // 글 목록
      public List<BookDto> getAllList();
      
      // 검색관련 목록
  		public List<BookDto> getSelectList(String title);
      
      // 글 상세 조회
      public BookDto getBook(int book_seq);
      
      // 글 추가
      public boolean insertBook(BookDto dto);
      
      // 글 수정
      public boolean updateBoard(BookDto dto);
      
      // 글 삭제
      public boolean mulDel(String[] seqs);
      
      // 조회수
      public boolean readCount(int seq);
      
      //페이징
      public int getPCount();
}