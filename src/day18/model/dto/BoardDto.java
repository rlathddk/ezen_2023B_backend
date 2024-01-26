package day18.model.dto;

public class BoardDto {
   // 필드
    private int bno;
    private int cno;
    private String btitle;
    private String bcontent;
    private int bmo;
    private int bdate;
    private int bcount;

    //생성자

 public BoardDto(int bno, int cno, String btitle, String bcontent, int bmo, int bdate, int bcount) {
  this.bno = bno;
  this.cno = cno;
  this.btitle = btitle;
  this.bcontent = bcontent;
  this.bmo = bmo;
  this.bdate = bdate;
  this.bcount = bcount;
 }
 // 글쓰기 생성자

 public BoardDto(String btitle, String bcontent) {
  this.btitle = btitle;
  this.bcontent = bcontent;
 }


 // 메소드

 public int getBno() {
  return bno;
 }

 public void setBno(int bno) {
  this.bno = bno;
 }

 public int getCno() {
  return cno;
 }

 public void setCno(int cno) {
  this.cno = cno;
 }

 public String getBtitle() {
  return btitle;
 }

 public void setBtitle(String btitle) {
  this.btitle = btitle;
 }

 public String getBcontent() {
  return bcontent;
 }

 public void setBcontent(String bcontent) {
  this.bcontent = bcontent;
 }

 public int getBmo() {
  return bmo;
 }

 public void setBmo(int bmo) {
  this.bmo = bmo;
 }

 public int getBdate() {
  return bdate;
 }

 public void setBdate(int bdate) {
  this.bdate = bdate;
 }

 public int getBcount() {
  return bcount;
 }

 public void setBcount(int bcount) {
  this.bcount = bcount;
 }

 @Override
 public String toString() {
  return "BoardDto{" +
          "bno=" + bno +
          ", cno=" + cno +
          ", btitle='" + btitle + '\'' +
          ", bcontent='" + bcontent + '\'' +
          ", bmo=" + bmo +
          ", bdate=" + bdate +
          ", bcount=" + bcount +
          '}';
 }
}
