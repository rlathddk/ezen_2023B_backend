package 개인과제.과제6;


public class Member {

    // 필드
    private String 아이디;
    private  String 비밀번호;
    private  String 이름;
    private  String 전화번호;
    private  String 나이;

    // 생성자

    public String get아이디() {
        return 아이디;
    }

    public void set아이디(String 아이디) {
        this.아이디 = 아이디;
    }

    public String get비밀번호() {
        return 비밀번호;
    }

    public void set비밀번호(String 비밀번호) {
        this.비밀번호 = 비밀번호;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public String get전화번호() {
        return 전화번호;
    }

    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }

    public String get나이() {
        return 나이;
    }



    public void set나이(String 나이) {
        this.나이 = 나이;
    }

    public Member(String 아이디, String 비밀번호, String 이름, String 전화번호, String 나이) {
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.나이 = 나이;

    }
    @Override
    public String toString() {
        return "Member{" +
                "아이디='" + 아이디 + '\'' +
                ", 비밀번호='" + 비밀번호 + '\'' +
                ", 이름='" + 이름 + '\'' +
                ", 전화번호=" + 전화번호 +
                ", 나이=" + 나이 +
                '}';
    }
}
