package factorypackage.factory;

import java.util.HashMap;
import java.util.Map;

import classes.factoryImplementation.DBFactory;
import classes.factoryImplementation.XMLFactory;

public class DAOFactoryProvider implements IFactory{
	
	      private static IFactory factory=null;
	      
	      private static final Map<EFactory,IFactory> m = new HashMap<EFactory,IFactory>(){
	    	  {put(EFactory.XML,new XMLFactory());
	    	  put(EFactory.DB,new DBFactory());
	      }};
	      
	      private DAOFactoryProvider() {}
	      
	      public static IFactory setType(EFactory e){	    	  
	      if(e.equals(EFactory.XML)){
	         factory=m.get(EFactory.XML);
	         
	      } else if(e.equals(EFactory.DB)){
	         factory=m.get(EFactory.DB);      
	      } 
	    	  return factory;
	      }

		@Override
		public String getName() {
			return factory.getName();
		}

		@Override
		public void setName(String n) {
			factory.setName(n);
		}

		@Override
		public int getAge() {
			return factory.getAge();
		}

		@Override
		public void setAge(int a) {
			factory.setAge(a);
		}

		@Override
		public String getCity() {
			return factory.getCity();
		}

		@Override
		public void setCity(String c) {
			factory.setCity(c);
		}

	

}