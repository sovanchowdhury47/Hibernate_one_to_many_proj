package org.jsp.onetooneApp;

import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="person_details")
public class Person 
{
	@Id
	@GeneratedValue
private int person_id;
private String person_name;
@OneToMany(cascade=CascadeType.ALL)
private List<Car> lst_car;
public int getPerson_id() {
	return person_id;
}
public void setPerson_id(int person_id) {
	this.person_id = person_id;
}
public String getPerson_name() {
	return person_name;
}
public void setPerson_name(String person_name) {
	this.person_name = person_name;
}
public List<Car> getLst_car() {
	return lst_car;
}
public void setLst_car(List<Car> lst_car) {
	this.lst_car = lst_car;
}
}
