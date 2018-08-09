package cn.hospital.pojo;

import java.util.Date;

public class Visit {
    private Integer visitId;

    private Integer deparId;

    private Boolean roomId;

    private Byte visitType;

    private Byte pharType;

    private Date registerType;

    private Boolean payType;

    private Boolean payId;

    private Integer inspect;

    private Integer drug;

    private Integer payMoney;

    private Integer userId;

    private Integer patientId;

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public Integer getDeparId() {
        return deparId;
    }

    public void setDeparId(Integer deparId) {
        this.deparId = deparId;
    }

    public Boolean getRoomId() {
        return roomId;
    }

    public void setRoomId(Boolean roomId) {
        this.roomId = roomId;
    }

    public Byte getVisitType() {
        return visitType;
    }

    public void setVisitType(Byte visitType) {
        this.visitType = visitType;
    }

    public Byte getPharType() {
        return pharType;
    }

    public void setPharType(Byte pharType) {
        this.pharType = pharType;
    }

    public Date getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Date registerType) {
        this.registerType = registerType;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Boolean getPayId() {
        return payId;
    }

    public void setPayId(Boolean payId) {
        this.payId = payId;
    }

    public Integer getInspect() {
        return inspect;
    }

    public void setInspect(Integer inspect) {
        this.inspect = inspect;
    }

    public Integer getDrug() {
        return drug;
    }

    public void setDrug(Integer drug) {
        this.drug = drug;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
}