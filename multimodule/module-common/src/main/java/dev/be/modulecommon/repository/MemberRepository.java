package dev.be.modulecommon.repository;

import dev.be.modulecommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public class MemberRepository extends JpaRepository<Member, Long> {
}
