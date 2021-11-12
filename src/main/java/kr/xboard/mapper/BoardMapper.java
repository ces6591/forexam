package kr.xboard.mapper;

import java.util.List;

import kr.xboard.domain.BoardVO;

public interface BoardMapper {
	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();

	public void insert(BoardVO board);
	// public void insertSelectKey(BoardVO board, long key);

	public BoardVO read(Long bno);
	
	public int delete(Long bno);

}