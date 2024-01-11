public class Member implements Comparable<Member>{

    private int memberId;
    private String fullName;
    private String address;
    private String memberStatus;
    private int membershipPoints;
    private int membershipYears;
    
    public Member(int memberId, String fullName, String address, 
        String memberStatus, int membershipPoints, int membershipYears) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.address = address;
        this.memberStatus = memberStatus;
        this.membershipPoints = membershipPoints;
        this.membershipYears = membershipYears;
    }

    public int memberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }
    
    public String getAddress() {
        return address;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public int getMembershipPoints() {
        return membershipPoints;
    }

    public int getMembershipYears() {
        return membershipYears;
    }

    @Override
    public int compareTo(Member other) {
        return other.membershipYears - this.membershipYears;
    }

    @Override
    public String toString() {
        return String.format("%n%s %s %s %s (%spts %syears)", 
            memberId, fullName, address, memberStatus, membershipPoints, membershipYears );
    }

    

}