package study.querydsl1.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

/**
 * packageName : study.querydsl1.dto
 * fileName : MemberTeamDto
 * author : SHW
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-23   SHW     최초 생성
 */

@Data
public class MemberTeamDto {
    private Long memberId;
    private String username;
    private int age;
    private Long teamId;
    private String teamName;

    @QueryProjection
    public MemberTeamDto(Long memberId, String username, int age, Long teamId, String teamName) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
        this.teamId = teamId;
        this.teamName = teamName;
    }
}
