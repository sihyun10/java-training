package training.class0;

public class EntertainmentAgencyMain {
    public static void main(String[] args) {
        EntertainmentAgency[] agency = new EntertainmentAgency[3];

        agency[0] = createAgency("있지", 5, "DALLA DALLA");
        agency[1] = createAgency("엔믹스", 6, "DASH");
        agency[2] = createAgency("데이식스", 4, "예뻤어");

        printAgency(agency);
    }

    private static EntertainmentAgency createAgency(String groupName, int people, String song) {
        EntertainmentAgency jyp = new EntertainmentAgency();
        jyp.groupName = groupName;
        jyp.people = people;
        jyp.song = song;
        return jyp;
    }

    private static void printAgency(EntertainmentAgency[] agency) {
        for (EntertainmentAgency jyp : agency) {
            System.out.println("그룹 " + jyp.groupName + "는 총 " + jyp.people + "명의 인원이며, 대표노래로는 " + jyp.song + "라는 곡이 있다.");
        }
    }
}
