package com.patientdetails.services;

import com.patientdetails.models.Drugs;

import java.util.List;

/**
 * Created by wahome on 5/8/15.
 */
public interface DrugService
{
    public int insertRow(Drugs drug);

    public Drugs getDrugById(int id);

    public List<Drugs> getList();

    public int updateRow(Drugs drug);

    public int deleteRow(int id);
}
