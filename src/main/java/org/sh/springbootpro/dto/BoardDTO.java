package org.sh.springbootpro.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDTO { // = MySql
    private int bno; //field(멤버변수) 선언 _나중에 데이터를 담아 사용하기위해
    private String title;
    private String content;
    private String writer;
    private Date postdate;
    private int visitcount;

    // * 클래스 흐름
    // 1) BoardDTO.java(db에서 쓴 행의 내용 나열)
    // 2) Boardmapper.java "selectAll"
    // 3) BoardMapper.xml(mybatis에서 복붙) "selectAll"
    // 4)   BoardService.java
    // 5) BoardServiceImpl.java (getlist-> get all)
    // 6) BoardController.java
    // 7) jsp파일(view)
}
