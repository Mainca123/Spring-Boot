package com.example.BaiTapVN2.controller;

import com.example.BaiTapVN2.entity.Employee;
import com.example.BaiTapVN2.service.EmployeesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CRUD_Employees {
    private final EmployeesService employeesService;
    public CRUD_Employees(EmployeesService employeesService){
        this.employeesService = employeesService;
    }

    @GetMapping("/employees")
    public String getEmployees(Model model){
        List<Employee> employees = employeesService.getEmployees();
        model.addAttribute("employees",employees);
        model.addAttribute("employee",new Employee());
        return "employee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee){
        employeesService.addEmployee(employee);
        return "redirect:/employees";
    }

    @PostMapping("/deleteEmployees")
    public String deleteEmployee(@RequestParam("ids") List<Long> ids){
        System.out.println(ids);
        employeesService.deleteEmployee(ids);
        return "redirect:/employees";
    }

    @GetMapping("/getEmployee")
    @ResponseBody
    public Employee getEmployee(@RequestParam Long id) {
        return employeesService.findEmployee(id);
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@RequestParam Long id,
                                 @RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String address,
                                 @RequestParam String phone) {
        Employee employee = employeesService.findEmployee(id);
        if (employee != null) {
            employee.setName(name);
            employee.setGmail(email);
            employee.setAddress(address);
            employee.setPhone(phone);
            employeesService.addEmployee(employee);
        }
        return "redirect:/employees";
    }
}
