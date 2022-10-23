package study.querydsl1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl1.entity.Member;

import java.util.List;

/**
 * packageName : study.querydsl1.repository
 * fileName : MemberRepository
 * author : SHW
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-23   SHW     최초 생성
 */

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    //select m from Member m where m.username = :username
    List<Member> findByUsername(String username);
}
