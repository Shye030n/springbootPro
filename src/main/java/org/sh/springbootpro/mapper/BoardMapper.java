package org.sh.springbootpro.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sh.springbootpro.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> selectAll();
    //List : 여러개의 데이터를 list(목록)형태로 저장하기 위한 java interface
    //<BoardDTO> = BoardDTO 에 있는 (으로 해석하면 됨)
    //selectAll(); : parameter가 없는 method 선언.(나중에 데이터를 조회하기 위해)

    // * 총 정리 *
        // BoardDTO에 정의된 6개의 필드 전부를 =>  selectAll()메서드로 선언하여 List 형태로 저장 => DB 데이터를 한 번에 불러오기 위해

}

