import java.util.ArrayList;
import java.util.Collections;

public class MemberRepository {

    private ArrayList<Member> members = new ArrayList<>();
    private int memberId;

    {
        Collections.addAll(members,
            new Member(++memberId, "Albert Benson", 
            "123 Benson St", "Silver", 60, 6),
            new Member(++memberId, "Carl Drury", 
            "123 Drury St", null, 5, 10),   
            new Member(++memberId, "Enstein Frank", 
            "123 Frank St", "Bronze", 100, 1),
            new Member(++memberId, "Gilbert Holmes", 
            "123 Holmes St", "Gold", 30, 20),
            new Member(++memberId, "Irene Joyce", 
            null, "Gold", 35, 4),
            new Member(++memberId, "Karen Lawson", 
            "123 Lawson St", "Gold", 120, 4),
            new Member(++memberId, "Mason Noffman", 
            null, "Silver", 140, 25),
            new Member(++memberId, "Oliver Pickle", 
            "123 Pickle St", "Bronze", 0, 0),
            new Member(++memberId, "Quick Roberts", 
            "123 Roberts St", null, 5, 1),
            new Member(++memberId, "Steve Tennis", 
            "123 Tennis St", "Silver", 1, 1),
            new Member(++memberId, "Unice Victoria", 
            null, "Silver", 10, 10),
            new Member(++memberId, "Wade X-Ray", 
            "123 X-Ray St", "Gold", 60, 15),
            new Member(++memberId, "Yvette Zilla", 
            "123 Zilla St", null, 80, 5)         
        );
    }

    public ArrayList<Member> getMembers() {
        return members;
    }
    
}
