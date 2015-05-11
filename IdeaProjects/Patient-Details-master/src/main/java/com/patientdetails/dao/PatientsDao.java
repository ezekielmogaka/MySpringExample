package com.patientdetails.dao;

import com.patientdetails.models.Patients;

import java.util.List;

/**
 * Created by wahome on 5/8/15.
 */
public interface PatientsDao
{
    public int insertRow(Patients patient);

    public Patients getPatientById(int id);

    public List<Patients> getList();

    public int updateRow(Patients patient);

    public int deleteRow(int id);
}
