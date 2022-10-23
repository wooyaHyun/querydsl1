package study.querydsl1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName : study.querydsl1.dto
 * fileName : UserDto
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
public class UserDto {

    private String name;
    private int age;



    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
