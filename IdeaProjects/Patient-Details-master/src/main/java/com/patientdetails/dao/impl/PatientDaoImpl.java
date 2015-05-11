package com.patientdetails.dao.impl;

import com.patientdetails.dao.PatientsDao;
import com.patientdetails.models.Patients;
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
 * Created by wahome on 5/7/15.
 */
public class PatientDaoImpl implements PatientsDao
{
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Patients patient)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(patient);
        tx.commit();
        Serializable id = session.getIdentifier(patient);
        session.close();
        return (Integer) id;
    }

    @Override
    public Patients getPatientById(int id)
    {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patients.class);
        criteria.add(Restrictions.eq("id", id));
        Patients patient = (Patients) criteria.uniqueResult();
        session.close();
        return patient;
    }

    @Override
    public List<Patients> getList()
    {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Patients> patientsList = session.createQuery("from Patients").list();
        session.close();
        return patientsList;
    }

    @Override
    public int updateRow(Patients patient)
    {
        return 0;
    }

    @Override
    public int deleteRow(int id)
    {
        return 0;
    }
}
