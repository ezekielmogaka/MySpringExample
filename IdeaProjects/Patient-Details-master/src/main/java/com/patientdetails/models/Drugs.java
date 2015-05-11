package com.patientdetails.models;

import javax.persistence.*;

/**
 * Created by wahome on 5/8/15.
 */
@Entity
@Table(name="drugs")
public class Drugs
{
    @Id
    @GeneratedValue
    @Column(name = "drug_id")
    private int id;

    @Column(name = "drug_name")
    private String drug_name;

    private String patient_id;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDname()
    {
        return drug_name;
    }

    public void setDname(String drug_name)
    {
        this.drug_name = drug_name;
    }

    public String getPatient_id()
    {
        return patient_id;
    }

    public void setPatient_id(String patient_id)
    {
        this.patient_id = patient_id;
    }

}
