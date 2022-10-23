package study.querydsl1.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * packageName : study.querydsl1.entity
 * fileName : Hello
 * author : SHW
 * date : 2022-10-17
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-17   SHW     최초 생성
 */

@Entity
@Getter
public class Hello {

    @Id @GeneratedValue
    private Long id;
}
