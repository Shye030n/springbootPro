package org.sh.springbootpro.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.sh.springbootpro.dto.BoardDTO;
import org.sh.springbootpro.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardMapper boardMapper;
    //MapperClass는 생성자의 매개변수로(parameter) 쓸 수 없기 때문에,
    // 여기서  boardMapper라는 이름의 field로 선언.
    // private final + 변수
    // => 변수는 이 클래스 내부에서만 접근 가능하며, 변수가 초기화 된 후에는 다른 값으로 변경할 수 없다.


    @Override
    public List<BoardDTO> getList() {  // List<BoardDTO> 타입의 결과를 반환하는 메서드
        // 메서드의 내용을 씀(메서드 구현)
        // (선언은 BoardService)
        return boardMapper.selectAll();
        // boardMapper의 sellectAll메서드를 ();  //호출한다
        // 구체적으로) boardMapper의 메서드 selectAll를 ();(호출)하여 게시물 목록을 가져온다.
    }
        @Override
        public BoardDTO getOne ( int bno){
            boardMapper.visitCountUpdate(bno);
            return boardMapper.selectOne(bno);
        }

        @Override
        public void register (BoardDTO boardDTO){
            boardMapper.insert(boardDTO);
        }

        @Override
        public void modify (BoardDTO boardDTO){
            BoardDTO dto = boardMapper.selectOne(boardDTO.getBno());
            boardMapper.update(boardDTO);

        }

        @Override
        public void remove ( int bno){
            boardMapper.delete(bno);
        }
    }
