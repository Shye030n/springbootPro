package org.sh.springbootpro.controller;

import lombok.extern.log4j.Log4j2;
import org.sh.springbootpro.dto.BoardDTO;
import org.sh.springbootpro.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping("/board")
public class BoardController {


    @Autowired
    private BoardService boardService; // 서비스는 파라미터에 정의할 수 X

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("boardList", boardService.getList());

        //boardService.getList()
        // = boardService에 있는 getList 메서드를 호출하여 얻은 게시물 목록을
        // "boardList"
        // 라는 이름으로 key값으로 쓰겠다.
        // => boardList(); 했을 때, getlist를 호출하여 받은 게시물 목록이 뜸.

        // 한 줄 요약
        // boardService에 있는 메서드 getList를 (호출)();하여 얻은 list(게시물)를
        // "boardList"라는 이름으로 모델(데이터 저장소)에 추가한다.
        // boardService의 getList메서드에서 거를 boardList.jsp로 보낸다?
    }




        @GetMapping("/register")
        public void regisertGet(){
            log.info("regisertGet");
        }
        @PostMapping("/register")
        public String registerPost(BoardDTO boardDTO) {
            log.info("registerPost");
            boardService.register(boardDTO);
            return "redirect:/board/list";
        }
        @GetMapping({"/read","/modify"})
        public void read(@RequestParam("bno") int bno, Model model) {
            log.info("read");
            BoardDTO dto=boardService.getOne(bno);
            model.addAttribute("dto",dto);
        }
        @PostMapping("/modify")
        public String modifyPost(BoardDTO boardDTO) {
            log.info("modifyPost");
            boardService.modify(boardDTO);
            return "redirect:/board/read?bno="+boardDTO.getBno();
        }
        @GetMapping("/remove")
        public String remove(int bno) {
            log.info("remove");
            boardService.remove(bno);
            return "redirect:/board/list";
        }
    }
