package com.patientdetails.controllers;

import com.patientdetails.models.Drugs;
import com.patientdetails.models.Patients;
import com.patientdetails.services.DrugService;
import com.patientdetails.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wahome on 5/7/15.
 */
@Controller
public class PatientDetails
{
    @Autowired
    PatientsService patientsService;

    @Autowired
    DrugService drugService;

    @RequestMapping("/index")
    public String patient_details(Model model)
    {
        model.addAttribute("message","Patient Details");
        return "details";
    }

//    @RequestMapping("/drugs")
//    public String patient_drugs(Model model)
//    {
//        model.addAttribute("message","Drugs prescribed to patient");
//        return "drugs";
//    }
    @RequestMapping("/drugs")
    public ModelAndView patient_drugs()
    {
        ModelAndView model = new ModelAndView();
        List<Patients> patientsList = patientsService.getList();
        model.addObject("patientList", patientsList);
        model.setViewName("drugs");

        return model;
    }

    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "patient_fname", required = false) String fname,
                               @RequestParam(value = "patient_lname", required = false) String lname,
                               @RequestParam(value = "patient_dob", required = false) String dob
                                )
    {
        ModelAndView model = new ModelAndView();

        Patients patient = new Patients();
        patient.setFname(fname);
        patient.setLast_name(lname);
        patient.setDob(dob);
        patientsService.insertRow(patient);

        model.setViewName("details");
        return model;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "patient_id", required = false) String patient_id,
                               @RequestParam(value = "drug_name", required = false) String drug_name
    )
    {
        ModelAndView model = new ModelAndView();

        Drugs drug = new Drugs();
        drug.setDname(drug_name);
        drug.setPatient_id(patient_id);
        drugService.insertRow(drug);

        model.setViewName("drugs");
        return model;
    }

    @RequestMapping("/list")
    public  ModelAndView viewList()
    {
        ModelAndView model = new ModelAndView();
        List<Drugs> drugsList = drugService.getList();
        model.addObject("detailsList", drugsList);

        model.setViewName("display");
        return model;


    }
}
