package tw.com.sdms.model;

public class Tbdu02 {
    private String compid;

    private String userno;

    private String cryptopw;

    private String randomkey;

    private String lastdate;

    private String ip;

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getCryptopw() {
        return cryptopw;
    }

    public void setCryptopw(String cryptopw) {
        this.cryptopw = cryptopw;
    }

    public String getRandomkey() {
        return randomkey;
    }

    public void setRandomkey(String randomkey) {
        this.randomkey = randomkey;
    }

    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}