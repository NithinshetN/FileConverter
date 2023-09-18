package com.monetize.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeFormatedData {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String currency;
    private String salary;
    private String currencyName;

    public String toString(){
        return " FirstName:"+first_name+" lastName:"+last_name+" email:"+email+" Gender:"+gender+" Currency:"+currency+" Salary:"+salary+" CurrencyName:"+currencyName+" ID:"+id+"\n";
    }
}
