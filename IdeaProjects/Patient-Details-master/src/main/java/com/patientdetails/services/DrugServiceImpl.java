package com.patientdetails.services;

import com.patientdetails.dao.DrugsDao;
import com.patientdetails.models.Drugs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wahome on 5/8/15.
 */
public class DrugServiceImpl implements DrugService
{
    @Autowired
    DrugsDao drugsDao;

    @Override
    public int insertRow(Drugs drug)
    {
        return drugsDao.insertRow(drug);
    }

    @Override
    public Drugs getDrugById(int id)
    {
        return drugsDao.getDrugById(id);
    }

    @Override
    public List<Drugs> getList()
    {
        return drugsDao.getList();
    }

    @Override
    public int updateRow(Drugs drug)
    {
        return 0;
    }

    @Override
    public int deleteRow(int id)
    {
        return 0;
    }
}
