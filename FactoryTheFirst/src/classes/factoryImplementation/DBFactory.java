package classes.factoryImplementation;

import personpackage.domain.Person;
import factorypackage.factory.IFactory;

public class DBFactory implements IFactory {
	@Override
	public String getName() {
		return Person.name;
	}
	
	@Override
	public void setName(String n) {
		Person.name=n+"DB";	
	}

	@Override
	public int getAge() {
		return Person.age;
	}

	@Override
	public void setAge(int a) {
		Person.age=a;
	}

	@Override
	public String getCity() {
		return Person.city;
	}

	@Override
	public void setCity(String c) {
		Person.city=c+"DB";
	}

}
