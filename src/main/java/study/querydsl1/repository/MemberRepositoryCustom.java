package study.querydsl1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl1.dto.MemberSearchCondition;
import study.querydsl1.dto.MemberTeamDto;

import java.util.List;

/**
 * packageName : study.querydsl1.repository
 * fileName : MemberRepositoryCustom
 * author : SHW
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-23   SHW     최초 생성
 */

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
