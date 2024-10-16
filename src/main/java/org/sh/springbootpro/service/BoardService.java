package org.sh.springbootpro.service;

import org.sh.springbootpro.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getList(); // 메서드 선언만 함 (메서드 내용은 BoaradServiceImpl)
    //getList() 메서드는 BoardDTO 객체의 리스트를 반환한다.
        // 서현어) BoardDTO에 있는 List형태를 getList라 하겠다.
}

