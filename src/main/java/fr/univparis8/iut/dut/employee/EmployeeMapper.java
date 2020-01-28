package fr.univparis8.iut.dut.employee;

import java.util.List;
import java.util.stream.Collectors;

public final class EmployeeMapper {

    public static EmployeeDto toEmployeeDto(Employee employee) {
        return EmployeeDto.EmployeeDtoBuilder.create()
                .withId(employee.getId())
                .withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName())
                .build();
    }

    public static Employee toEmployee(EmployeeDto employee) {
        return Employee.EmployeeBuilder.create()
                .withId(employee.getId())
                .withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName())
                .build();
    }

    public static Employee toEmployee(EmployeeEntity employee) {
        return Employee.EmployeeBuilder.create()
                .withId(employee.getId())
                .withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName())
                .build();
    }

    public static EmployeeEntity toEmployee(Employee employee) {
        return EmployeeEntity.EmployeEntityBuilder.create()
                .withId(employee.getId())
                .withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName())
                .build();
    }

    public static List<Employee> toEmployeesList(List<EmployeeEntity> employeeEntities) {
        return employeeEntities.stream()
                .map(EmployeeMapper::toEmployee)
                .collect(Collectors.toList());
    }

    public static List<EmployeeDto> toEmployeesDtoList(List<Employee> employeeEntities) {
        return employeeEntities.stream()
                .map(EmployeeMapper::toEmployeeDto)
                .collect(Collectors.toList());
    }



}
