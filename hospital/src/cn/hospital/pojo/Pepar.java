package cn.hospital.pojo;

public class Pepar {
    private Integer peparId;

    private Integer peparUnm;

    private String peparName;

    public Integer getPeparId() {
        return peparId;
    }

    public void setPeparId(Integer peparId) {
        this.peparId = peparId;
    }

    public Integer getPeparUnm() {
        return peparUnm;
    }

    public void setPeparUnm(Integer peparUnm) {
        this.peparUnm = peparUnm;
    }

    public String getPeparName() {
        return peparName;
    }

    public void setPeparName(String peparName) {
        this.peparName = peparName == null ? null : peparName.trim();
    }
}