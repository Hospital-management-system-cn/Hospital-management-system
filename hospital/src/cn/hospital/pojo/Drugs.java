package cn.hospital.pojo;

public class Drugs {
    private Integer drugsId;

    private Integer drugsNumber;

    private Integer drugsName;

    private String drugsNum;

    private String drugsPrice;

    public Integer getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(Integer drugsId) {
        this.drugsId = drugsId;
    }

    public Integer getDrugsNumber() {
        return drugsNumber;
    }

    public void setDrugsNumber(Integer drugsNumber) {
        this.drugsNumber = drugsNumber;
    }

    public Integer getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(Integer drugsName) {
        this.drugsName = drugsName;
    }

    public String getDrugsNum() {
        return drugsNum;
    }

    public void setDrugsNum(String drugsNum) {
        this.drugsNum = drugsNum == null ? null : drugsNum.trim();
    }

    public String getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(String drugsPrice) {
        this.drugsPrice = drugsPrice == null ? null : drugsPrice.trim();
    }
}