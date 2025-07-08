package org.scoula.board.domain;

import lombok.*;
import org.scoula.board.domain.BoardAttachmentVO;

import java.util.List;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
    private Long no;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;

    // 첨부파일 목록 추가
    private List<BoardAttachmentVO> attaches;
}
