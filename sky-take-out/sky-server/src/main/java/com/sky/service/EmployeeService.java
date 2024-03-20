package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
   /*
   * 员工新增
   * */
    void save(EmployeeDTO employeeDTO);
   /**
    * @description: 分页查询
    * @author: X_X
    * @param: [employeePageQueryDTO]
    * @return: com.sky.result.PageResult
    **/
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
   /**
    * @description:启用禁用
    * @author: X_X
    * @param: [status, id]
    * @return: void
    **/
    void startOrStop(Integer status, Long id);
    /**
     * @description: 根据id查询员工信息
     * @author: X_X
     * @param: [id]
     * @return: com.sky.entity.Employee
     **/
    Employee getById(Long id);
    /**
     * @description: 更新员工信息
     * @author: X_X
     * @param: [employeeDTO]
     * @return: void
     **/
    void update(EmployeeDTO employeeDTO);
}
