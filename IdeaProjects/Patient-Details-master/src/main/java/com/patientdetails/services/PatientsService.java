package com.patientdetails.services;

import com.patientdetails.models.Patients;

import java.util.List;

/**
 * Created by wahome on 5/8/15.
 */
public interface PatientsService
{
    public int insertRow(Patients patient);

    public Patients getPatientsById(int id);

    public List<Patients> getList();

    public int updateRow(Patients patient);

    public int deleteRow(int id);
}
