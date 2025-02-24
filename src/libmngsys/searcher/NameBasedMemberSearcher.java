package libmngsys.searcher;

import libmngsys.dataaccessor.DBAccessor;
import libmngsys.dataaccessor.Results;
import libmngsys.dataaccessor.ResultsConverter;
import libmngsys.user.Member;

import java.util.List;

public class NameBasedMemberSearcher implements MemberSearcher{

    private final String memberName;
    private final DBAccessor dbAccessor;

    public NameBasedMemberSearcher(String memberName, DBAccessor dbAccessor) {
        this.memberName = memberName;
        this.dbAccessor = dbAccessor;
    }

    @Override
    public List<Member> search() {
        Results results = dbAccessor.getMembersWithName(memberName);
        return ResultsConverter.convertToMembers(results);
    }
}
