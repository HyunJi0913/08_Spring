package org.scoula.security.account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.security.account.domain.AuthVO;
import java.util.Date;//"심볼 'date'를 해결할 수 없습니다 -> 해결

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

    private String username;
    private String password;
    private String email;
    private Date regDate;
    private Date updateDate;
    private List<AuthVO> authList; // 권한 목록, join 처리 필요

}