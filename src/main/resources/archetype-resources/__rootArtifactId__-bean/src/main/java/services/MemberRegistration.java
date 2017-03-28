#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import ${package}.model.Member;
import ${package}.dao.MemberDAORepositoryImpl;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;


// The @Stateless annotation eliminates the need for manual transaction demarcation
@RequestScoped
@Transactional
public class MemberRegistration {

    @Inject
    private Logger log;

    @Inject
    private MemberDAORepositoryImpl em;

    @Inject
    private Event<Member> memberEventSrc;

    public void register(Member member) throws Exception {
        log.info("Registering " + member.getName());
        em.persist(member);
        memberEventSrc.fire(member);
    }
}