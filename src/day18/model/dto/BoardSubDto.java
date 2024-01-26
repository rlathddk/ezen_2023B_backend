package day18.model.dto;

public class BoardSubDto {

    // 필드
    private int bno;
    private String bsubcontent;
    private int mno;
    private int subdate;
    private int bsubno;

    // 생성자


    public BoardSubDto(int bno, String bsubcontent, int mno, int subdate, int bsubno) {
        this.bno = bno;
        this.bsubcontent = bsubcontent;
        this.mno = mno;
        this.subdate = subdate;
        this.bsubno = bsubno;
    }

    // 메소드


    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBsubcontent() {
        return bsubcontent;
    }

    public void setBsubcontent(String bsubcontent) {
        this.bsubcontent = bsubcontent;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getSubdate() {
        return subdate;
    }

    public void setSubdate(int subdate) {
        this.subdate = subdate;
    }

    public int getBsubno() {
        return bsubno;
    }

    public void setBsubno(int bsubno) {
        this.bsubno = bsubno;
    }

    @Override
    public String toString() {
        return "BoardSubDto{" +
                "bno=" + bno +
                ", bsubcontent='" + bsubcontent + '\'' +
                ", mno=" + mno +
                ", subdate=" + subdate +
                ", bsubno=" + bsubno +
                '}';
    }
}
