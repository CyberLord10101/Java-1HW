package javaproject;

public class MultiClubMember extends Member {
    private int membershipPoints;

    MultiClubMember(char memberType, int memberID, String name, double fees, int membershipPoints){
        super(memberType,memberID,name,fees);
        this.membershipPoints = membershipPoints;
    }
    public void setMembershipPoints(int membershipPoints){
        this.membershipPoints = membershipPoints;
    }
    public int getMembershipPoints(){
        return membershipPoints;
    }
    @Override
    public String toString(){
        return super.toString() + ", " + membershipPoints;
    }
}
