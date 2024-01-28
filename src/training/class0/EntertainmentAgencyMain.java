package training.class0;

public class EntertainmentAgencyMain {
    public static void main(String[] args) {
        EntertainmentAgency[] agency = new EntertainmentAgency[3];

        EntertainmentAgency itzy = new EntertainmentAgency();
        itzy.groupName = "있지";
        itzy.people = 5;
        itzy.song = "DALLA DALLA";
        agency[0] = itzy;

        EntertainmentAgency nmixx = new EntertainmentAgency();
        nmixx.groupName = "엔믹스";
        nmixx.people = 6;
        nmixx.song = "DASH";
        agency[1] = nmixx;

        EntertainmentAgency day6 = new EntertainmentAgency();
        day6.groupName = "데이식스";
        day6.people = 4;
        day6.song = "예뻤어";
        agency[2] = day6;

        for (EntertainmentAgency jyp : agency) {
            System.out.println("그룹 " + jyp.groupName + "는 총 " + jyp.people + "명의 인원이며, 대표노래로는 " + jyp.song + "라는 곡이 있다.");
        }
    }
}
