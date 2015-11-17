import java.io.*;
import java.util.Set;

import org.semanticweb.more.MOReReasoner;
import org.semanticweb.more.MOReReasonerFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class Main_Test {// 2015.9.17

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("hello MORe");

System.out.println("start....");
File ont_file=new File("D:/ontology/ICNP2011_v2011.owl");


 OWLOntologyManager	 m=OWLManager.createOWLOntologyManager();//创建本体管理器
 OWLOntology 	 ont =m.loadOntologyFromOntologyDocument(ont_file);//创建本体对象
 System.out.println(ont);
 Set <OWLEntity> signature=ont.getSignature();
 System.out.println("signature="+signature.size());

 
 //MOReReasoner more=new MOReReasoner(ont);
 //MOReReasoner more=new MOReReasoner(ont,1);
 MOReReasonerFactory factory = new MOReReasonerFactory();
 MOReReasoner more=(MOReReasoner) factory.createReasoner(ont);
// MOReReasoner more=new MOReReasoner(ont,true,true);
 //int non_EL_number=more.getCompModuleSize();
 //System.out.println("non_EL_number="+non_EL_number);
 
 //more.statisticsOriginalOntology(ont);
// more.processInputOntology();
//more.classifyClasses();

 int lsignature=more.getLsignature().size();// NullPointException
 System.out.println("lsignature==========="+lsignature);

 System.out.println("finished!");
 




	}

}
