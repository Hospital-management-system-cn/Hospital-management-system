package cn.hospital.pojo;

public class Drug {
    private Integer drugId;

    private Integer visitId;

    private Integer patientId;

    private String drugName;

    private Integer drugPrice;

    private Integer drugTotal;

    private String opinion;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
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

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public Integer getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Integer drugPrice) {
        this.drugPrice = drugPrice;
    }

    public Integer getDrugTotal() {
        return drugTotal;
    }

    public void setDrugTotal(Integer drugTotal) {
        this.drugTotal = drugTotal;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}