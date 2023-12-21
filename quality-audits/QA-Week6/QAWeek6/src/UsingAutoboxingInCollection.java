import java.util.ArrayList;

public class UsingAutoboxingInCollection {

    private ArrayList<Integer> callToRenewIds = new ArrayList<>();

    public void saveId(int newMemberIdPrimitive) {
        callToRenewIds.add(newMemberIdPrimitive);
    }

    public int getId(int currentContactIndex) {
        return callToRenewIds.get(currentContactIndex);
        
    }
}