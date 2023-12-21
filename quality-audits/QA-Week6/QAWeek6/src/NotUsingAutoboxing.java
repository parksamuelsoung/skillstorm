import java.util.ArrayList;

public class NotUsingAutoboxing {

    private ArrayList<Integer> callToRenewIds = new ArrayList<>();

    public void saveId(int memberIdPrimitive) {
        Integer memberIdWrapper = Integer.valueOf(memberIdPrimitive);
        callToRenewIds.add(memberIdWrapper);
    }

    public int getId(int currentContactIndex) {
        Integer memberIdWrapper = callToRenewIds.get(currentContactIndex);
        int memberIdPrimitive = memberIdWrapper.intValue();
        return memberIdPrimitive;
    }
}