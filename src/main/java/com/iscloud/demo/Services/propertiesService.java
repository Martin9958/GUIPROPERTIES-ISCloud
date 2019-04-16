package com.iscloud.demo.Services;
import com.iscloud.demo.Exceptions.propertiesException;
import java.util.List;

public interface propertiesService {
    List<String> getAllPropierties() throws propertiesException;
    void updatePropierties(String DBSID,String DBIP,String DBPort,String DBUserName,String DBPassword, String PartitionCount,String MinConn,String MaxConn,String PDFPath, String[] adminEmail) throws propertiesException;

}
