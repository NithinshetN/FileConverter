package com.monetize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.monetize.dto.EmployeeFormatedData;
import com.monetize.dto.XmlFormat;
import com.monetize.service.FileConverter;
import com.monetize.service.ServiceImpliment;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceImpliment sr = new ServiceImpliment();
        List<EmployeeFormatedData> employeeDetails = sr.RetreiveFormatedData();
        employeeDetails.sort(Comparator.comparingInt(EmployeeFormatedData::getId));
        FileConverter convert=new FileConverter();

//        convert.getJsonFormatedData(employeeDetails);
//        convert.getExcelFormatedData(employeeDetails);
        try{
            convert.xmlFileConverter(employeeDetails);
//            convert.csvFileConverter(employeeDetails);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
