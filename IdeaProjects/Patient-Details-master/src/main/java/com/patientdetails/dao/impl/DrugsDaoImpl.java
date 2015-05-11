package com.patientdetails.dao.impl;

import com.patientdetails.dao.DrugsDao;
import com.patientdetails.dao.PatientsDao;
import com.patientdetails.models.Drugs;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by wahome on 5/8/15.
 */
public class DrugsDaoImpl implements DrugsDao
{
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Drugs drug)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drug);
        tx.commit();
        Serializable id = session.getIdentifier(drug);
        session.close();
        return (Integer) id;
    }

    @Override
    public Drugs getDrugById(int id)
    {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Drugs.class);
        criteria.add(Restrictions.eq("id", id));
        Drugs drug = (Drugs) criteria.uniqueResult();
        session.close();
        return drug;
    }

    @Override
    public List<Drugs> getList()
    {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "select all from Drugs e " + "INNER JOIN e.patient_id Patients";
        List<Drugs> drugsList = session.createQuery(hql).list();
        session.close();
        return drugsList;
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
