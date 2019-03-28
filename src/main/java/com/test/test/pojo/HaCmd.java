package com.test.test.pojo;


import java.util.Date;

public class HaCmd {

  private long id;
  private String cmd;
  private String parms;
  private long centorid;
  private String uid;
  private Date createtime;
  private String state;
  private long trytimes;
  private Date lastendtime;
  private Date lastbegintime;
  private String processing;
  private long interCmdid;
  private HaCentor haCentor;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getParms() {
        return parms;
    }

    public void setParms(String parms) {
        this.parms = parms;
    }

    public long getCentorid() {
        return centorid;
    }

    public void setCentorid(long centorid) {
        this.centorid = centorid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getTrytimes() {
        return trytimes;
    }

    public void setTrytimes(long trytimes) {
        this.trytimes = trytimes;
    }

    public Date getLastendtime() {
        return lastendtime;
    }

    public void setLastendtime(Date lastendtime) {
        this.lastendtime = lastendtime;
    }

    public Date getLastbegintime() {
        return lastbegintime;
    }

    public void setLastbegintime(Date lastbegintime) {
        this.lastbegintime = lastbegintime;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public long getInterCmdid() {
        return interCmdid;
    }

    public void setInterCmdid(long interCmdid) {
        this.interCmdid = interCmdid;
    }

    public HaCentor getHaCentor() {
        return haCentor;
    }

    public void setHaCentor(HaCentor haCentor) {
        this.haCentor = haCentor;
    }
}
