package org.scoula.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.domain.BoardVO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j2

public class BoardMapperTest {
    @Autowired
    private BoardMapper mapper;
    @Test
    @DisplayName("BoardMapper의 새글 작성")
    public void create() {
        BoardVO board = new BoardVO();
        board.setTitle("새로 작성하는 글");
        board.setContent("새로 작성하는 내용");
        board.setWriter("user0");
        int count = mapper.update(board);
        mapper.create(board);
        log.info(board);
    }

    @DisplayName("BoardMapper의 글 삭제")
    public void delete() {

        log.info("DELETE COUNT: " + mapper.delete(3L));

    }
}