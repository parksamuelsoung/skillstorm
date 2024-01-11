import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SilversGym {
    
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();
        ArrayList<Member> allMembers = memberRepository.getMembers();

        System.out.println("\n\n\n\n\nSilver's Gym" + 
            "\nMember Mailer Generator" +
            "\n(For Platinum Club Eligibility)");
        System.out.println("\nAll Members:\n" + allMembers);





        List<Member> filteredMembers = allMembers.stream()
            .filter((member) -> member.getMemberStatus() == "Gold")
            .filter((member) -> member.getAddress() != null)
            .collect(Collectors.toList());
        System.out.println("\n\n\n\n\nFiltered Members:\n" + filteredMembers);




        
        List<Member> sortedMembers = filteredMembers.stream()
            .sorted((mem1, mem2) -> mem1.compareTo(mem2))
            .collect(Collectors.toList());
        System.out.println("\n\n\n\n\nSorted Members:\n" + sortedMembers);





        List<MailerTemplate> mappedMembers = new ArrayList<>();
        filteredMembers.stream()
            .map((member) -> (mappedMembers.add(new MailerTemplate(member.getFullName(), member.getAddress()))))
            .collect(Collectors.toList());
        System.out.println("\n\n\n\n\nMapped Members:\n" + mappedMembers);





        mappedMembers.stream()
            .forEach((mailer) -> mailer.setMailMessage("\nCongratulations from Silver's Gym!\nYou are elible to join the Platinum Club."));
        System.out.println("\n\n\n\n\nMail Ready!\nForEach Members:\n" + mappedMembers);





        allMembers.stream()
            .filter((member) -> member.getMemberStatus() == "Gold")
            .filter((member) -> member.getAddress() != null)
            .sorted((mem1, mem2) -> mem1.compareTo(mem2))
            .map((member) -> (mappedMembers.add(new MailerTemplate(member.getFullName(), member.getAddress()))));
        mappedMembers.stream()
            .forEach((mailer) -> mailer.setMailMessage("\nCongratulations from Silver's Gym!\nYou are elible to join the Platinum Club."));
        System.out.println("\n\n\n\n\nMail Ready!\nComplete Stream Members:\n" + mappedMembers);

    }
}
