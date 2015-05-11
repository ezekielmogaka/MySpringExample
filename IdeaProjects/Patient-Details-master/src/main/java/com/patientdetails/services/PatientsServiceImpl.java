package com.patientdetails.services;

import com.patientdetails.dao.PatientsDao;
import com.patientdetails.models.Patients;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wahome on 5/7/15.
 */
public class PatientsServiceImpl implements PatientsService
{
    @Autowired
    PatientsDao patientsDao;

    @Override
    public int insertRow(Patients patient)
    {
        return patientsDao.insertRow(patient);
    }

    @Override
    public Patients getPatientsById(int id)
    {
        return patientsDao.getPatientById(id);
    }

    @Override
    public List<Patients> getList()
    {
        return patientsDao.getList();
    }

    @Override
    public int updateRow(Patients employee)
    {
        return 0;
    }

    @Override
    public int deleteRow(int id)
    {
        return 0;
    }
}
