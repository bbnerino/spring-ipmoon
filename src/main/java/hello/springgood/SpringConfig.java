package hello.springgood;

import hello.springgood.repository.JpaMemberRepository;
import hello.springgood.repository.MemoryMemberRepository;
import hello.springgood.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

public class SpringConfig {
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }
    @Bean
    public MemoryMemberRepository memberRepository(){
        return new JpaMemberRepository(em);
    }
}
