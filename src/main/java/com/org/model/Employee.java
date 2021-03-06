/**
 * 
 */
package com.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * @author Aqeel
 * @version 1.0
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String name;

}
