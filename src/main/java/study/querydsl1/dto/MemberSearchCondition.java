package study.querydsl1.dto;

import lombok.Data;

/**
 * packageName : study.querydsl1.dto
 * fileName : MemberSearchCondition
 * author : SHW
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-23   SHW     최초 생성
 */

@Data
public class MemberSearchCondition {
    //회원명, 팀명, 나이(ageGoe, ageLoe)
    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;
}
