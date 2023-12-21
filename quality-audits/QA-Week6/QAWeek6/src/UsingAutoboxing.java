import java.util.ArrayList;

public class UsingAutoboxing {

    private ArrayList<Integer> callToRenewIds = new ArrayList<>();

    public void saveId(int newMemberIdPrimitive) {
        Integer newMemberIdWrapper = newMemberIdPrimitive;
        callToRenewIds.add(newMemberIdWrapper);
    }

    public int getId(int currentContactIndex) {
        Integer memberIdWrapper = callToRenewIds.get(currentContactIndex);
        int memberIdPrimitive = memberIdWrapper;
        return memberIdPrimitive;
    }
}