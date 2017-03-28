#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import javax.enterprise.context.ApplicationScoped;

import ${package}.model.Member;

@ApplicationScoped
public class MemberDAORepositoryImpl extends AbstractDAORepositoryImpl<Member> {

	private static final long serialVersionUID = 1L;

	public MemberDAORepositoryImpl() {
		super(Member.class);
		
	}

}
