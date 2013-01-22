package knowledge.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import knowledge.xtext.services.KnowDEECoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKnowDEECoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DEECoModel'", "'{'", "'elements'", "','", "'}'", "'knowledges'", "'-'", "'Ensemble'", "'period'", "'Process'", "'KnowledgeElement'", "'reader'", "'('", "')'", "'child'", "'Leaf'", "'type'", "'writer'"
    };
    public static final int RULE_ID=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalKnowDEECoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKnowDEECoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKnowDEECoParser.tokenNames; }
    public String getGrammarFileName() { return "../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g"; }



     	private KnowDEECoGrammarAccess grammarAccess;
     	
        public InternalKnowDEECoParser(TokenStream input, KnowDEECoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DEECoModel";	
       	}
       	
       	@Override
       	protected KnowDEECoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDEECoModel"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:67:1: entryRuleDEECoModel returns [EObject current=null] : iv_ruleDEECoModel= ruleDEECoModel EOF ;
    public final EObject entryRuleDEECoModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEECoModel = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:68:2: (iv_ruleDEECoModel= ruleDEECoModel EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:69:2: iv_ruleDEECoModel= ruleDEECoModel EOF
            {
             newCompositeNode(grammarAccess.getDEECoModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDEECoModel_in_entryRuleDEECoModel75);
            iv_ruleDEECoModel=ruleDEECoModel();

            state._fsp--;

             current =iv_ruleDEECoModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDEECoModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEECoModel"


    // $ANTLR start "ruleDEECoModel"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:76:1: ruleDEECoModel returns [EObject current=null] : ( () otherlv_1= 'DEECoModel' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleDEECoModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_knowledges_11_0 = null;

        EObject lv_knowledges_13_0 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:79:28: ( ( () otherlv_1= 'DEECoModel' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:80:1: ( () otherlv_1= 'DEECoModel' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:80:1: ( () otherlv_1= 'DEECoModel' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:80:2: () otherlv_1= 'DEECoModel' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:80:2: ()
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDEECoModelAccess().getDEECoModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDEECoModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getDEECoModelAccess().getDEECoModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDEECoModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:94:1: (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:94:3: otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDEECoModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getDEECoModelAccess().getElementsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDEECoModel168); 

                        	newLeafNode(otherlv_4, grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:102:1: ( (lv_elements_5_0= ruleAbstractElement ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:103:1: (lv_elements_5_0= ruleAbstractElement )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:103:1: (lv_elements_5_0= ruleAbstractElement )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:104:3: lv_elements_5_0= ruleAbstractElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDEECoModelAccess().getElementsAbstractElementParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractElement_in_ruleDEECoModel189);
                    lv_elements_5_0=ruleAbstractElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDEECoModelRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_5_0, 
                            		"AbstractElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:120:2: (otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:120:4: otherlv_6= ',' ( (lv_elements_7_0= ruleAbstractElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDEECoModel202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDEECoModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:124:1: ( (lv_elements_7_0= ruleAbstractElement ) )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:125:1: (lv_elements_7_0= ruleAbstractElement )
                    	    {
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:125:1: (lv_elements_7_0= ruleAbstractElement )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:126:3: lv_elements_7_0= ruleAbstractElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDEECoModelAccess().getElementsAbstractElementParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractElement_in_ruleDEECoModel223);
                    	    lv_elements_7_0=ruleAbstractElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDEECoModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_7_0, 
                    	            		"AbstractElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDEECoModel237); 

                        	newLeafNode(otherlv_8, grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:146:3: (otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:146:5: otherlv_9= 'knowledges' otherlv_10= '{' ( (lv_knowledges_11_0= ruleAbstractKnowledge ) ) (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDEECoModel252); 

                        	newLeafNode(otherlv_9, grammarAccess.getDEECoModelAccess().getKnowledgesKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDEECoModel264); 

                        	newLeafNode(otherlv_10, grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:154:1: ( (lv_knowledges_11_0= ruleAbstractKnowledge ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:155:1: (lv_knowledges_11_0= ruleAbstractKnowledge )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:155:1: (lv_knowledges_11_0= ruleAbstractKnowledge )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:156:3: lv_knowledges_11_0= ruleAbstractKnowledge
                    {
                     
                    	        newCompositeNode(grammarAccess.getDEECoModelAccess().getKnowledgesAbstractKnowledgeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractKnowledge_in_ruleDEECoModel285);
                    lv_knowledges_11_0=ruleAbstractKnowledge();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDEECoModelRule());
                    	        }
                           		add(
                           			current, 
                           			"knowledges",
                            		lv_knowledges_11_0, 
                            		"AbstractKnowledge");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:172:2: (otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:172:4: otherlv_12= ',' ( (lv_knowledges_13_0= ruleAbstractKnowledge ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDEECoModel298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getDEECoModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:176:1: ( (lv_knowledges_13_0= ruleAbstractKnowledge ) )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:177:1: (lv_knowledges_13_0= ruleAbstractKnowledge )
                    	    {
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:177:1: (lv_knowledges_13_0= ruleAbstractKnowledge )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:178:3: lv_knowledges_13_0= ruleAbstractKnowledge
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDEECoModelAccess().getKnowledgesAbstractKnowledgeParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractKnowledge_in_ruleDEECoModel319);
                    	    lv_knowledges_13_0=ruleAbstractKnowledge();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDEECoModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"knowledges",
                    	            		lv_knowledges_13_0, 
                    	            		"AbstractKnowledge");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDEECoModel333); 

                        	newLeafNode(otherlv_14, grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDEECoModel347); 

                	newLeafNode(otherlv_15, grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEECoModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:210:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:211:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:212:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement383);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractElement393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:219:1: ruleAbstractElement returns [EObject current=null] : (this_Ensemble_0= ruleEnsemble | this_Process_1= ruleProcess ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Ensemble_0 = null;

        EObject this_Process_1 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:222:28: ( (this_Ensemble_0= ruleEnsemble | this_Process_1= ruleProcess ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:223:1: (this_Ensemble_0= ruleEnsemble | this_Process_1= ruleProcess )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:223:1: (this_Ensemble_0= ruleEnsemble | this_Process_1= ruleProcess )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:224:5: this_Ensemble_0= ruleEnsemble
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getEnsembleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_ruleAbstractElement440);
                    this_Ensemble_0=ruleEnsemble();

                    state._fsp--;

                     
                            current = this_Ensemble_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:234:5: this_Process_1= ruleProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getProcessParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcess_in_ruleAbstractElement467);
                    this_Process_1=ruleProcess();

                    state._fsp--;

                     
                            current = this_Process_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleAbstractKnowledge"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:250:1: entryRuleAbstractKnowledge returns [EObject current=null] : iv_ruleAbstractKnowledge= ruleAbstractKnowledge EOF ;
    public final EObject entryRuleAbstractKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractKnowledge = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:251:2: (iv_ruleAbstractKnowledge= ruleAbstractKnowledge EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:252:2: iv_ruleAbstractKnowledge= ruleAbstractKnowledge EOF
            {
             newCompositeNode(grammarAccess.getAbstractKnowledgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractKnowledge_in_entryRuleAbstractKnowledge502);
            iv_ruleAbstractKnowledge=ruleAbstractKnowledge();

            state._fsp--;

             current =iv_ruleAbstractKnowledge; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractKnowledge512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractKnowledge"


    // $ANTLR start "ruleAbstractKnowledge"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:259:1: ruleAbstractKnowledge returns [EObject current=null] : (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf ) ;
    public final EObject ruleAbstractKnowledge() throws RecognitionException {
        EObject current = null;

        EObject this_KnowledgeElement_0 = null;

        EObject this_Leaf_1 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:262:28: ( (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:263:1: (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:263:1: (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:264:5: this_KnowledgeElement_0= ruleKnowledgeElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractKnowledgeAccess().getKnowledgeElementParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKnowledgeElement_in_ruleAbstractKnowledge559);
                    this_KnowledgeElement_0=ruleKnowledgeElement();

                    state._fsp--;

                     
                            current = this_KnowledgeElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:274:5: this_Leaf_1= ruleLeaf
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractKnowledgeAccess().getLeafParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeaf_in_ruleAbstractKnowledge586);
                    this_Leaf_1=ruleLeaf();

                    state._fsp--;

                     
                            current = this_Leaf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractKnowledge"


    // $ANTLR start "entryRuleKnowledgeNode"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:290:1: entryRuleKnowledgeNode returns [EObject current=null] : iv_ruleKnowledgeNode= ruleKnowledgeNode EOF ;
    public final EObject entryRuleKnowledgeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeNode = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:291:2: (iv_ruleKnowledgeNode= ruleKnowledgeNode EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:292:2: iv_ruleKnowledgeNode= ruleKnowledgeNode EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeNode_in_entryRuleKnowledgeNode621);
            iv_ruleKnowledgeNode=ruleKnowledgeNode();

            state._fsp--;

             current =iv_ruleKnowledgeNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKnowledgeNode631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeNode"


    // $ANTLR start "ruleKnowledgeNode"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:299:1: ruleKnowledgeNode returns [EObject current=null] : (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf ) ;
    public final EObject ruleKnowledgeNode() throws RecognitionException {
        EObject current = null;

        EObject this_KnowledgeElement_0 = null;

        EObject this_Leaf_1 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:302:28: ( (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:303:1: (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:303:1: (this_KnowledgeElement_0= ruleKnowledgeElement | this_Leaf_1= ruleLeaf )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:304:5: this_KnowledgeElement_0= ruleKnowledgeElement
                    {
                     
                            newCompositeNode(grammarAccess.getKnowledgeNodeAccess().getKnowledgeElementParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKnowledgeElement_in_ruleKnowledgeNode678);
                    this_KnowledgeElement_0=ruleKnowledgeElement();

                    state._fsp--;

                     
                            current = this_KnowledgeElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:314:5: this_Leaf_1= ruleLeaf
                    {
                     
                            newCompositeNode(grammarAccess.getKnowledgeNodeAccess().getLeafParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeaf_in_ruleKnowledgeNode705);
                    this_Leaf_1=ruleLeaf();

                    state._fsp--;

                     
                            current = this_Leaf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeNode"


    // $ANTLR start "entryRuleEString"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:330:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:331:2: (iv_ruleEString= ruleEString EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:332:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString741);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:339:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:342:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:343:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:343:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:343:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString792); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:351:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString818); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:366:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:367:2: (iv_ruleEInt= ruleEInt EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:368:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt864);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:375:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:378:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:379:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:379:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:379:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:379:2: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:380:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEInt914); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt931); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEnsemble"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:400:1: entryRuleEnsemble returns [EObject current=null] : iv_ruleEnsemble= ruleEnsemble EOF ;
    public final EObject entryRuleEnsemble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsemble = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:401:2: (iv_ruleEnsemble= ruleEnsemble EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:402:2: iv_ruleEnsemble= ruleEnsemble EOF
            {
             newCompositeNode(grammarAccess.getEnsembleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_entryRuleEnsemble976);
            iv_ruleEnsemble=ruleEnsemble();

            state._fsp--;

             current =iv_ruleEnsemble; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnsemble986); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsemble"


    // $ANTLR start "ruleEnsemble"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:409:1: ruleEnsemble returns [EObject current=null] : ( () otherlv_1= 'Ensemble' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEnsemble() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_period_5_0 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:412:28: ( ( () otherlv_1= 'Ensemble' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:413:1: ( () otherlv_1= 'Ensemble' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:413:1: ( () otherlv_1= 'Ensemble' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:413:2: () otherlv_1= 'Ensemble' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:413:2: ()
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:414:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnsembleAccess().getEnsembleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnsemble1032); 

                	newLeafNode(otherlv_1, grammarAccess.getEnsembleAccess().getEnsembleKeyword_1());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:423:1: ( (lv_name_2_0= ruleEString ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:424:1: (lv_name_2_0= ruleEString )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:424:1: (lv_name_2_0= ruleEString )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:425:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnsemble1053);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnsembleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnsemble1065); 

                	newLeafNode(otherlv_3, grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:445:1: (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:445:3: otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEnsemble1078); 

                        	newLeafNode(otherlv_4, grammarAccess.getEnsembleAccess().getPeriodKeyword_4_0());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:449:1: ( (lv_period_5_0= ruleEInt ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:450:1: (lv_period_5_0= ruleEInt )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:450:1: (lv_period_5_0= ruleEInt )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:451:3: lv_period_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnsembleAccess().getPeriodEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEnsemble1099);
                    lv_period_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnsembleRule());
                    	        }
                           		set(
                           			current, 
                           			"period",
                            		lv_period_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnsemble1113); 

                	newLeafNode(otherlv_6, grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsemble"


    // $ANTLR start "entryRuleProcess"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:479:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:480:2: (iv_ruleProcess= ruleProcess EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:481:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess1149);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess1159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:488:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_period_5_0 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:491:28: ( ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:492:1: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:492:1: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:492:2: () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:492:2: ()
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:493:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessAccess().getProcessAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProcess1205); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:502:1: ( (lv_name_2_0= ruleEString ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:503:1: (lv_name_2_0= ruleEString )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:503:1: (lv_name_2_0= ruleEString )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:504:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcess1226);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcess1238); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:524:1: (otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:524:3: otherlv_4= 'period' ( (lv_period_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcess1251); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getPeriodKeyword_4_0());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:528:1: ( (lv_period_5_0= ruleEInt ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:529:1: (lv_period_5_0= ruleEInt )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:529:1: (lv_period_5_0= ruleEInt )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:530:3: lv_period_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessAccess().getPeriodEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleProcess1272);
                    lv_period_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	        }
                           		set(
                           			current, 
                           			"period",
                            		lv_period_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcess1286); 

                	newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleKnowledgeElement"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:558:1: entryRuleKnowledgeElement returns [EObject current=null] : iv_ruleKnowledgeElement= ruleKnowledgeElement EOF ;
    public final EObject entryRuleKnowledgeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeElement = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:559:2: (iv_ruleKnowledgeElement= ruleKnowledgeElement EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:560:2: iv_ruleKnowledgeElement= ruleKnowledgeElement EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeElement_in_entryRuleKnowledgeElement1322);
            iv_ruleKnowledgeElement=ruleKnowledgeElement();

            state._fsp--;

             current =iv_ruleKnowledgeElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKnowledgeElement1332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeElement"


    // $ANTLR start "ruleKnowledgeElement"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:567:1: ruleKnowledgeElement returns [EObject current=null] : (otherlv_0= 'KnowledgeElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'child' otherlv_10= '{' ( (lv_child_11_0= ruleKnowledgeNode ) ) (otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleKnowledgeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_child_11_0 = null;

        EObject lv_child_13_0 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:570:28: ( (otherlv_0= 'KnowledgeElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'child' otherlv_10= '{' ( (lv_child_11_0= ruleKnowledgeNode ) ) (otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:571:1: (otherlv_0= 'KnowledgeElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'child' otherlv_10= '{' ( (lv_child_11_0= ruleKnowledgeNode ) ) (otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:571:1: (otherlv_0= 'KnowledgeElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'child' otherlv_10= '{' ( (lv_child_11_0= ruleKnowledgeNode ) ) (otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:571:3: otherlv_0= 'KnowledgeElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'child' otherlv_10= '{' ( (lv_child_11_0= ruleKnowledgeNode ) ) (otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKnowledgeElement1369); 

                	newLeafNode(otherlv_0, grammarAccess.getKnowledgeElementAccess().getKnowledgeElementKeyword_0());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:575:1: ( (lv_name_1_0= ruleEString ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:576:1: (lv_name_1_0= ruleEString )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:576:1: (lv_name_1_0= ruleEString )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:577:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKnowledgeElementAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKnowledgeElement1390);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKnowledgeElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKnowledgeElement1402); 

                	newLeafNode(otherlv_2, grammarAccess.getKnowledgeElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:597:1: (otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:597:3: otherlv_3= 'reader' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleKnowledgeElement1415); 

                        	newLeafNode(otherlv_3, grammarAccess.getKnowledgeElementAccess().getReaderKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleKnowledgeElement1427); 

                        	newLeafNode(otherlv_4, grammarAccess.getKnowledgeElementAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:605:1: ( ( ruleEString ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:606:1: ( ruleEString )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:606:1: ( ruleEString )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:607:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKnowledgeElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKnowledgeElement1450);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:620:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:620:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKnowledgeElement1463); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getKnowledgeElementAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:624:1: ( ( ruleEString ) )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:625:1: ( ruleEString )
                    	    {
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:625:1: ( ruleEString )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:626:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getKnowledgeElementRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKnowledgeElement1486);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleKnowledgeElement1500); 

                        	newLeafNode(otherlv_8, grammarAccess.getKnowledgeElementAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKnowledgeElement1514); 

                	newLeafNode(otherlv_9, grammarAccess.getKnowledgeElementAccess().getChildKeyword_4());
                
            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKnowledgeElement1526); 

                	newLeafNode(otherlv_10, grammarAccess.getKnowledgeElementAccess().getLeftCurlyBracketKeyword_5());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:651:1: ( (lv_child_11_0= ruleKnowledgeNode ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:652:1: (lv_child_11_0= ruleKnowledgeNode )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:652:1: (lv_child_11_0= ruleKnowledgeNode )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:653:3: lv_child_11_0= ruleKnowledgeNode
            {
             
            	        newCompositeNode(grammarAccess.getKnowledgeElementAccess().getChildKnowledgeNodeParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeNode_in_ruleKnowledgeElement1547);
            lv_child_11_0=ruleKnowledgeNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKnowledgeElementRule());
            	        }
                   		add(
                   			current, 
                   			"child",
                    		lv_child_11_0, 
                    		"KnowledgeNode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:669:2: (otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:669:4: otherlv_12= ',' ( (lv_child_13_0= ruleKnowledgeNode ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKnowledgeElement1560); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKnowledgeElementAccess().getCommaKeyword_7_0());
            	        
            	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:673:1: ( (lv_child_13_0= ruleKnowledgeNode ) )
            	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:674:1: (lv_child_13_0= ruleKnowledgeNode )
            	    {
            	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:674:1: (lv_child_13_0= ruleKnowledgeNode )
            	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:675:3: lv_child_13_0= ruleKnowledgeNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKnowledgeElementAccess().getChildKnowledgeNodeParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKnowledgeNode_in_ruleKnowledgeElement1581);
            	    lv_child_13_0=ruleKnowledgeNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKnowledgeElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"child",
            	            		lv_child_13_0, 
            	            		"KnowledgeNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKnowledgeElement1595); 

                	newLeafNode(otherlv_14, grammarAccess.getKnowledgeElementAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKnowledgeElement1607); 

                	newLeafNode(otherlv_15, grammarAccess.getKnowledgeElementAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeElement"


    // $ANTLR start "entryRuleLeaf"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:707:1: entryRuleLeaf returns [EObject current=null] : iv_ruleLeaf= ruleLeaf EOF ;
    public final EObject entryRuleLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaf = null;


        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:708:2: (iv_ruleLeaf= ruleLeaf EOF )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:709:2: iv_ruleLeaf= ruleLeaf EOF
            {
             newCompositeNode(grammarAccess.getLeafRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeaf_in_entryRuleLeaf1643);
            iv_ruleLeaf=ruleLeaf();

            state._fsp--;

             current =iv_ruleLeaf; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeaf1653); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeaf"


    // $ANTLR start "ruleLeaf"
    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:716:1: ruleLeaf returns [EObject current=null] : ( () otherlv_1= 'Leaf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'writer' ( ( ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleLeaf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:719:28: ( ( () otherlv_1= 'Leaf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'writer' ( ( ruleEString ) ) )? otherlv_14= '}' ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:720:1: ( () otherlv_1= 'Leaf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'writer' ( ( ruleEString ) ) )? otherlv_14= '}' )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:720:1: ( () otherlv_1= 'Leaf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'writer' ( ( ruleEString ) ) )? otherlv_14= '}' )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:720:2: () otherlv_1= 'Leaf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'writer' ( ( ruleEString ) ) )? otherlv_14= '}'
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:720:2: ()
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:721:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLeafAccess().getLeafAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLeaf1699); 

                	newLeafNode(otherlv_1, grammarAccess.getLeafAccess().getLeafKeyword_1());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:730:1: ( (lv_name_2_0= ruleEString ) )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:731:1: (lv_name_2_0= ruleEString )
            {
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:731:1: (lv_name_2_0= ruleEString )
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:732:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLeafAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLeaf1720);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeafRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLeaf1732); 

                	newLeafNode(otherlv_3, grammarAccess.getLeafAccess().getLeftCurlyBracketKeyword_3());
                
            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:752:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:752:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLeaf1745); 

                        	newLeafNode(otherlv_4, grammarAccess.getLeafAccess().getTypeKeyword_4_0());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:756:1: ( (lv_type_5_0= ruleEString ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:757:1: (lv_type_5_0= ruleEString )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:757:1: (lv_type_5_0= ruleEString )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:758:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLeafAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLeaf1766);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLeafRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:774:4: (otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:774:6: otherlv_6= 'reader' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLeaf1781); 

                        	newLeafNode(otherlv_6, grammarAccess.getLeafAccess().getReaderKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLeaf1793); 

                        	newLeafNode(otherlv_7, grammarAccess.getLeafAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:782:1: ( ( ruleEString ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:783:1: ( ruleEString )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:783:1: ( ruleEString )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:784:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeafRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLeafAccess().getReaderAbstractElementCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLeaf1816);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:797:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:797:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLeaf1829); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getLeafAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:801:1: ( ( ruleEString ) )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:802:1: ( ruleEString )
                    	    {
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:802:1: ( ruleEString )
                    	    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:803:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLeafRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLeafAccess().getReaderAbstractElementCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLeaf1852);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLeaf1866); 

                        	newLeafNode(otherlv_11, grammarAccess.getLeafAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:820:3: (otherlv_12= 'writer' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:820:5: otherlv_12= 'writer' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLeaf1881); 

                        	newLeafNode(otherlv_12, grammarAccess.getLeafAccess().getWriterKeyword_6_0());
                        
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:824:1: ( ( ruleEString ) )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:825:1: ( ruleEString )
                    {
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:825:1: ( ruleEString )
                    // ../knowledge.xtext/src-gen/knowledge/xtext/parser/antlr/internal/InternalKnowDEECo.g:826:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeafRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLeafAccess().getWriterAbstractElementCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLeaf1904);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLeaf1918); 

                	newLeafNode(otherlv_14, grammarAccess.getLeafAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeaf"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDEECoModel_in_entryRuleDEECoModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDEECoModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDEECoModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDEECoModel143 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleDEECoModel156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDEECoModel168 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDEECoModel189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleDEECoModel202 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDEECoModel223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleDEECoModel237 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDEECoModel252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDEECoModel264 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_ruleAbstractKnowledge_in_ruleDEECoModel285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleDEECoModel298 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_ruleAbstractKnowledge_in_ruleDEECoModel319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleDEECoModel333 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDEECoModel347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_ruleAbstractElement440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_ruleAbstractElement467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractKnowledge_in_entryRuleAbstractKnowledge502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractKnowledge512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeElement_in_ruleAbstractKnowledge559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaf_in_ruleAbstractKnowledge586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeNode_in_entryRuleKnowledgeNode621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKnowledgeNode631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeElement_in_ruleKnowledgeNode678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaf_in_ruleKnowledgeNode705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEInt914 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEnsemble1032 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnsemble1053 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnsemble1065 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleEnsemble1078 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEnsemble1099 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEnsemble1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1149 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess1159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleProcess1205 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcess1226 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcess1238 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleProcess1251 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleProcess1272 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProcess1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeElement_in_entryRuleKnowledgeElement1322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKnowledgeElement1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleKnowledgeElement1369 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKnowledgeElement1390 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKnowledgeElement1402 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleKnowledgeElement1415 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleKnowledgeElement1427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKnowledgeElement1450 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleKnowledgeElement1463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKnowledgeElement1486 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleKnowledgeElement1500 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleKnowledgeElement1514 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKnowledgeElement1526 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_ruleKnowledgeNode_in_ruleKnowledgeElement1547 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleKnowledgeElement1560 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_ruleKnowledgeNode_in_ruleKnowledgeElement1581 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleKnowledgeElement1595 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleKnowledgeElement1607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaf_in_entryRuleLeaf1643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeaf1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleLeaf1699 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLeaf1720 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLeaf1732 = new BitSet(new long[]{0x0000000018408000L});
        public static final BitSet FOLLOW_27_in_ruleLeaf1745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLeaf1766 = new BitSet(new long[]{0x0000000010408000L});
        public static final BitSet FOLLOW_22_in_ruleLeaf1781 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLeaf1793 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLeaf1816 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleLeaf1829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLeaf1852 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleLeaf1866 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleLeaf1881 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLeaf1904 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLeaf1918 = new BitSet(new long[]{0x0000000000000002L});
    }


}