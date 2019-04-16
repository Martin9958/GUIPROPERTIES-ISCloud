package com.iscloud.demo.Model;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private String DBSID;
    private String DBIP;
    private String DBPort;
    private String DBUserName;
    private String DBPassword;
    private String PartitionCount;
    private String MinConnectionsPerPartition;
    private String MaxConnectionsPerPartition;
    private String PDFPath;
    private String EmailAddress;


    private Properties p = new Properties();

    public Configuration(){
        try {
            p.load(new FileReader("./files/properties/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSeguroGirosDBSID() {
        return p.getProperty("Application.seguroGirosDBSID");
    }

    public void setSeguroGirosDBSID(String seguroGirosDBSID) {
        p.setProperty("Application.seguroGirosDBSID",seguroGirosDBSID);
    }

    public String getSeguroGirosDBIP() {
        return p.getProperty("Application.seguroGirosDBIP");
    }

    public void setSeguroGirosDBIP(String seguroGirosDBIP) {
        p.setProperty("Application.seguroGirosDBIP",seguroGirosDBIP);
    }

    public String getSeguroGirosDBPort() {
        return p.getProperty("Application.seguroGirosDBPort");
    }

    public void setSeguroGirosDBPort(String seguroGirosDBPort) {
        p.setProperty("Application.seguroGirosDBPort",seguroGirosDBPort);
    }

    public String getSeguroGirosDBUserName() {
       return p.getProperty("Application.seguroGirosDBUserName");
    }

    public void setSeguroGirosDBUserName(String seguroGirosDBUserName) {
        p.setProperty("Application.seguroGirosDBUserName",seguroGirosDBUserName);
    }

    public String getSeguroGirosDBPassword() {
        return p.getProperty("Application.seguroGirosDBPassword");
    }

    public void setSeguroGirosDBPassword(String seguroGirosDBPassword) {
        p.setProperty("Application.seguroGirosDBPassword",seguroGirosDBPassword);
    }

    public String getSeguroGirosPartitionCount() {
        return p.getProperty("Application.seguroGirosPartitionCount");

    }

    public void setSeguroGirosPartitionCount(String seguroGirosPartitionCount) {
        p.setProperty("Application.seguroGirosPartitionCount",seguroGirosPartitionCount);
    }

    public String getSeguroGirosMinConnectionsPerPartition() {
        return p.getProperty("Application.seguroGirosMinConnectionsPerPartition");
    }

    public void setSeguroGirosMinConnectionsPerPartition(String seguroGirosMinConnectionsPerPartition) {
        p.setProperty("Application.seguroGirosMinConnectionsPerPartition",seguroGirosMinConnectionsPerPartition);
    }

    public String getSeguroGirosMaxConnectionsPerPartition() {
        return p.getProperty("Application.seguroGirosMaxConnectionsPerPartition");
    }

    public void setSeguroGirosMaxConnectionsPerPartition(String seguroGirosMaxConnectionsPerPartition) {
        p.setProperty("Application.seguroGirosMaxConnectionsPerPartition",seguroGirosMaxConnectionsPerPartition);
    }

    public String getSeguroGirosPDFPath() {
        return p.getProperty("Application.seguroGirosPDFPath");
    }

    public void setSeguroGirosPDFPath(String seguroGirosPDFPath) {
        p.setProperty("Application.seguroGirosPDFPath",seguroGirosPDFPath);
    }

    public String[] getAdminEmailAddress() {
        String emails = p.getProperty("Application.adminEmailAddress");
        return emails.split(";");
    }

    public void setAdminEmailAddress(String[] adminEmailAddress) {
        String emails = "";
        for(int i=0; i<adminEmailAddress.length;i++){
            if(i==0){
                emails+=adminEmailAddress[i];
            }else{
                emails+=";"+adminEmailAddress[i];
            }
        }
        p.setProperty("Application.adminEmailAddress",emails);
    }
}
