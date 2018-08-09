package cn.hospital.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private Integer tRoleId;

    private Integer tDDeparId;

    private Integer peparId;

    private Integer cityId;

    private Integer userJobunm;

    private String userPwd;

    private String userName;

    private String userCard;

    private Byte sex;

    private String mobile;

    private String email;

    private Date birthday;

    private Date modifyTime;

    private Date createTime;

    private Boolean status;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer gettRoleId() {
        return tRoleId;
    }

    public void settRoleId(Integer tRoleId) {
        this.tRoleId = tRoleId;
    }

    public Integer gettDDeparId() {
        return tDDeparId;
    }

    public void settDDeparId(Integer tDDeparId) {
        this.tDDeparId = tDDeparId;
    }

    public Integer getPeparId() {
        return peparId;
    }

    public void setPeparId(Integer peparId) {
        this.peparId = peparId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getUserJobunm() {
        return userJobunm;
    }

    public void setUserJobunm(Integer userJobunm) {
        this.userJobunm = userJobunm;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}