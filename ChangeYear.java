


import java.time.LocalDate;


public class ChangeYear {
    public static String changeCan(int age) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear() - age;
        String can = "";
        String chi = "";
        int checkCan = year % 10;
        int checkChi = year % 12;
        switch (checkCan) {
            case 0:
                can = "CANH";
                break;
            case 1:
                can = "TÂN";
                break;
            case 2:
                can = "NHÂM";
                break;
            case 3:
                can = "QUÝ";
                break;
            case 4:
                can = "GIÁP";
                break;
            case 5:
                can = "ẤT";
                break;
            case 6:
                can = "BÍNH";
                break;
            case 7:
                can = "ĐINH";
                break;
            case 8:
                can = "MẬU";
                break;
            default:
                can = "KỶ";

        }
        switch (checkChi) {
            case 0:
                chi = "THÂN";
                break;
            case 1:
                chi = "DẬU";
                break;
            case 2:
                chi = "TUẤT";
                break;
            case 3:
                chi = "HỢI";
                break;
            case 4:
                chi = "TÝ";
                break;
            case 5:
                chi = "SỬU";
                break;
            case 6:
                chi = "DẦN";
                break;
            case 7:
                chi = "MÃO";
                break;
            case 8:
                chi = "THÌN";
                break;
            case 9:
                chi = "TỴ";
                break;
            case 10:
                chi="NGỌ";
            default:
                chi="MÙI";

        }
        return (can+" "+chi);
    }
}
