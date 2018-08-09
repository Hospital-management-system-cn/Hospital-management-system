package cn.hospital.pojo;

public class Inspect {
    private Integer inspectId;

    private Integer visitId;

    private Integer patientId;

    private String inspectName;

    private Integer inspectPrice;

    private Integer inspectNum;

    private Integer inspectTotal1;

    private String opinion;

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getInspectName() {
        return inspectName;
    }

    public void setInspectName(String inspectName) {
        this.inspectName = inspectName == null ? null : inspectName.trim();
    }

    public Integer getInspectPrice() {
        return inspectPrice;
    }

    public void setInspectPrice(Integer inspectPrice) {
        this.inspectPrice = inspectPrice;
    }

    public Integer getInspectNum() {
        return inspectNum;
    }

    public void setInspectNum(Integer inspectNum) {
        this.inspectNum = inspectNum;
    }

    public Integer getInspectTotal1() {
        return inspectTotal1;
    }

    public void setInspectTotal1(Integer inspectTotal1) {
        this.inspectTotal1 = inspectTotal1;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}