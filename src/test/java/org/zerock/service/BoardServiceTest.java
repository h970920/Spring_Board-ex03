package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {

	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	};
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("�����ۼ��ϴ� ��");
		board.setContent("�����ۼ��� ����");
		board.setWriter("newbie");
		
		service.register(board);
		log.info("������ �Խù��� ��ȣ : "   + board.getBno());
		
	}
	
	@Test
	public void testGerList() {
		
		service.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
}
