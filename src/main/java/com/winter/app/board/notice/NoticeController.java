package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardVO;
import com.winter.app.util.Pager;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String getList(Pager pager,org.springframework.ui.Model model) throws Exception {
		
		List<BoardVO> ar = service.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		
		
		return "/board/list";
	}
	
	@GetMapping("add")
	public String add() throws Exception{
		return "/board/add";
	}
	
	@PostMapping("add")
	public String add(NoticeVO vo) throws Exception{
		int result = service.add(vo);
		
		return "redirect:./list";
	}
	
}