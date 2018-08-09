package cn.hospital.pojo;

public class Ppatient_cost {
    private Integer id;

    private Integer regisFee;

    private Float inspeFee;

    private Float drugFee;

    private Integer patientId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegisFee() {
        return regisFee;
    }

    public void setRegisFee(Integer regisFee) {
        this.regisFee = regisFee;
    }

    public Float getInspeFee() {
        return inspeFee;
    }

    public void setInspeFee(Float inspeFee) {
        this.inspeFee = inspeFee;
    }

    public Float getDrugFee() {
        return drugFee;
    }

    public void setDrugFee(Float drugFee) {
        this.drugFee = drugFee;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
}