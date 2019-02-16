package com.perennial.patientapp.controller;

import com.perennial.patientapp.exception.VCare;
import com.perennial.patientapp.handler.DataHandler;
import com.perennial.patientapp.util.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping(value="patient")
public class DataController {


    @Autowired
    private DataHandler dataHandler;

    @RequestMapping(value = "/addSchedule", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addMedicineSchedule(long patientId){

    }


    @RequestMapping(value = "getUserDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> getUserDetails(@RequestParam("id") int id, HttpServletRequest request) {

        try {
            return ResponseHandler.success(dataHandler.getUserDetails(id));
        } catch (VCare | IOException e) {
            return ResponseHandler.error(e);
        }
    }

//    @RequestMapping(value = "addMedicine", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public Map<String, Object> addMedicine( HttpServletRequest request,@RequestBody String medicineJson) {
//        try {
//            return ResponseHandler.success(dataHandler.addMedicineRecord(id));
//        } catch (VCare | IOException e) {
//            return ResponseHandler.error(e);
//        }
//    }


}
