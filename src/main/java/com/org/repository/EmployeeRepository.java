/**
 * 
 */
package com.org.repository;


import com.org.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aqeel
 * @version 1.0
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {

}
