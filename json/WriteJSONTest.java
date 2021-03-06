package bai2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName","Dang");
        employeeDetails.put("lastName","Kim thi");
        employeeDetails.put("website","code lean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee",employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName","code");
        employeeDetails2.put("lastName","lean");
        employeeDetails2.put("website","code lean.vn");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee",employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        try(FileWriter file = new FileWriter("employee.json")){
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
