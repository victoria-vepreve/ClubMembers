import java.util.ArrayList;

public class ClubMembers{
    private ArrayList<MemberInfo> memberList;
    public ClubMembers(){
        memberList = new ArrayList<MemberInfo>();
    }
    public void addMembers(String[] names, int gradYear){
        for (String name: names){
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }
    public ArrayList<MemberInfo> getMemberList(){
        return memberList;
    }
    public void setMemberList(ArrayList<MemberInfo> members){ memberList = members;}
    public ArrayList<MemberInfo> removeMembers(int year){
        ArrayList<MemberInfo> alumni = new ArrayList<MemberInfo>();
        for (int i = 0; i< memberList.size(); i++){
            MemberInfo member = memberList.get(i);
            if (member.getGradYear() <= year){
                if (member.inGoodStanding()){
                    alumni.add(member);
                    memberList.remove(i);
                    i--;
                }
            }
        }
        return alumni;
    }
    
    
}