package cn.hospital.pojo;

public class Depar {
    private Integer deparId;

    private Integer deparUnm;

    private String deparName;

    public Integer getDeparId() {
        return deparId;
    }

    public void setDeparId(Integer deparId) {
        this.deparId = deparId;
    }

    public Integer getDeparUnm() {
        return deparUnm;
    }

    public void setDeparUnm(Integer deparUnm) {
        this.deparUnm = deparUnm;
    }

    public String getDeparName() {
        return deparName;
    }

    public void setDeparName(String deparName) {
        this.deparName = deparName == null ? null : deparName.trim();
    }
}