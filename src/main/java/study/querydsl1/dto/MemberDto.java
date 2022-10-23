package study.querydsl1.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName : study.querydsl1.dto
 * fileName : MemberDto
 * author : SHW
 * date : 2022-10-19
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-19   SHW     최초 생성
 */

@Data
@NoArgsConstructor
public class MemberDto {

    private String username;
    private int age;


    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
