package knowledgeAnalysis;

import java.io.*;
import java.util.Iterator;
import java.util.Vector;

import knowledge.AbstractElement;
import knowledge.AbstractKnowledge;
import knowledge.DEECoModel;
import knowledge.Ensemble;
import knowledge.KnowledgePackage;
import knowledge.Process;
import knowledge.xtext.KnowDEECoStandaloneSetup;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class LoadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KnowDEECoStandaloneSetup.doSetup();
		KnowledgePackage dmmp=KnowledgePackage.eINSTANCE;
		
		ResourceSet resourceSet=new ResourceSetImpl();
		URI fileURI= URI.createFileURI(new File("example.knowdeeco").getAbsolutePath());
		Resource resource=resourceSet.getResource(fileURI, true);
	
		EObject eobj = resource.getContents().get(0);
		DEECoModel dmodel = (DEECoModel) eobj;
		
//		EList<AbstractElement> elemlist = dmodel.getElements();
		Vector<AbstractKnowledge> knowlist = new Vector<AbstractKnowledge>();
		TreeIterator<EObject> elist = dmodel.eAllContents();
		
		while(elist.hasNext()) {
			EObject e=elist.next();
			if(e instanceof AbstractKnowledge){
				AbstractKnowledge AK=(AbstractKnowledge) e;
				knowlist.add(AK);
			}
		}
		
		
		Vector nodes=new Vector();
		Vector nodesValue=new Vector();
		Vector visitedNodes=new Vector();


		//first round on knowledge and set the values of the processors if found
		for (AbstractKnowledge abstractKnowledge : knowlist) {
			nodes.add(abstractKnowledge);
			nodesValue.add(0);
			AbstractElement writer = abstractKnowledge.getWriter();
		
			if(writer != null){
				if (writer instanceof Process){
					nodesValue.set(nodes.indexOf(abstractKnowledge), 2*writer.getPeriod());
					visitedNodes.add(abstractKnowledge.getName());
					System.out.println("writer  :  "+abstractKnowledge.getName() + "     "  +writer.getName()+ "   period:"+writer.getPeriod()+ "   saved:"+nodesValue.get(nodes.indexOf(abstractKnowledge)));
					
				}
				
			}
		}
		
		
		System.out.println("======================================================================================================================================================");
		//set the edges
		while(visitedNodes.size() != knowlist.size()){
				for (AbstractKnowledge abstractKnowledge : knowlist) {
					if(!visitedNodes.contains(abstractKnowledge)){
						
					AbstractElement writer = abstractKnowledge.getWriter();
					if(writer != null){
						if (writer instanceof Ensemble){
								int indexX=nodes.indexOf(abstractKnowledge);
								int valueWriter= 2 * writer.getPeriod();
								int max=-1;
								int maxPer=-1;

								int choosenValue;
								int choosenIndex;
								System.out.println("writer ensamble :  "+abstractKnowledge.getName() + "     "  +writer.getName()+ "   period:"+writer.getPeriod()+ "   saved:"+nodesValue.get(indexX));
								for (AbstractKnowledge previousKnowledge : knowlist) {
												EList<AbstractElement> readers = previousKnowledge.getReader();
											if(readers.contains(writer)){
												choosenIndex=knowlist.indexOf(previousKnowledge);
												choosenValue=(Integer) nodesValue.get(choosenIndex);
												///////////////////////////////////////////////////////////////////
												//if the node have children that are written by different processes
												///////////////////////////////////////////////////////////////////
												AbstractKnowledge ob;
												TreeIterator<EObject> content = previousKnowledge.eAllContents();
												while(content.hasNext() && previousKnowledge.getWriter().equals(dmodel.getElements().get(dmodel.getElements().size()-1))){
														ob=(AbstractKnowledge)content.next();
														if(maxPer < (Integer)nodesValue.get(knowlist.indexOf(ob)))
															maxPer=(Integer) nodesValue.get(knowlist.indexOf(ob));
														choosenValue=maxPer;
												}
												///////////////////////////////////////////////////////////////////
												///////////////////////////////////////////////////////////////////
																																		
												System.out.println("***                  reader  :  "+knowlist.get(choosenIndex) + "    know: "+ previousKnowledge + "   "+choosenValue);
												if( max < choosenValue)
													max=choosenValue;
											   }
								}
								
								int value= valueWriter + max ;
								nodesValue.set(indexX,value);
								System.out.println("                        ################    saved value = "+value);
								visitedNodes.add(abstractKnowledge.getName());
						}
					}
					}
				}
		}
		
		
	
		
		for (int i = 0; i < nodes.size(); i++) {
			System.out.println(nodes.get(i)+" : "+nodesValue.get(i));
		}
		
		for (int i = 0; i < visitedNodes.size(); i++) {
			System.out.print(visitedNodes.get(i) + "  _  ");
		}
		
	}
	
}
