package com.iscloud.demo.Services.PropertyServiceImpl;

import com.iscloud.demo.Exceptions.propertiesException;
import com.iscloud.demo.Model.Configuration;
import com.iscloud.demo.Services.propertiesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropertyServiceImp implements propertiesService {
    Configuration configuration = new Configuration();

    @Override
    public List<String> getAllPropierties() throws propertiesException {
        List<String> propierties = new ArrayList<String>();
        propierties.add(configuration.getSeguroGirosDBSID());
        propierties.add(configuration.getSeguroGirosDBIP());
        propierties.add(configuration.getSeguroGirosDBPort());
        propierties.add(configuration.getSeguroGirosDBUserName());
        propierties.add(configuration.getSeguroGirosDBPassword());
        propierties.add(configuration.getSeguroGirosPartitionCount());
        propierties.add(configuration.getSeguroGirosMinConnectionsPerPartition());
        propierties.add(configuration.getSeguroGirosMaxConnectionsPerPartition());
        propierties.add(configuration.getSeguroGirosPDFPath());
        for(int i=0;i<configuration.getAdminEmailAddress().length;i++){
            propierties.add(configuration.getAdminEmailAddress()[i]);
        }
        return propierties;
    }

    @Override
    public void updatePropierties(String DBSID, String DBIP, String DBPort, String DBUserName, String DBPassword, String PartitionCount, String MinConn, String MaxConn, String PDFPath, String[] adminEmail) throws propertiesException {
        configuration.setSeguroGirosDBSID(DBSID);
        configuration.setSeguroGirosDBIP(DBIP);
        configuration.setSeguroGirosDBPort(DBPort);
        configuration.setSeguroGirosDBUserName(DBUserName);
        configuration.setSeguroGirosDBPassword(DBPassword);
        configuration.setSeguroGirosPartitionCount(PartitionCount);
        configuration.setSeguroGirosMinConnectionsPerPartition(MinConn);
        configuration.setSeguroGirosMaxConnectionsPerPartition(MaxConn);
        configuration.setSeguroGirosPDFPath(PDFPath);
        configuration.setAdminEmailAddress(adminEmail);
    }


}
