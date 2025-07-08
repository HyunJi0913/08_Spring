package org.scoula.board.dto;

import lombok.*;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.domain.BoardVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long no;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;

    // 첨부파일 정보
    private List<BoardAttachmentVO> attaches;

    // 실제 업로드된 파일들 (form에서 전송됨)
    private List<MultipartFile> files = new ArrayList<>();

    // VO → DTO 변환
    public static BoardDTO of(BoardVO vo) {
        return BoardDTO.builder()
                .no(vo.getNo())
                .title(vo.getTitle())
                .content(vo.getContent())
                .writer(vo.getWriter())
                .regDate(vo.getRegDate())
                .updateDate(vo.getUpdateDate())
                .attaches(vo.getAttaches())
                .regDate(vo.getRegDate())
                .build();
    }

    // DTO → VO 변환
    public BoardVO toVo() {
        return BoardVO.builder()
                .no(no)                    // this.no와 동일
                .title(title)              // this.title과 동일
                .content(content)
                .attaches(attaches)

                .writer(writer)
                .regDate(regDate)
                .updateDate(updateDate)
                .build();
    }
}