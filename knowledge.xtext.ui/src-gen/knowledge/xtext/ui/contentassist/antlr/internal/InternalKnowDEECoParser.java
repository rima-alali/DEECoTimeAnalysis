package knowledge.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import knowledge.xtext.services.KnowDEECoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKnowDEECoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DEECoModel'", "'{'", "'}'", "'elements'", "','", "'knowledges'", "'-'", "'Ensemble'", "'period'", "'Process'", "'KnowledgeElement'", "'child'", "'reader'", "'('", "')'", "'Leaf'", "'type'", "'writer'"
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
    public String getGrammarFileName() { return "../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g"; }


     
     	private KnowDEECoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KnowDEECoGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDEECoModel"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:60:1: entryRuleDEECoModel : ruleDEECoModel EOF ;
    public final void entryRuleDEECoModel() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:61:1: ( ruleDEECoModel EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:62:1: ruleDEECoModel EOF
            {
             before(grammarAccess.getDEECoModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDEECoModel_in_entryRuleDEECoModel61);
            ruleDEECoModel();

            state._fsp--;

             after(grammarAccess.getDEECoModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDEECoModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDEECoModel"


    // $ANTLR start "ruleDEECoModel"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:69:1: ruleDEECoModel : ( ( rule__DEECoModel__Group__0 ) ) ;
    public final void ruleDEECoModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:73:2: ( ( ( rule__DEECoModel__Group__0 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:74:1: ( ( rule__DEECoModel__Group__0 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:74:1: ( ( rule__DEECoModel__Group__0 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:75:1: ( rule__DEECoModel__Group__0 )
            {
             before(grammarAccess.getDEECoModelAccess().getGroup()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:76:1: ( rule__DEECoModel__Group__0 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:76:2: rule__DEECoModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__0_in_ruleDEECoModel94);
            rule__DEECoModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDEECoModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDEECoModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:89:1: ( ruleAbstractElement EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement121);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement154);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleAbstractKnowledge"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:116:1: entryRuleAbstractKnowledge : ruleAbstractKnowledge EOF ;
    public final void entryRuleAbstractKnowledge() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:117:1: ( ruleAbstractKnowledge EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:118:1: ruleAbstractKnowledge EOF
            {
             before(grammarAccess.getAbstractKnowledgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractKnowledge_in_entryRuleAbstractKnowledge181);
            ruleAbstractKnowledge();

            state._fsp--;

             after(grammarAccess.getAbstractKnowledgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractKnowledge188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractKnowledge"


    // $ANTLR start "ruleAbstractKnowledge"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:125:1: ruleAbstractKnowledge : ( ( rule__AbstractKnowledge__Alternatives ) ) ;
    public final void ruleAbstractKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:129:2: ( ( ( rule__AbstractKnowledge__Alternatives ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:130:1: ( ( rule__AbstractKnowledge__Alternatives ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:130:1: ( ( rule__AbstractKnowledge__Alternatives ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:131:1: ( rule__AbstractKnowledge__Alternatives )
            {
             before(grammarAccess.getAbstractKnowledgeAccess().getAlternatives()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:132:1: ( rule__AbstractKnowledge__Alternatives )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:132:2: rule__AbstractKnowledge__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractKnowledge__Alternatives_in_ruleAbstractKnowledge214);
            rule__AbstractKnowledge__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractKnowledgeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractKnowledge"


    // $ANTLR start "entryRuleKnowledgeNode"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:144:1: entryRuleKnowledgeNode : ruleKnowledgeNode EOF ;
    public final void entryRuleKnowledgeNode() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:145:1: ( ruleKnowledgeNode EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:146:1: ruleKnowledgeNode EOF
            {
             before(grammarAccess.getKnowledgeNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeNode_in_entryRuleKnowledgeNode241);
            ruleKnowledgeNode();

            state._fsp--;

             after(grammarAccess.getKnowledgeNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKnowledgeNode248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKnowledgeNode"


    // $ANTLR start "ruleKnowledgeNode"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:153:1: ruleKnowledgeNode : ( ( rule__KnowledgeNode__Alternatives ) ) ;
    public final void ruleKnowledgeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:157:2: ( ( ( rule__KnowledgeNode__Alternatives ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:158:1: ( ( rule__KnowledgeNode__Alternatives ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:158:1: ( ( rule__KnowledgeNode__Alternatives ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:159:1: ( rule__KnowledgeNode__Alternatives )
            {
             before(grammarAccess.getKnowledgeNodeAccess().getAlternatives()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:160:1: ( rule__KnowledgeNode__Alternatives )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:160:2: rule__KnowledgeNode__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeNode__Alternatives_in_ruleKnowledgeNode274);
            rule__KnowledgeNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKnowledgeNode"


    // $ANTLR start "entryRuleEString"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:173:1: ( ruleEString EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:188:1: ( rule__EString__Alternatives )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:200:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:201:1: ( ruleEInt EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:202:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt361);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:209:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:213:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:214:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:214:1: ( ( rule__EInt__Group__0 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:215:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:216:1: ( rule__EInt__Group__0 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:216:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt394);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEnsemble"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:228:1: entryRuleEnsemble : ruleEnsemble EOF ;
    public final void entryRuleEnsemble() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:229:1: ( ruleEnsemble EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:230:1: ruleEnsemble EOF
            {
             before(grammarAccess.getEnsembleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_entryRuleEnsemble421);
            ruleEnsemble();

            state._fsp--;

             after(grammarAccess.getEnsembleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnsemble428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnsemble"


    // $ANTLR start "ruleEnsemble"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:237:1: ruleEnsemble : ( ( rule__Ensemble__Group__0 ) ) ;
    public final void ruleEnsemble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:241:2: ( ( ( rule__Ensemble__Group__0 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:242:1: ( ( rule__Ensemble__Group__0 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:242:1: ( ( rule__Ensemble__Group__0 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:243:1: ( rule__Ensemble__Group__0 )
            {
             before(grammarAccess.getEnsembleAccess().getGroup()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:244:1: ( rule__Ensemble__Group__0 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:244:2: rule__Ensemble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__0_in_ruleEnsemble454);
            rule__Ensemble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnsemble"


    // $ANTLR start "entryRuleProcess"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:256:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:257:1: ( ruleProcess EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:258:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess481);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:265:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:269:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:270:1: ( ( rule__Process__Group__0 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:270:1: ( ( rule__Process__Group__0 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:271:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:272:1: ( rule__Process__Group__0 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:272:2: rule__Process__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__0_in_ruleProcess514);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleKnowledgeElement"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:284:1: entryRuleKnowledgeElement : ruleKnowledgeElement EOF ;
    public final void entryRuleKnowledgeElement() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:285:1: ( ruleKnowledgeElement EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:286:1: ruleKnowledgeElement EOF
            {
             before(grammarAccess.getKnowledgeElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeElement_in_entryRuleKnowledgeElement541);
            ruleKnowledgeElement();

            state._fsp--;

             after(grammarAccess.getKnowledgeElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKnowledgeElement548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKnowledgeElement"


    // $ANTLR start "ruleKnowledgeElement"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:293:1: ruleKnowledgeElement : ( ( rule__KnowledgeElement__Group__0 ) ) ;
    public final void ruleKnowledgeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:297:2: ( ( ( rule__KnowledgeElement__Group__0 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:298:1: ( ( rule__KnowledgeElement__Group__0 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:298:1: ( ( rule__KnowledgeElement__Group__0 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:299:1: ( rule__KnowledgeElement__Group__0 )
            {
             before(grammarAccess.getKnowledgeElementAccess().getGroup()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:300:1: ( rule__KnowledgeElement__Group__0 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:300:2: rule__KnowledgeElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__0_in_ruleKnowledgeElement574);
            rule__KnowledgeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKnowledgeElement"


    // $ANTLR start "entryRuleLeaf"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:312:1: entryRuleLeaf : ruleLeaf EOF ;
    public final void entryRuleLeaf() throws RecognitionException {
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:313:1: ( ruleLeaf EOF )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:314:1: ruleLeaf EOF
            {
             before(grammarAccess.getLeafRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeaf_in_entryRuleLeaf601);
            ruleLeaf();

            state._fsp--;

             after(grammarAccess.getLeafRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeaf608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeaf"


    // $ANTLR start "ruleLeaf"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:321:1: ruleLeaf : ( ( rule__Leaf__Group__0 ) ) ;
    public final void ruleLeaf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:325:2: ( ( ( rule__Leaf__Group__0 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:326:1: ( ( rule__Leaf__Group__0 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:326:1: ( ( rule__Leaf__Group__0 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:327:1: ( rule__Leaf__Group__0 )
            {
             before(grammarAccess.getLeafAccess().getGroup()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:328:1: ( rule__Leaf__Group__0 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:328:2: rule__Leaf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__0_in_ruleLeaf634);
            rule__Leaf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeaf"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:340:1: rule__AbstractElement__Alternatives : ( ( ruleEnsemble ) | ( ruleProcess ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:344:1: ( ( ruleEnsemble ) | ( ruleProcess ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:345:1: ( ruleEnsemble )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:345:1: ( ruleEnsemble )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:346:1: ruleEnsemble
                    {
                     before(grammarAccess.getAbstractElementAccess().getEnsembleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_rule__AbstractElement__Alternatives670);
                    ruleEnsemble();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getEnsembleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:351:6: ( ruleProcess )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:351:6: ( ruleProcess )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:352:1: ruleProcess
                    {
                     before(grammarAccess.getAbstractElementAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProcess_in_rule__AbstractElement__Alternatives687);
                    ruleProcess();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getProcessParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__AbstractKnowledge__Alternatives"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:362:1: rule__AbstractKnowledge__Alternatives : ( ( ruleKnowledgeElement ) | ( ruleLeaf ) );
    public final void rule__AbstractKnowledge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:366:1: ( ( ruleKnowledgeElement ) | ( ruleLeaf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:367:1: ( ruleKnowledgeElement )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:367:1: ( ruleKnowledgeElement )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:368:1: ruleKnowledgeElement
                    {
                     before(grammarAccess.getAbstractKnowledgeAccess().getKnowledgeElementParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKnowledgeElement_in_rule__AbstractKnowledge__Alternatives719);
                    ruleKnowledgeElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractKnowledgeAccess().getKnowledgeElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:373:6: ( ruleLeaf )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:373:6: ( ruleLeaf )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:374:1: ruleLeaf
                    {
                     before(grammarAccess.getAbstractKnowledgeAccess().getLeafParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeaf_in_rule__AbstractKnowledge__Alternatives736);
                    ruleLeaf();

                    state._fsp--;

                     after(grammarAccess.getAbstractKnowledgeAccess().getLeafParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractKnowledge__Alternatives"


    // $ANTLR start "rule__KnowledgeNode__Alternatives"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:384:1: rule__KnowledgeNode__Alternatives : ( ( ruleKnowledgeElement ) | ( ruleLeaf ) );
    public final void rule__KnowledgeNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:388:1: ( ( ruleKnowledgeElement ) | ( ruleLeaf ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:389:1: ( ruleKnowledgeElement )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:389:1: ( ruleKnowledgeElement )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:390:1: ruleKnowledgeElement
                    {
                     before(grammarAccess.getKnowledgeNodeAccess().getKnowledgeElementParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKnowledgeElement_in_rule__KnowledgeNode__Alternatives768);
                    ruleKnowledgeElement();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeNodeAccess().getKnowledgeElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:395:6: ( ruleLeaf )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:395:6: ( ruleLeaf )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:396:1: ruleLeaf
                    {
                     before(grammarAccess.getKnowledgeNodeAccess().getLeafParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeaf_in_rule__KnowledgeNode__Alternatives785);
                    ruleLeaf();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeNodeAccess().getLeafParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeNode__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:406:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:410:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:411:1: ( RULE_STRING )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:411:1: ( RULE_STRING )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:412:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives817); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:417:6: ( RULE_ID )
                    {
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:417:6: ( RULE_ID )
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:418:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives834); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DEECoModel__Group__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:430:1: rule__DEECoModel__Group__0 : rule__DEECoModel__Group__0__Impl rule__DEECoModel__Group__1 ;
    public final void rule__DEECoModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:434:1: ( rule__DEECoModel__Group__0__Impl rule__DEECoModel__Group__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:435:2: rule__DEECoModel__Group__0__Impl rule__DEECoModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__0__Impl_in_rule__DEECoModel__Group__0864);
            rule__DEECoModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__1_in_rule__DEECoModel__Group__0867);
            rule__DEECoModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__0"


    // $ANTLR start "rule__DEECoModel__Group__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:442:1: rule__DEECoModel__Group__0__Impl : ( () ) ;
    public final void rule__DEECoModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:446:1: ( ( () ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:447:1: ( () )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:447:1: ( () )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:448:1: ()
            {
             before(grammarAccess.getDEECoModelAccess().getDEECoModelAction_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:449:1: ()
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:451:1: 
            {
            }

             after(grammarAccess.getDEECoModelAccess().getDEECoModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__0__Impl"


    // $ANTLR start "rule__DEECoModel__Group__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:461:1: rule__DEECoModel__Group__1 : rule__DEECoModel__Group__1__Impl rule__DEECoModel__Group__2 ;
    public final void rule__DEECoModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:465:1: ( rule__DEECoModel__Group__1__Impl rule__DEECoModel__Group__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:466:2: rule__DEECoModel__Group__1__Impl rule__DEECoModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__1__Impl_in_rule__DEECoModel__Group__1925);
            rule__DEECoModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__2_in_rule__DEECoModel__Group__1928);
            rule__DEECoModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__1"


    // $ANTLR start "rule__DEECoModel__Group__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:473:1: rule__DEECoModel__Group__1__Impl : ( 'DEECoModel' ) ;
    public final void rule__DEECoModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:477:1: ( ( 'DEECoModel' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:478:1: ( 'DEECoModel' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:478:1: ( 'DEECoModel' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:479:1: 'DEECoModel'
            {
             before(grammarAccess.getDEECoModelAccess().getDEECoModelKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__DEECoModel__Group__1__Impl956); 
             after(grammarAccess.getDEECoModelAccess().getDEECoModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__1__Impl"


    // $ANTLR start "rule__DEECoModel__Group__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:492:1: rule__DEECoModel__Group__2 : rule__DEECoModel__Group__2__Impl rule__DEECoModel__Group__3 ;
    public final void rule__DEECoModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:496:1: ( rule__DEECoModel__Group__2__Impl rule__DEECoModel__Group__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:497:2: rule__DEECoModel__Group__2__Impl rule__DEECoModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__2__Impl_in_rule__DEECoModel__Group__2987);
            rule__DEECoModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__3_in_rule__DEECoModel__Group__2990);
            rule__DEECoModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__2"


    // $ANTLR start "rule__DEECoModel__Group__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:504:1: rule__DEECoModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DEECoModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:508:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:509:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:509:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:510:1: '{'
            {
             before(grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__DEECoModel__Group__2__Impl1018); 
             after(grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__2__Impl"


    // $ANTLR start "rule__DEECoModel__Group__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:523:1: rule__DEECoModel__Group__3 : rule__DEECoModel__Group__3__Impl rule__DEECoModel__Group__4 ;
    public final void rule__DEECoModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:527:1: ( rule__DEECoModel__Group__3__Impl rule__DEECoModel__Group__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:528:2: rule__DEECoModel__Group__3__Impl rule__DEECoModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__3__Impl_in_rule__DEECoModel__Group__31049);
            rule__DEECoModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__4_in_rule__DEECoModel__Group__31052);
            rule__DEECoModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__3"


    // $ANTLR start "rule__DEECoModel__Group__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:535:1: rule__DEECoModel__Group__3__Impl : ( ( rule__DEECoModel__Group_3__0 )? ) ;
    public final void rule__DEECoModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:539:1: ( ( ( rule__DEECoModel__Group_3__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:540:1: ( ( rule__DEECoModel__Group_3__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:540:1: ( ( rule__DEECoModel__Group_3__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:541:1: ( rule__DEECoModel__Group_3__0 )?
            {
             before(grammarAccess.getDEECoModelAccess().getGroup_3()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:542:1: ( rule__DEECoModel__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:542:2: rule__DEECoModel__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__0_in_rule__DEECoModel__Group__3__Impl1079);
                    rule__DEECoModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDEECoModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__3__Impl"


    // $ANTLR start "rule__DEECoModel__Group__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:552:1: rule__DEECoModel__Group__4 : rule__DEECoModel__Group__4__Impl rule__DEECoModel__Group__5 ;
    public final void rule__DEECoModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:556:1: ( rule__DEECoModel__Group__4__Impl rule__DEECoModel__Group__5 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:557:2: rule__DEECoModel__Group__4__Impl rule__DEECoModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__4__Impl_in_rule__DEECoModel__Group__41110);
            rule__DEECoModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__5_in_rule__DEECoModel__Group__41113);
            rule__DEECoModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__4"


    // $ANTLR start "rule__DEECoModel__Group__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:564:1: rule__DEECoModel__Group__4__Impl : ( ( rule__DEECoModel__Group_4__0 )? ) ;
    public final void rule__DEECoModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:568:1: ( ( ( rule__DEECoModel__Group_4__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:569:1: ( ( rule__DEECoModel__Group_4__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:569:1: ( ( rule__DEECoModel__Group_4__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:570:1: ( rule__DEECoModel__Group_4__0 )?
            {
             before(grammarAccess.getDEECoModelAccess().getGroup_4()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:571:1: ( rule__DEECoModel__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:571:2: rule__DEECoModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__0_in_rule__DEECoModel__Group__4__Impl1140);
                    rule__DEECoModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDEECoModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__4__Impl"


    // $ANTLR start "rule__DEECoModel__Group__5"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:581:1: rule__DEECoModel__Group__5 : rule__DEECoModel__Group__5__Impl ;
    public final void rule__DEECoModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:585:1: ( rule__DEECoModel__Group__5__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:586:2: rule__DEECoModel__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group__5__Impl_in_rule__DEECoModel__Group__51171);
            rule__DEECoModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__5"


    // $ANTLR start "rule__DEECoModel__Group__5__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:592:1: rule__DEECoModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DEECoModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:596:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:597:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:597:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:598:1: '}'
            {
             before(grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__DEECoModel__Group__5__Impl1199); 
             after(grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group__5__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:623:1: rule__DEECoModel__Group_3__0 : rule__DEECoModel__Group_3__0__Impl rule__DEECoModel__Group_3__1 ;
    public final void rule__DEECoModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:627:1: ( rule__DEECoModel__Group_3__0__Impl rule__DEECoModel__Group_3__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:628:2: rule__DEECoModel__Group_3__0__Impl rule__DEECoModel__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__0__Impl_in_rule__DEECoModel__Group_3__01242);
            rule__DEECoModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__1_in_rule__DEECoModel__Group_3__01245);
            rule__DEECoModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__0"


    // $ANTLR start "rule__DEECoModel__Group_3__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:635:1: rule__DEECoModel__Group_3__0__Impl : ( 'elements' ) ;
    public final void rule__DEECoModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:639:1: ( ( 'elements' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:640:1: ( 'elements' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:640:1: ( 'elements' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:641:1: 'elements'
            {
             before(grammarAccess.getDEECoModelAccess().getElementsKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__DEECoModel__Group_3__0__Impl1273); 
             after(grammarAccess.getDEECoModelAccess().getElementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__0__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:654:1: rule__DEECoModel__Group_3__1 : rule__DEECoModel__Group_3__1__Impl rule__DEECoModel__Group_3__2 ;
    public final void rule__DEECoModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:658:1: ( rule__DEECoModel__Group_3__1__Impl rule__DEECoModel__Group_3__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:659:2: rule__DEECoModel__Group_3__1__Impl rule__DEECoModel__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__1__Impl_in_rule__DEECoModel__Group_3__11304);
            rule__DEECoModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__2_in_rule__DEECoModel__Group_3__11307);
            rule__DEECoModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__1"


    // $ANTLR start "rule__DEECoModel__Group_3__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:666:1: rule__DEECoModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__DEECoModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:670:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:671:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:671:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:672:1: '{'
            {
             before(grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__DEECoModel__Group_3__1__Impl1335); 
             after(grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__1__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:685:1: rule__DEECoModel__Group_3__2 : rule__DEECoModel__Group_3__2__Impl rule__DEECoModel__Group_3__3 ;
    public final void rule__DEECoModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:689:1: ( rule__DEECoModel__Group_3__2__Impl rule__DEECoModel__Group_3__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:690:2: rule__DEECoModel__Group_3__2__Impl rule__DEECoModel__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__2__Impl_in_rule__DEECoModel__Group_3__21366);
            rule__DEECoModel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__3_in_rule__DEECoModel__Group_3__21369);
            rule__DEECoModel__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__2"


    // $ANTLR start "rule__DEECoModel__Group_3__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:697:1: rule__DEECoModel__Group_3__2__Impl : ( ( rule__DEECoModel__ElementsAssignment_3_2 ) ) ;
    public final void rule__DEECoModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:701:1: ( ( ( rule__DEECoModel__ElementsAssignment_3_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:702:1: ( ( rule__DEECoModel__ElementsAssignment_3_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:702:1: ( ( rule__DEECoModel__ElementsAssignment_3_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:703:1: ( rule__DEECoModel__ElementsAssignment_3_2 )
            {
             before(grammarAccess.getDEECoModelAccess().getElementsAssignment_3_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:704:1: ( rule__DEECoModel__ElementsAssignment_3_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:704:2: rule__DEECoModel__ElementsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__ElementsAssignment_3_2_in_rule__DEECoModel__Group_3__2__Impl1396);
            rule__DEECoModel__ElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDEECoModelAccess().getElementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__2__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:714:1: rule__DEECoModel__Group_3__3 : rule__DEECoModel__Group_3__3__Impl rule__DEECoModel__Group_3__4 ;
    public final void rule__DEECoModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:718:1: ( rule__DEECoModel__Group_3__3__Impl rule__DEECoModel__Group_3__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:719:2: rule__DEECoModel__Group_3__3__Impl rule__DEECoModel__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__3__Impl_in_rule__DEECoModel__Group_3__31426);
            rule__DEECoModel__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__4_in_rule__DEECoModel__Group_3__31429);
            rule__DEECoModel__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__3"


    // $ANTLR start "rule__DEECoModel__Group_3__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:726:1: rule__DEECoModel__Group_3__3__Impl : ( ( rule__DEECoModel__Group_3_3__0 )* ) ;
    public final void rule__DEECoModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:730:1: ( ( ( rule__DEECoModel__Group_3_3__0 )* ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:731:1: ( ( rule__DEECoModel__Group_3_3__0 )* )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:731:1: ( ( rule__DEECoModel__Group_3_3__0 )* )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:732:1: ( rule__DEECoModel__Group_3_3__0 )*
            {
             before(grammarAccess.getDEECoModelAccess().getGroup_3_3()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:733:1: ( rule__DEECoModel__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:733:2: rule__DEECoModel__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3_3__0_in_rule__DEECoModel__Group_3__3__Impl1456);
            	    rule__DEECoModel__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDEECoModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__3__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:743:1: rule__DEECoModel__Group_3__4 : rule__DEECoModel__Group_3__4__Impl ;
    public final void rule__DEECoModel__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:747:1: ( rule__DEECoModel__Group_3__4__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:748:2: rule__DEECoModel__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3__4__Impl_in_rule__DEECoModel__Group_3__41487);
            rule__DEECoModel__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__4"


    // $ANTLR start "rule__DEECoModel__Group_3__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:754:1: rule__DEECoModel__Group_3__4__Impl : ( '}' ) ;
    public final void rule__DEECoModel__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:758:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:759:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:759:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:760:1: '}'
            {
             before(grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__DEECoModel__Group_3__4__Impl1515); 
             after(grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3__4__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3_3__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:783:1: rule__DEECoModel__Group_3_3__0 : rule__DEECoModel__Group_3_3__0__Impl rule__DEECoModel__Group_3_3__1 ;
    public final void rule__DEECoModel__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:787:1: ( rule__DEECoModel__Group_3_3__0__Impl rule__DEECoModel__Group_3_3__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:788:2: rule__DEECoModel__Group_3_3__0__Impl rule__DEECoModel__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3_3__0__Impl_in_rule__DEECoModel__Group_3_3__01556);
            rule__DEECoModel__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3_3__1_in_rule__DEECoModel__Group_3_3__01559);
            rule__DEECoModel__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3_3__0"


    // $ANTLR start "rule__DEECoModel__Group_3_3__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:795:1: rule__DEECoModel__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__DEECoModel__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:799:1: ( ( ',' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:800:1: ( ',' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:800:1: ( ',' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:801:1: ','
            {
             before(grammarAccess.getDEECoModelAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__DEECoModel__Group_3_3__0__Impl1587); 
             after(grammarAccess.getDEECoModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3_3__0__Impl"


    // $ANTLR start "rule__DEECoModel__Group_3_3__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:814:1: rule__DEECoModel__Group_3_3__1 : rule__DEECoModel__Group_3_3__1__Impl ;
    public final void rule__DEECoModel__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:818:1: ( rule__DEECoModel__Group_3_3__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:819:2: rule__DEECoModel__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_3_3__1__Impl_in_rule__DEECoModel__Group_3_3__11618);
            rule__DEECoModel__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3_3__1"


    // $ANTLR start "rule__DEECoModel__Group_3_3__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:825:1: rule__DEECoModel__Group_3_3__1__Impl : ( ( rule__DEECoModel__ElementsAssignment_3_3_1 ) ) ;
    public final void rule__DEECoModel__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:829:1: ( ( ( rule__DEECoModel__ElementsAssignment_3_3_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:830:1: ( ( rule__DEECoModel__ElementsAssignment_3_3_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:830:1: ( ( rule__DEECoModel__ElementsAssignment_3_3_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:831:1: ( rule__DEECoModel__ElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getDEECoModelAccess().getElementsAssignment_3_3_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:832:1: ( rule__DEECoModel__ElementsAssignment_3_3_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:832:2: rule__DEECoModel__ElementsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__ElementsAssignment_3_3_1_in_rule__DEECoModel__Group_3_3__1__Impl1645);
            rule__DEECoModel__ElementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDEECoModelAccess().getElementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_3_3__1__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:846:1: rule__DEECoModel__Group_4__0 : rule__DEECoModel__Group_4__0__Impl rule__DEECoModel__Group_4__1 ;
    public final void rule__DEECoModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:850:1: ( rule__DEECoModel__Group_4__0__Impl rule__DEECoModel__Group_4__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:851:2: rule__DEECoModel__Group_4__0__Impl rule__DEECoModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__0__Impl_in_rule__DEECoModel__Group_4__01679);
            rule__DEECoModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__1_in_rule__DEECoModel__Group_4__01682);
            rule__DEECoModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__0"


    // $ANTLR start "rule__DEECoModel__Group_4__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:858:1: rule__DEECoModel__Group_4__0__Impl : ( 'knowledges' ) ;
    public final void rule__DEECoModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:862:1: ( ( 'knowledges' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:863:1: ( 'knowledges' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:863:1: ( 'knowledges' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:864:1: 'knowledges'
            {
             before(grammarAccess.getDEECoModelAccess().getKnowledgesKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__DEECoModel__Group_4__0__Impl1710); 
             after(grammarAccess.getDEECoModelAccess().getKnowledgesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__0__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:877:1: rule__DEECoModel__Group_4__1 : rule__DEECoModel__Group_4__1__Impl rule__DEECoModel__Group_4__2 ;
    public final void rule__DEECoModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:881:1: ( rule__DEECoModel__Group_4__1__Impl rule__DEECoModel__Group_4__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:882:2: rule__DEECoModel__Group_4__1__Impl rule__DEECoModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__1__Impl_in_rule__DEECoModel__Group_4__11741);
            rule__DEECoModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__2_in_rule__DEECoModel__Group_4__11744);
            rule__DEECoModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__1"


    // $ANTLR start "rule__DEECoModel__Group_4__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:889:1: rule__DEECoModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DEECoModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:893:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:894:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:894:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:895:1: '{'
            {
             before(grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__DEECoModel__Group_4__1__Impl1772); 
             after(grammarAccess.getDEECoModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__1__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:908:1: rule__DEECoModel__Group_4__2 : rule__DEECoModel__Group_4__2__Impl rule__DEECoModel__Group_4__3 ;
    public final void rule__DEECoModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:912:1: ( rule__DEECoModel__Group_4__2__Impl rule__DEECoModel__Group_4__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:913:2: rule__DEECoModel__Group_4__2__Impl rule__DEECoModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__2__Impl_in_rule__DEECoModel__Group_4__21803);
            rule__DEECoModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__3_in_rule__DEECoModel__Group_4__21806);
            rule__DEECoModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__2"


    // $ANTLR start "rule__DEECoModel__Group_4__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:920:1: rule__DEECoModel__Group_4__2__Impl : ( ( rule__DEECoModel__KnowledgesAssignment_4_2 ) ) ;
    public final void rule__DEECoModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:924:1: ( ( ( rule__DEECoModel__KnowledgesAssignment_4_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:925:1: ( ( rule__DEECoModel__KnowledgesAssignment_4_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:925:1: ( ( rule__DEECoModel__KnowledgesAssignment_4_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:926:1: ( rule__DEECoModel__KnowledgesAssignment_4_2 )
            {
             before(grammarAccess.getDEECoModelAccess().getKnowledgesAssignment_4_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:927:1: ( rule__DEECoModel__KnowledgesAssignment_4_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:927:2: rule__DEECoModel__KnowledgesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__KnowledgesAssignment_4_2_in_rule__DEECoModel__Group_4__2__Impl1833);
            rule__DEECoModel__KnowledgesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDEECoModelAccess().getKnowledgesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__2__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:937:1: rule__DEECoModel__Group_4__3 : rule__DEECoModel__Group_4__3__Impl rule__DEECoModel__Group_4__4 ;
    public final void rule__DEECoModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:941:1: ( rule__DEECoModel__Group_4__3__Impl rule__DEECoModel__Group_4__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:942:2: rule__DEECoModel__Group_4__3__Impl rule__DEECoModel__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__3__Impl_in_rule__DEECoModel__Group_4__31863);
            rule__DEECoModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__4_in_rule__DEECoModel__Group_4__31866);
            rule__DEECoModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__3"


    // $ANTLR start "rule__DEECoModel__Group_4__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:949:1: rule__DEECoModel__Group_4__3__Impl : ( ( rule__DEECoModel__Group_4_3__0 )* ) ;
    public final void rule__DEECoModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:953:1: ( ( ( rule__DEECoModel__Group_4_3__0 )* ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:954:1: ( ( rule__DEECoModel__Group_4_3__0 )* )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:954:1: ( ( rule__DEECoModel__Group_4_3__0 )* )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:955:1: ( rule__DEECoModel__Group_4_3__0 )*
            {
             before(grammarAccess.getDEECoModelAccess().getGroup_4_3()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:956:1: ( rule__DEECoModel__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:956:2: rule__DEECoModel__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4_3__0_in_rule__DEECoModel__Group_4__3__Impl1893);
            	    rule__DEECoModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDEECoModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__3__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:966:1: rule__DEECoModel__Group_4__4 : rule__DEECoModel__Group_4__4__Impl ;
    public final void rule__DEECoModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:970:1: ( rule__DEECoModel__Group_4__4__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:971:2: rule__DEECoModel__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4__4__Impl_in_rule__DEECoModel__Group_4__41924);
            rule__DEECoModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__4"


    // $ANTLR start "rule__DEECoModel__Group_4__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:977:1: rule__DEECoModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DEECoModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:981:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:982:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:982:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:983:1: '}'
            {
             before(grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__DEECoModel__Group_4__4__Impl1952); 
             after(grammarAccess.getDEECoModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4__4__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4_3__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1006:1: rule__DEECoModel__Group_4_3__0 : rule__DEECoModel__Group_4_3__0__Impl rule__DEECoModel__Group_4_3__1 ;
    public final void rule__DEECoModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1010:1: ( rule__DEECoModel__Group_4_3__0__Impl rule__DEECoModel__Group_4_3__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1011:2: rule__DEECoModel__Group_4_3__0__Impl rule__DEECoModel__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4_3__0__Impl_in_rule__DEECoModel__Group_4_3__01993);
            rule__DEECoModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4_3__1_in_rule__DEECoModel__Group_4_3__01996);
            rule__DEECoModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4_3__0"


    // $ANTLR start "rule__DEECoModel__Group_4_3__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1018:1: rule__DEECoModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DEECoModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1022:1: ( ( ',' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1023:1: ( ',' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1023:1: ( ',' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1024:1: ','
            {
             before(grammarAccess.getDEECoModelAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__DEECoModel__Group_4_3__0__Impl2024); 
             after(grammarAccess.getDEECoModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__DEECoModel__Group_4_3__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1037:1: rule__DEECoModel__Group_4_3__1 : rule__DEECoModel__Group_4_3__1__Impl ;
    public final void rule__DEECoModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1041:1: ( rule__DEECoModel__Group_4_3__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1042:2: rule__DEECoModel__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__Group_4_3__1__Impl_in_rule__DEECoModel__Group_4_3__12055);
            rule__DEECoModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4_3__1"


    // $ANTLR start "rule__DEECoModel__Group_4_3__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1048:1: rule__DEECoModel__Group_4_3__1__Impl : ( ( rule__DEECoModel__KnowledgesAssignment_4_3_1 ) ) ;
    public final void rule__DEECoModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1052:1: ( ( ( rule__DEECoModel__KnowledgesAssignment_4_3_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1053:1: ( ( rule__DEECoModel__KnowledgesAssignment_4_3_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1053:1: ( ( rule__DEECoModel__KnowledgesAssignment_4_3_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1054:1: ( rule__DEECoModel__KnowledgesAssignment_4_3_1 )
            {
             before(grammarAccess.getDEECoModelAccess().getKnowledgesAssignment_4_3_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1055:1: ( rule__DEECoModel__KnowledgesAssignment_4_3_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1055:2: rule__DEECoModel__KnowledgesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DEECoModel__KnowledgesAssignment_4_3_1_in_rule__DEECoModel__Group_4_3__1__Impl2082);
            rule__DEECoModel__KnowledgesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDEECoModelAccess().getKnowledgesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1069:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1073:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1074:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02116);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02119);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1081:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1085:1: ( ( ( '-' )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1086:1: ( ( '-' )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1086:1: ( ( '-' )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1087:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1088:1: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1089:2: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__EInt__Group__0__Impl2148); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1100:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1104:1: ( rule__EInt__Group__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1105:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12181);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1111:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1115:1: ( ( RULE_INT ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1116:1: ( RULE_INT )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1116:1: ( RULE_INT )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1117:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2208); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Ensemble__Group__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1132:1: rule__Ensemble__Group__0 : rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1 ;
    public final void rule__Ensemble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1136:1: ( rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1137:2: rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__0__Impl_in_rule__Ensemble__Group__02241);
            rule__Ensemble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__1_in_rule__Ensemble__Group__02244);
            rule__Ensemble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__0"


    // $ANTLR start "rule__Ensemble__Group__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1144:1: rule__Ensemble__Group__0__Impl : ( () ) ;
    public final void rule__Ensemble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1148:1: ( ( () ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1149:1: ( () )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1149:1: ( () )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1150:1: ()
            {
             before(grammarAccess.getEnsembleAccess().getEnsembleAction_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1151:1: ()
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1153:1: 
            {
            }

             after(grammarAccess.getEnsembleAccess().getEnsembleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__0__Impl"


    // $ANTLR start "rule__Ensemble__Group__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1163:1: rule__Ensemble__Group__1 : rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2 ;
    public final void rule__Ensemble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1167:1: ( rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1168:2: rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__1__Impl_in_rule__Ensemble__Group__12302);
            rule__Ensemble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__2_in_rule__Ensemble__Group__12305);
            rule__Ensemble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__1"


    // $ANTLR start "rule__Ensemble__Group__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1175:1: rule__Ensemble__Group__1__Impl : ( 'Ensemble' ) ;
    public final void rule__Ensemble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1179:1: ( ( 'Ensemble' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1180:1: ( 'Ensemble' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1180:1: ( 'Ensemble' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1181:1: 'Ensemble'
            {
             before(grammarAccess.getEnsembleAccess().getEnsembleKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ensemble__Group__1__Impl2333); 
             after(grammarAccess.getEnsembleAccess().getEnsembleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__1__Impl"


    // $ANTLR start "rule__Ensemble__Group__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1194:1: rule__Ensemble__Group__2 : rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3 ;
    public final void rule__Ensemble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1198:1: ( rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1199:2: rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__2__Impl_in_rule__Ensemble__Group__22364);
            rule__Ensemble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__3_in_rule__Ensemble__Group__22367);
            rule__Ensemble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__2"


    // $ANTLR start "rule__Ensemble__Group__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1206:1: rule__Ensemble__Group__2__Impl : ( ( rule__Ensemble__NameAssignment_2 ) ) ;
    public final void rule__Ensemble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1210:1: ( ( ( rule__Ensemble__NameAssignment_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1211:1: ( ( rule__Ensemble__NameAssignment_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1211:1: ( ( rule__Ensemble__NameAssignment_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1212:1: ( rule__Ensemble__NameAssignment_2 )
            {
             before(grammarAccess.getEnsembleAccess().getNameAssignment_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1213:1: ( rule__Ensemble__NameAssignment_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1213:2: rule__Ensemble__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__NameAssignment_2_in_rule__Ensemble__Group__2__Impl2394);
            rule__Ensemble__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__2__Impl"


    // $ANTLR start "rule__Ensemble__Group__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1223:1: rule__Ensemble__Group__3 : rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4 ;
    public final void rule__Ensemble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1227:1: ( rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1228:2: rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__3__Impl_in_rule__Ensemble__Group__32424);
            rule__Ensemble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__4_in_rule__Ensemble__Group__32427);
            rule__Ensemble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__3"


    // $ANTLR start "rule__Ensemble__Group__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1235:1: rule__Ensemble__Group__3__Impl : ( '{' ) ;
    public final void rule__Ensemble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1239:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1240:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1240:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1241:1: '{'
            {
             before(grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Ensemble__Group__3__Impl2455); 
             after(grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__3__Impl"


    // $ANTLR start "rule__Ensemble__Group__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1254:1: rule__Ensemble__Group__4 : rule__Ensemble__Group__4__Impl rule__Ensemble__Group__5 ;
    public final void rule__Ensemble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1258:1: ( rule__Ensemble__Group__4__Impl rule__Ensemble__Group__5 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1259:2: rule__Ensemble__Group__4__Impl rule__Ensemble__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__4__Impl_in_rule__Ensemble__Group__42486);
            rule__Ensemble__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__5_in_rule__Ensemble__Group__42489);
            rule__Ensemble__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__4"


    // $ANTLR start "rule__Ensemble__Group__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1266:1: rule__Ensemble__Group__4__Impl : ( ( rule__Ensemble__Group_4__0 )? ) ;
    public final void rule__Ensemble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1270:1: ( ( ( rule__Ensemble__Group_4__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1271:1: ( ( rule__Ensemble__Group_4__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1271:1: ( ( rule__Ensemble__Group_4__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1272:1: ( rule__Ensemble__Group_4__0 )?
            {
             before(grammarAccess.getEnsembleAccess().getGroup_4()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1273:1: ( rule__Ensemble__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1273:2: rule__Ensemble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_4__0_in_rule__Ensemble__Group__4__Impl2516);
                    rule__Ensemble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnsembleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__4__Impl"


    // $ANTLR start "rule__Ensemble__Group__5"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1283:1: rule__Ensemble__Group__5 : rule__Ensemble__Group__5__Impl ;
    public final void rule__Ensemble__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1287:1: ( rule__Ensemble__Group__5__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1288:2: rule__Ensemble__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__5__Impl_in_rule__Ensemble__Group__52547);
            rule__Ensemble__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__5"


    // $ANTLR start "rule__Ensemble__Group__5__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1294:1: rule__Ensemble__Group__5__Impl : ( '}' ) ;
    public final void rule__Ensemble__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1298:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1299:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1299:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1300:1: '}'
            {
             before(grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Ensemble__Group__5__Impl2575); 
             after(grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__5__Impl"


    // $ANTLR start "rule__Ensemble__Group_4__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1325:1: rule__Ensemble__Group_4__0 : rule__Ensemble__Group_4__0__Impl rule__Ensemble__Group_4__1 ;
    public final void rule__Ensemble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1329:1: ( rule__Ensemble__Group_4__0__Impl rule__Ensemble__Group_4__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1330:2: rule__Ensemble__Group_4__0__Impl rule__Ensemble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_4__0__Impl_in_rule__Ensemble__Group_4__02618);
            rule__Ensemble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_4__1_in_rule__Ensemble__Group_4__02621);
            rule__Ensemble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_4__0"


    // $ANTLR start "rule__Ensemble__Group_4__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1337:1: rule__Ensemble__Group_4__0__Impl : ( 'period' ) ;
    public final void rule__Ensemble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1341:1: ( ( 'period' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1342:1: ( 'period' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1342:1: ( 'period' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1343:1: 'period'
            {
             before(grammarAccess.getEnsembleAccess().getPeriodKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ensemble__Group_4__0__Impl2649); 
             after(grammarAccess.getEnsembleAccess().getPeriodKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_4__0__Impl"


    // $ANTLR start "rule__Ensemble__Group_4__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1356:1: rule__Ensemble__Group_4__1 : rule__Ensemble__Group_4__1__Impl ;
    public final void rule__Ensemble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1360:1: ( rule__Ensemble__Group_4__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1361:2: rule__Ensemble__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_4__1__Impl_in_rule__Ensemble__Group_4__12680);
            rule__Ensemble__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_4__1"


    // $ANTLR start "rule__Ensemble__Group_4__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1367:1: rule__Ensemble__Group_4__1__Impl : ( ( rule__Ensemble__PeriodAssignment_4_1 ) ) ;
    public final void rule__Ensemble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1371:1: ( ( ( rule__Ensemble__PeriodAssignment_4_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1372:1: ( ( rule__Ensemble__PeriodAssignment_4_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1372:1: ( ( rule__Ensemble__PeriodAssignment_4_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1373:1: ( rule__Ensemble__PeriodAssignment_4_1 )
            {
             before(grammarAccess.getEnsembleAccess().getPeriodAssignment_4_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1374:1: ( rule__Ensemble__PeriodAssignment_4_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1374:2: rule__Ensemble__PeriodAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__PeriodAssignment_4_1_in_rule__Ensemble__Group_4__1__Impl2707);
            rule__Ensemble__PeriodAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getPeriodAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1388:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1392:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1393:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__02741);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__1_in_rule__Process__Group__02744);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1400:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1404:1: ( ( () ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1405:1: ( () )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1405:1: ( () )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1406:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1407:1: ()
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1409:1: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1419:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1423:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1424:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__12802);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__2_in_rule__Process__Group__12805);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1431:1: rule__Process__Group__1__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1435:1: ( ( 'Process' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1436:1: ( 'Process' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1436:1: ( 'Process' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1437:1: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Process__Group__1__Impl2833); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1450:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1454:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1455:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__22864);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__3_in_rule__Process__Group__22867);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1462:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1466:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1467:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1467:1: ( ( rule__Process__NameAssignment_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1468:1: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1469:1: ( rule__Process__NameAssignment_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1469:2: rule__Process__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__2__Impl2894);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1479:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1483:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1484:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__32924);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__4_in_rule__Process__Group__32927);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1491:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1495:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1496:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1496:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1497:1: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Process__Group__3__Impl2955); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1510:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1514:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1515:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__42986);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__5_in_rule__Process__Group__42989);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1522:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1526:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1527:1: ( ( rule__Process__Group_4__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1527:1: ( ( rule__Process__Group_4__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1528:1: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1529:1: ( rule__Process__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1529:2: rule__Process__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__0_in_rule__Process__Group__4__Impl3016);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1539:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1543:1: ( rule__Process__Group__5__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1544:2: rule__Process__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__53047);
            rule__Process__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1550:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1554:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1555:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1555:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1556:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Process__Group__5__Impl3075); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1581:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1585:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1586:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__0__Impl_in_rule__Process__Group_4__03118);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__1_in_rule__Process__Group_4__03121);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1593:1: rule__Process__Group_4__0__Impl : ( 'period' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1597:1: ( ( 'period' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1598:1: ( 'period' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1598:1: ( 'period' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1599:1: 'period'
            {
             before(grammarAccess.getProcessAccess().getPeriodKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Process__Group_4__0__Impl3149); 
             after(grammarAccess.getProcessAccess().getPeriodKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1612:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1616:1: ( rule__Process__Group_4__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1617:2: rule__Process__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__1__Impl_in_rule__Process__Group_4__13180);
            rule__Process__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1623:1: rule__Process__Group_4__1__Impl : ( ( rule__Process__PeriodAssignment_4_1 ) ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1627:1: ( ( ( rule__Process__PeriodAssignment_4_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1628:1: ( ( rule__Process__PeriodAssignment_4_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1628:1: ( ( rule__Process__PeriodAssignment_4_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1629:1: ( rule__Process__PeriodAssignment_4_1 )
            {
             before(grammarAccess.getProcessAccess().getPeriodAssignment_4_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1630:1: ( rule__Process__PeriodAssignment_4_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1630:2: rule__Process__PeriodAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__PeriodAssignment_4_1_in_rule__Process__Group_4__1__Impl3207);
            rule__Process__PeriodAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getPeriodAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1644:1: rule__KnowledgeElement__Group__0 : rule__KnowledgeElement__Group__0__Impl rule__KnowledgeElement__Group__1 ;
    public final void rule__KnowledgeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1648:1: ( rule__KnowledgeElement__Group__0__Impl rule__KnowledgeElement__Group__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1649:2: rule__KnowledgeElement__Group__0__Impl rule__KnowledgeElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__0__Impl_in_rule__KnowledgeElement__Group__03241);
            rule__KnowledgeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__1_in_rule__KnowledgeElement__Group__03244);
            rule__KnowledgeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__0"


    // $ANTLR start "rule__KnowledgeElement__Group__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1656:1: rule__KnowledgeElement__Group__0__Impl : ( 'KnowledgeElement' ) ;
    public final void rule__KnowledgeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1660:1: ( ( 'KnowledgeElement' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1661:1: ( 'KnowledgeElement' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1661:1: ( 'KnowledgeElement' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1662:1: 'KnowledgeElement'
            {
             before(grammarAccess.getKnowledgeElementAccess().getKnowledgeElementKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__KnowledgeElement__Group__0__Impl3272); 
             after(grammarAccess.getKnowledgeElementAccess().getKnowledgeElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1675:1: rule__KnowledgeElement__Group__1 : rule__KnowledgeElement__Group__1__Impl rule__KnowledgeElement__Group__2 ;
    public final void rule__KnowledgeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1679:1: ( rule__KnowledgeElement__Group__1__Impl rule__KnowledgeElement__Group__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1680:2: rule__KnowledgeElement__Group__1__Impl rule__KnowledgeElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__1__Impl_in_rule__KnowledgeElement__Group__13303);
            rule__KnowledgeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__2_in_rule__KnowledgeElement__Group__13306);
            rule__KnowledgeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__1"


    // $ANTLR start "rule__KnowledgeElement__Group__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1687:1: rule__KnowledgeElement__Group__1__Impl : ( ( rule__KnowledgeElement__NameAssignment_1 ) ) ;
    public final void rule__KnowledgeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1691:1: ( ( ( rule__KnowledgeElement__NameAssignment_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1692:1: ( ( rule__KnowledgeElement__NameAssignment_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1692:1: ( ( rule__KnowledgeElement__NameAssignment_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1693:1: ( rule__KnowledgeElement__NameAssignment_1 )
            {
             before(grammarAccess.getKnowledgeElementAccess().getNameAssignment_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1694:1: ( rule__KnowledgeElement__NameAssignment_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1694:2: rule__KnowledgeElement__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__NameAssignment_1_in_rule__KnowledgeElement__Group__1__Impl3333);
            rule__KnowledgeElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1704:1: rule__KnowledgeElement__Group__2 : rule__KnowledgeElement__Group__2__Impl rule__KnowledgeElement__Group__3 ;
    public final void rule__KnowledgeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1708:1: ( rule__KnowledgeElement__Group__2__Impl rule__KnowledgeElement__Group__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1709:2: rule__KnowledgeElement__Group__2__Impl rule__KnowledgeElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__2__Impl_in_rule__KnowledgeElement__Group__23363);
            rule__KnowledgeElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__3_in_rule__KnowledgeElement__Group__23366);
            rule__KnowledgeElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__2"


    // $ANTLR start "rule__KnowledgeElement__Group__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1716:1: rule__KnowledgeElement__Group__2__Impl : ( '{' ) ;
    public final void rule__KnowledgeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1720:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1721:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1721:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1722:1: '{'
            {
             before(grammarAccess.getKnowledgeElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__KnowledgeElement__Group__2__Impl3394); 
             after(grammarAccess.getKnowledgeElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1735:1: rule__KnowledgeElement__Group__3 : rule__KnowledgeElement__Group__3__Impl rule__KnowledgeElement__Group__4 ;
    public final void rule__KnowledgeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1739:1: ( rule__KnowledgeElement__Group__3__Impl rule__KnowledgeElement__Group__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1740:2: rule__KnowledgeElement__Group__3__Impl rule__KnowledgeElement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__3__Impl_in_rule__KnowledgeElement__Group__33425);
            rule__KnowledgeElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__4_in_rule__KnowledgeElement__Group__33428);
            rule__KnowledgeElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__3"


    // $ANTLR start "rule__KnowledgeElement__Group__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1747:1: rule__KnowledgeElement__Group__3__Impl : ( ( rule__KnowledgeElement__Group_3__0 )? ) ;
    public final void rule__KnowledgeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1751:1: ( ( ( rule__KnowledgeElement__Group_3__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1752:1: ( ( rule__KnowledgeElement__Group_3__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1752:1: ( ( rule__KnowledgeElement__Group_3__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1753:1: ( rule__KnowledgeElement__Group_3__0 )?
            {
             before(grammarAccess.getKnowledgeElementAccess().getGroup_3()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1754:1: ( rule__KnowledgeElement__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1754:2: rule__KnowledgeElement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__0_in_rule__KnowledgeElement__Group__3__Impl3455);
                    rule__KnowledgeElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1764:1: rule__KnowledgeElement__Group__4 : rule__KnowledgeElement__Group__4__Impl rule__KnowledgeElement__Group__5 ;
    public final void rule__KnowledgeElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1768:1: ( rule__KnowledgeElement__Group__4__Impl rule__KnowledgeElement__Group__5 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1769:2: rule__KnowledgeElement__Group__4__Impl rule__KnowledgeElement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__4__Impl_in_rule__KnowledgeElement__Group__43486);
            rule__KnowledgeElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__5_in_rule__KnowledgeElement__Group__43489);
            rule__KnowledgeElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__4"


    // $ANTLR start "rule__KnowledgeElement__Group__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1776:1: rule__KnowledgeElement__Group__4__Impl : ( 'child' ) ;
    public final void rule__KnowledgeElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1780:1: ( ( 'child' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1781:1: ( 'child' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1781:1: ( 'child' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1782:1: 'child'
            {
             before(grammarAccess.getKnowledgeElementAccess().getChildKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__KnowledgeElement__Group__4__Impl3517); 
             after(grammarAccess.getKnowledgeElementAccess().getChildKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__4__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__5"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1795:1: rule__KnowledgeElement__Group__5 : rule__KnowledgeElement__Group__5__Impl rule__KnowledgeElement__Group__6 ;
    public final void rule__KnowledgeElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1799:1: ( rule__KnowledgeElement__Group__5__Impl rule__KnowledgeElement__Group__6 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1800:2: rule__KnowledgeElement__Group__5__Impl rule__KnowledgeElement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__5__Impl_in_rule__KnowledgeElement__Group__53548);
            rule__KnowledgeElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__6_in_rule__KnowledgeElement__Group__53551);
            rule__KnowledgeElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__5"


    // $ANTLR start "rule__KnowledgeElement__Group__5__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1807:1: rule__KnowledgeElement__Group__5__Impl : ( '{' ) ;
    public final void rule__KnowledgeElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1811:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1812:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1812:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1813:1: '{'
            {
             before(grammarAccess.getKnowledgeElementAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__KnowledgeElement__Group__5__Impl3579); 
             after(grammarAccess.getKnowledgeElementAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__5__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__6"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1826:1: rule__KnowledgeElement__Group__6 : rule__KnowledgeElement__Group__6__Impl rule__KnowledgeElement__Group__7 ;
    public final void rule__KnowledgeElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1830:1: ( rule__KnowledgeElement__Group__6__Impl rule__KnowledgeElement__Group__7 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1831:2: rule__KnowledgeElement__Group__6__Impl rule__KnowledgeElement__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__6__Impl_in_rule__KnowledgeElement__Group__63610);
            rule__KnowledgeElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__7_in_rule__KnowledgeElement__Group__63613);
            rule__KnowledgeElement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__6"


    // $ANTLR start "rule__KnowledgeElement__Group__6__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1838:1: rule__KnowledgeElement__Group__6__Impl : ( ( rule__KnowledgeElement__ChildAssignment_6 ) ) ;
    public final void rule__KnowledgeElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1842:1: ( ( ( rule__KnowledgeElement__ChildAssignment_6 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1843:1: ( ( rule__KnowledgeElement__ChildAssignment_6 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1843:1: ( ( rule__KnowledgeElement__ChildAssignment_6 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1844:1: ( rule__KnowledgeElement__ChildAssignment_6 )
            {
             before(grammarAccess.getKnowledgeElementAccess().getChildAssignment_6()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1845:1: ( rule__KnowledgeElement__ChildAssignment_6 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1845:2: rule__KnowledgeElement__ChildAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__ChildAssignment_6_in_rule__KnowledgeElement__Group__6__Impl3640);
            rule__KnowledgeElement__ChildAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeElementAccess().getChildAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__6__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__7"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1855:1: rule__KnowledgeElement__Group__7 : rule__KnowledgeElement__Group__7__Impl rule__KnowledgeElement__Group__8 ;
    public final void rule__KnowledgeElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1859:1: ( rule__KnowledgeElement__Group__7__Impl rule__KnowledgeElement__Group__8 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1860:2: rule__KnowledgeElement__Group__7__Impl rule__KnowledgeElement__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__7__Impl_in_rule__KnowledgeElement__Group__73670);
            rule__KnowledgeElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__8_in_rule__KnowledgeElement__Group__73673);
            rule__KnowledgeElement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__7"


    // $ANTLR start "rule__KnowledgeElement__Group__7__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1867:1: rule__KnowledgeElement__Group__7__Impl : ( ( rule__KnowledgeElement__Group_7__0 )* ) ;
    public final void rule__KnowledgeElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1871:1: ( ( ( rule__KnowledgeElement__Group_7__0 )* ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1872:1: ( ( rule__KnowledgeElement__Group_7__0 )* )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1872:1: ( ( rule__KnowledgeElement__Group_7__0 )* )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1873:1: ( rule__KnowledgeElement__Group_7__0 )*
            {
             before(grammarAccess.getKnowledgeElementAccess().getGroup_7()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1874:1: ( rule__KnowledgeElement__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1874:2: rule__KnowledgeElement__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_7__0_in_rule__KnowledgeElement__Group__7__Impl3700);
            	    rule__KnowledgeElement__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getKnowledgeElementAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__7__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__8"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1884:1: rule__KnowledgeElement__Group__8 : rule__KnowledgeElement__Group__8__Impl rule__KnowledgeElement__Group__9 ;
    public final void rule__KnowledgeElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1888:1: ( rule__KnowledgeElement__Group__8__Impl rule__KnowledgeElement__Group__9 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1889:2: rule__KnowledgeElement__Group__8__Impl rule__KnowledgeElement__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__8__Impl_in_rule__KnowledgeElement__Group__83731);
            rule__KnowledgeElement__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__9_in_rule__KnowledgeElement__Group__83734);
            rule__KnowledgeElement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__8"


    // $ANTLR start "rule__KnowledgeElement__Group__8__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1896:1: rule__KnowledgeElement__Group__8__Impl : ( '}' ) ;
    public final void rule__KnowledgeElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1900:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1901:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1901:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1902:1: '}'
            {
             before(grammarAccess.getKnowledgeElementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__KnowledgeElement__Group__8__Impl3762); 
             after(grammarAccess.getKnowledgeElementAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__8__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group__9"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1915:1: rule__KnowledgeElement__Group__9 : rule__KnowledgeElement__Group__9__Impl ;
    public final void rule__KnowledgeElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1919:1: ( rule__KnowledgeElement__Group__9__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1920:2: rule__KnowledgeElement__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group__9__Impl_in_rule__KnowledgeElement__Group__93793);
            rule__KnowledgeElement__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__9"


    // $ANTLR start "rule__KnowledgeElement__Group__9__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1926:1: rule__KnowledgeElement__Group__9__Impl : ( '}' ) ;
    public final void rule__KnowledgeElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1930:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1931:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1931:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1932:1: '}'
            {
             before(grammarAccess.getKnowledgeElementAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__KnowledgeElement__Group__9__Impl3821); 
             after(grammarAccess.getKnowledgeElementAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group__9__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1965:1: rule__KnowledgeElement__Group_3__0 : rule__KnowledgeElement__Group_3__0__Impl rule__KnowledgeElement__Group_3__1 ;
    public final void rule__KnowledgeElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1969:1: ( rule__KnowledgeElement__Group_3__0__Impl rule__KnowledgeElement__Group_3__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1970:2: rule__KnowledgeElement__Group_3__0__Impl rule__KnowledgeElement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__0__Impl_in_rule__KnowledgeElement__Group_3__03872);
            rule__KnowledgeElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__1_in_rule__KnowledgeElement__Group_3__03875);
            rule__KnowledgeElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__0"


    // $ANTLR start "rule__KnowledgeElement__Group_3__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1977:1: rule__KnowledgeElement__Group_3__0__Impl : ( 'reader' ) ;
    public final void rule__KnowledgeElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1981:1: ( ( 'reader' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1982:1: ( 'reader' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1982:1: ( 'reader' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1983:1: 'reader'
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__KnowledgeElement__Group_3__0__Impl3903); 
             after(grammarAccess.getKnowledgeElementAccess().getReaderKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__0__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:1996:1: rule__KnowledgeElement__Group_3__1 : rule__KnowledgeElement__Group_3__1__Impl rule__KnowledgeElement__Group_3__2 ;
    public final void rule__KnowledgeElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2000:1: ( rule__KnowledgeElement__Group_3__1__Impl rule__KnowledgeElement__Group_3__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2001:2: rule__KnowledgeElement__Group_3__1__Impl rule__KnowledgeElement__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__1__Impl_in_rule__KnowledgeElement__Group_3__13934);
            rule__KnowledgeElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__2_in_rule__KnowledgeElement__Group_3__13937);
            rule__KnowledgeElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__1"


    // $ANTLR start "rule__KnowledgeElement__Group_3__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2008:1: rule__KnowledgeElement__Group_3__1__Impl : ( '(' ) ;
    public final void rule__KnowledgeElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2012:1: ( ( '(' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2013:1: ( '(' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2013:1: ( '(' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2014:1: '('
            {
             before(grammarAccess.getKnowledgeElementAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__KnowledgeElement__Group_3__1__Impl3965); 
             after(grammarAccess.getKnowledgeElementAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__1__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2027:1: rule__KnowledgeElement__Group_3__2 : rule__KnowledgeElement__Group_3__2__Impl rule__KnowledgeElement__Group_3__3 ;
    public final void rule__KnowledgeElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2031:1: ( rule__KnowledgeElement__Group_3__2__Impl rule__KnowledgeElement__Group_3__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2032:2: rule__KnowledgeElement__Group_3__2__Impl rule__KnowledgeElement__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__2__Impl_in_rule__KnowledgeElement__Group_3__23996);
            rule__KnowledgeElement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__3_in_rule__KnowledgeElement__Group_3__23999);
            rule__KnowledgeElement__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__2"


    // $ANTLR start "rule__KnowledgeElement__Group_3__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2039:1: rule__KnowledgeElement__Group_3__2__Impl : ( ( rule__KnowledgeElement__ReaderAssignment_3_2 ) ) ;
    public final void rule__KnowledgeElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2043:1: ( ( ( rule__KnowledgeElement__ReaderAssignment_3_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2044:1: ( ( rule__KnowledgeElement__ReaderAssignment_3_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2044:1: ( ( rule__KnowledgeElement__ReaderAssignment_3_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2045:1: ( rule__KnowledgeElement__ReaderAssignment_3_2 )
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderAssignment_3_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2046:1: ( rule__KnowledgeElement__ReaderAssignment_3_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2046:2: rule__KnowledgeElement__ReaderAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__ReaderAssignment_3_2_in_rule__KnowledgeElement__Group_3__2__Impl4026);
            rule__KnowledgeElement__ReaderAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeElementAccess().getReaderAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__2__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2056:1: rule__KnowledgeElement__Group_3__3 : rule__KnowledgeElement__Group_3__3__Impl rule__KnowledgeElement__Group_3__4 ;
    public final void rule__KnowledgeElement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2060:1: ( rule__KnowledgeElement__Group_3__3__Impl rule__KnowledgeElement__Group_3__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2061:2: rule__KnowledgeElement__Group_3__3__Impl rule__KnowledgeElement__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__3__Impl_in_rule__KnowledgeElement__Group_3__34056);
            rule__KnowledgeElement__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__4_in_rule__KnowledgeElement__Group_3__34059);
            rule__KnowledgeElement__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__3"


    // $ANTLR start "rule__KnowledgeElement__Group_3__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2068:1: rule__KnowledgeElement__Group_3__3__Impl : ( ( rule__KnowledgeElement__Group_3_3__0 )* ) ;
    public final void rule__KnowledgeElement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2072:1: ( ( ( rule__KnowledgeElement__Group_3_3__0 )* ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2073:1: ( ( rule__KnowledgeElement__Group_3_3__0 )* )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2073:1: ( ( rule__KnowledgeElement__Group_3_3__0 )* )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2074:1: ( rule__KnowledgeElement__Group_3_3__0 )*
            {
             before(grammarAccess.getKnowledgeElementAccess().getGroup_3_3()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2075:1: ( rule__KnowledgeElement__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2075:2: rule__KnowledgeElement__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3_3__0_in_rule__KnowledgeElement__Group_3__3__Impl4086);
            	    rule__KnowledgeElement__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getKnowledgeElementAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__3__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2085:1: rule__KnowledgeElement__Group_3__4 : rule__KnowledgeElement__Group_3__4__Impl ;
    public final void rule__KnowledgeElement__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2089:1: ( rule__KnowledgeElement__Group_3__4__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2090:2: rule__KnowledgeElement__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3__4__Impl_in_rule__KnowledgeElement__Group_3__44117);
            rule__KnowledgeElement__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__4"


    // $ANTLR start "rule__KnowledgeElement__Group_3__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2096:1: rule__KnowledgeElement__Group_3__4__Impl : ( ')' ) ;
    public final void rule__KnowledgeElement__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2100:1: ( ( ')' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2101:1: ( ')' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2101:1: ( ')' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2102:1: ')'
            {
             before(grammarAccess.getKnowledgeElementAccess().getRightParenthesisKeyword_3_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__KnowledgeElement__Group_3__4__Impl4145); 
             after(grammarAccess.getKnowledgeElementAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3__4__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3_3__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2125:1: rule__KnowledgeElement__Group_3_3__0 : rule__KnowledgeElement__Group_3_3__0__Impl rule__KnowledgeElement__Group_3_3__1 ;
    public final void rule__KnowledgeElement__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2129:1: ( rule__KnowledgeElement__Group_3_3__0__Impl rule__KnowledgeElement__Group_3_3__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2130:2: rule__KnowledgeElement__Group_3_3__0__Impl rule__KnowledgeElement__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3_3__0__Impl_in_rule__KnowledgeElement__Group_3_3__04186);
            rule__KnowledgeElement__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3_3__1_in_rule__KnowledgeElement__Group_3_3__04189);
            rule__KnowledgeElement__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3_3__0"


    // $ANTLR start "rule__KnowledgeElement__Group_3_3__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2137:1: rule__KnowledgeElement__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeElement__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2141:1: ( ( ',' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2142:1: ( ',' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2142:1: ( ',' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2143:1: ','
            {
             before(grammarAccess.getKnowledgeElementAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KnowledgeElement__Group_3_3__0__Impl4217); 
             after(grammarAccess.getKnowledgeElementAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3_3__0__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_3_3__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2156:1: rule__KnowledgeElement__Group_3_3__1 : rule__KnowledgeElement__Group_3_3__1__Impl ;
    public final void rule__KnowledgeElement__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2160:1: ( rule__KnowledgeElement__Group_3_3__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2161:2: rule__KnowledgeElement__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_3_3__1__Impl_in_rule__KnowledgeElement__Group_3_3__14248);
            rule__KnowledgeElement__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3_3__1"


    // $ANTLR start "rule__KnowledgeElement__Group_3_3__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2167:1: rule__KnowledgeElement__Group_3_3__1__Impl : ( ( rule__KnowledgeElement__ReaderAssignment_3_3_1 ) ) ;
    public final void rule__KnowledgeElement__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2171:1: ( ( ( rule__KnowledgeElement__ReaderAssignment_3_3_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2172:1: ( ( rule__KnowledgeElement__ReaderAssignment_3_3_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2172:1: ( ( rule__KnowledgeElement__ReaderAssignment_3_3_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2173:1: ( rule__KnowledgeElement__ReaderAssignment_3_3_1 )
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderAssignment_3_3_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2174:1: ( rule__KnowledgeElement__ReaderAssignment_3_3_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2174:2: rule__KnowledgeElement__ReaderAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__ReaderAssignment_3_3_1_in_rule__KnowledgeElement__Group_3_3__1__Impl4275);
            rule__KnowledgeElement__ReaderAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeElementAccess().getReaderAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_3_3__1__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_7__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2188:1: rule__KnowledgeElement__Group_7__0 : rule__KnowledgeElement__Group_7__0__Impl rule__KnowledgeElement__Group_7__1 ;
    public final void rule__KnowledgeElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2192:1: ( rule__KnowledgeElement__Group_7__0__Impl rule__KnowledgeElement__Group_7__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2193:2: rule__KnowledgeElement__Group_7__0__Impl rule__KnowledgeElement__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_7__0__Impl_in_rule__KnowledgeElement__Group_7__04309);
            rule__KnowledgeElement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_7__1_in_rule__KnowledgeElement__Group_7__04312);
            rule__KnowledgeElement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_7__0"


    // $ANTLR start "rule__KnowledgeElement__Group_7__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2200:1: rule__KnowledgeElement__Group_7__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2204:1: ( ( ',' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2205:1: ( ',' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2205:1: ( ',' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2206:1: ','
            {
             before(grammarAccess.getKnowledgeElementAccess().getCommaKeyword_7_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KnowledgeElement__Group_7__0__Impl4340); 
             after(grammarAccess.getKnowledgeElementAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_7__0__Impl"


    // $ANTLR start "rule__KnowledgeElement__Group_7__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2219:1: rule__KnowledgeElement__Group_7__1 : rule__KnowledgeElement__Group_7__1__Impl ;
    public final void rule__KnowledgeElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2223:1: ( rule__KnowledgeElement__Group_7__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2224:2: rule__KnowledgeElement__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__Group_7__1__Impl_in_rule__KnowledgeElement__Group_7__14371);
            rule__KnowledgeElement__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_7__1"


    // $ANTLR start "rule__KnowledgeElement__Group_7__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2230:1: rule__KnowledgeElement__Group_7__1__Impl : ( ( rule__KnowledgeElement__ChildAssignment_7_1 ) ) ;
    public final void rule__KnowledgeElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2234:1: ( ( ( rule__KnowledgeElement__ChildAssignment_7_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2235:1: ( ( rule__KnowledgeElement__ChildAssignment_7_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2235:1: ( ( rule__KnowledgeElement__ChildAssignment_7_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2236:1: ( rule__KnowledgeElement__ChildAssignment_7_1 )
            {
             before(grammarAccess.getKnowledgeElementAccess().getChildAssignment_7_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2237:1: ( rule__KnowledgeElement__ChildAssignment_7_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2237:2: rule__KnowledgeElement__ChildAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KnowledgeElement__ChildAssignment_7_1_in_rule__KnowledgeElement__Group_7__1__Impl4398);
            rule__KnowledgeElement__ChildAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeElementAccess().getChildAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__Group_7__1__Impl"


    // $ANTLR start "rule__Leaf__Group__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2251:1: rule__Leaf__Group__0 : rule__Leaf__Group__0__Impl rule__Leaf__Group__1 ;
    public final void rule__Leaf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2255:1: ( rule__Leaf__Group__0__Impl rule__Leaf__Group__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2256:2: rule__Leaf__Group__0__Impl rule__Leaf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__0__Impl_in_rule__Leaf__Group__04432);
            rule__Leaf__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__1_in_rule__Leaf__Group__04435);
            rule__Leaf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__0"


    // $ANTLR start "rule__Leaf__Group__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2263:1: rule__Leaf__Group__0__Impl : ( () ) ;
    public final void rule__Leaf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2267:1: ( ( () ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2268:1: ( () )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2268:1: ( () )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2269:1: ()
            {
             before(grammarAccess.getLeafAccess().getLeafAction_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2270:1: ()
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2272:1: 
            {
            }

             after(grammarAccess.getLeafAccess().getLeafAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__0__Impl"


    // $ANTLR start "rule__Leaf__Group__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2282:1: rule__Leaf__Group__1 : rule__Leaf__Group__1__Impl rule__Leaf__Group__2 ;
    public final void rule__Leaf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2286:1: ( rule__Leaf__Group__1__Impl rule__Leaf__Group__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2287:2: rule__Leaf__Group__1__Impl rule__Leaf__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__1__Impl_in_rule__Leaf__Group__14493);
            rule__Leaf__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__2_in_rule__Leaf__Group__14496);
            rule__Leaf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__1"


    // $ANTLR start "rule__Leaf__Group__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2294:1: rule__Leaf__Group__1__Impl : ( 'Leaf' ) ;
    public final void rule__Leaf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2298:1: ( ( 'Leaf' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2299:1: ( 'Leaf' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2299:1: ( 'Leaf' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2300:1: 'Leaf'
            {
             before(grammarAccess.getLeafAccess().getLeafKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Leaf__Group__1__Impl4524); 
             after(grammarAccess.getLeafAccess().getLeafKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__1__Impl"


    // $ANTLR start "rule__Leaf__Group__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2313:1: rule__Leaf__Group__2 : rule__Leaf__Group__2__Impl rule__Leaf__Group__3 ;
    public final void rule__Leaf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2317:1: ( rule__Leaf__Group__2__Impl rule__Leaf__Group__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2318:2: rule__Leaf__Group__2__Impl rule__Leaf__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__2__Impl_in_rule__Leaf__Group__24555);
            rule__Leaf__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__3_in_rule__Leaf__Group__24558);
            rule__Leaf__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__2"


    // $ANTLR start "rule__Leaf__Group__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2325:1: rule__Leaf__Group__2__Impl : ( ( rule__Leaf__NameAssignment_2 ) ) ;
    public final void rule__Leaf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2329:1: ( ( ( rule__Leaf__NameAssignment_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2330:1: ( ( rule__Leaf__NameAssignment_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2330:1: ( ( rule__Leaf__NameAssignment_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2331:1: ( rule__Leaf__NameAssignment_2 )
            {
             before(grammarAccess.getLeafAccess().getNameAssignment_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2332:1: ( rule__Leaf__NameAssignment_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2332:2: rule__Leaf__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__NameAssignment_2_in_rule__Leaf__Group__2__Impl4585);
            rule__Leaf__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__2__Impl"


    // $ANTLR start "rule__Leaf__Group__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2342:1: rule__Leaf__Group__3 : rule__Leaf__Group__3__Impl rule__Leaf__Group__4 ;
    public final void rule__Leaf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2346:1: ( rule__Leaf__Group__3__Impl rule__Leaf__Group__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2347:2: rule__Leaf__Group__3__Impl rule__Leaf__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__3__Impl_in_rule__Leaf__Group__34615);
            rule__Leaf__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__4_in_rule__Leaf__Group__34618);
            rule__Leaf__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__3"


    // $ANTLR start "rule__Leaf__Group__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2354:1: rule__Leaf__Group__3__Impl : ( '{' ) ;
    public final void rule__Leaf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2358:1: ( ( '{' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2359:1: ( '{' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2359:1: ( '{' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2360:1: '{'
            {
             before(grammarAccess.getLeafAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Leaf__Group__3__Impl4646); 
             after(grammarAccess.getLeafAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__3__Impl"


    // $ANTLR start "rule__Leaf__Group__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2373:1: rule__Leaf__Group__4 : rule__Leaf__Group__4__Impl rule__Leaf__Group__5 ;
    public final void rule__Leaf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2377:1: ( rule__Leaf__Group__4__Impl rule__Leaf__Group__5 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2378:2: rule__Leaf__Group__4__Impl rule__Leaf__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__4__Impl_in_rule__Leaf__Group__44677);
            rule__Leaf__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__5_in_rule__Leaf__Group__44680);
            rule__Leaf__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__4"


    // $ANTLR start "rule__Leaf__Group__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2385:1: rule__Leaf__Group__4__Impl : ( ( rule__Leaf__Group_4__0 )? ) ;
    public final void rule__Leaf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2389:1: ( ( ( rule__Leaf__Group_4__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2390:1: ( ( rule__Leaf__Group_4__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2390:1: ( ( rule__Leaf__Group_4__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2391:1: ( rule__Leaf__Group_4__0 )?
            {
             before(grammarAccess.getLeafAccess().getGroup_4()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2392:1: ( rule__Leaf__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2392:2: rule__Leaf__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_4__0_in_rule__Leaf__Group__4__Impl4707);
                    rule__Leaf__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__4__Impl"


    // $ANTLR start "rule__Leaf__Group__5"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2402:1: rule__Leaf__Group__5 : rule__Leaf__Group__5__Impl rule__Leaf__Group__6 ;
    public final void rule__Leaf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2406:1: ( rule__Leaf__Group__5__Impl rule__Leaf__Group__6 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2407:2: rule__Leaf__Group__5__Impl rule__Leaf__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__5__Impl_in_rule__Leaf__Group__54738);
            rule__Leaf__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__6_in_rule__Leaf__Group__54741);
            rule__Leaf__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__5"


    // $ANTLR start "rule__Leaf__Group__5__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2414:1: rule__Leaf__Group__5__Impl : ( ( rule__Leaf__Group_5__0 )? ) ;
    public final void rule__Leaf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2418:1: ( ( ( rule__Leaf__Group_5__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2419:1: ( ( rule__Leaf__Group_5__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2419:1: ( ( rule__Leaf__Group_5__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2420:1: ( rule__Leaf__Group_5__0 )?
            {
             before(grammarAccess.getLeafAccess().getGroup_5()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2421:1: ( rule__Leaf__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2421:2: rule__Leaf__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__0_in_rule__Leaf__Group__5__Impl4768);
                    rule__Leaf__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__5__Impl"


    // $ANTLR start "rule__Leaf__Group__6"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2431:1: rule__Leaf__Group__6 : rule__Leaf__Group__6__Impl rule__Leaf__Group__7 ;
    public final void rule__Leaf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2435:1: ( rule__Leaf__Group__6__Impl rule__Leaf__Group__7 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2436:2: rule__Leaf__Group__6__Impl rule__Leaf__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__6__Impl_in_rule__Leaf__Group__64799);
            rule__Leaf__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__7_in_rule__Leaf__Group__64802);
            rule__Leaf__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__6"


    // $ANTLR start "rule__Leaf__Group__6__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2443:1: rule__Leaf__Group__6__Impl : ( ( rule__Leaf__Group_6__0 )? ) ;
    public final void rule__Leaf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2447:1: ( ( ( rule__Leaf__Group_6__0 )? ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2448:1: ( ( rule__Leaf__Group_6__0 )? )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2448:1: ( ( rule__Leaf__Group_6__0 )? )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2449:1: ( rule__Leaf__Group_6__0 )?
            {
             before(grammarAccess.getLeafAccess().getGroup_6()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2450:1: ( rule__Leaf__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2450:2: rule__Leaf__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_6__0_in_rule__Leaf__Group__6__Impl4829);
                    rule__Leaf__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__6__Impl"


    // $ANTLR start "rule__Leaf__Group__7"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2460:1: rule__Leaf__Group__7 : rule__Leaf__Group__7__Impl ;
    public final void rule__Leaf__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2464:1: ( rule__Leaf__Group__7__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2465:2: rule__Leaf__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group__7__Impl_in_rule__Leaf__Group__74860);
            rule__Leaf__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__7"


    // $ANTLR start "rule__Leaf__Group__7__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2471:1: rule__Leaf__Group__7__Impl : ( '}' ) ;
    public final void rule__Leaf__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2475:1: ( ( '}' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2476:1: ( '}' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2476:1: ( '}' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2477:1: '}'
            {
             before(grammarAccess.getLeafAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Leaf__Group__7__Impl4888); 
             after(grammarAccess.getLeafAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__7__Impl"


    // $ANTLR start "rule__Leaf__Group_4__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2506:1: rule__Leaf__Group_4__0 : rule__Leaf__Group_4__0__Impl rule__Leaf__Group_4__1 ;
    public final void rule__Leaf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2510:1: ( rule__Leaf__Group_4__0__Impl rule__Leaf__Group_4__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2511:2: rule__Leaf__Group_4__0__Impl rule__Leaf__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_4__0__Impl_in_rule__Leaf__Group_4__04935);
            rule__Leaf__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_4__1_in_rule__Leaf__Group_4__04938);
            rule__Leaf__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_4__0"


    // $ANTLR start "rule__Leaf__Group_4__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2518:1: rule__Leaf__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Leaf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2522:1: ( ( 'type' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2523:1: ( 'type' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2523:1: ( 'type' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2524:1: 'type'
            {
             before(grammarAccess.getLeafAccess().getTypeKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Leaf__Group_4__0__Impl4966); 
             after(grammarAccess.getLeafAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_4__0__Impl"


    // $ANTLR start "rule__Leaf__Group_4__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2537:1: rule__Leaf__Group_4__1 : rule__Leaf__Group_4__1__Impl ;
    public final void rule__Leaf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2541:1: ( rule__Leaf__Group_4__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2542:2: rule__Leaf__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_4__1__Impl_in_rule__Leaf__Group_4__14997);
            rule__Leaf__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_4__1"


    // $ANTLR start "rule__Leaf__Group_4__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2548:1: rule__Leaf__Group_4__1__Impl : ( ( rule__Leaf__TypeAssignment_4_1 ) ) ;
    public final void rule__Leaf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2552:1: ( ( ( rule__Leaf__TypeAssignment_4_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2553:1: ( ( rule__Leaf__TypeAssignment_4_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2553:1: ( ( rule__Leaf__TypeAssignment_4_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2554:1: ( rule__Leaf__TypeAssignment_4_1 )
            {
             before(grammarAccess.getLeafAccess().getTypeAssignment_4_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2555:1: ( rule__Leaf__TypeAssignment_4_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2555:2: rule__Leaf__TypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__TypeAssignment_4_1_in_rule__Leaf__Group_4__1__Impl5024);
            rule__Leaf__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_4__1__Impl"


    // $ANTLR start "rule__Leaf__Group_5__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2569:1: rule__Leaf__Group_5__0 : rule__Leaf__Group_5__0__Impl rule__Leaf__Group_5__1 ;
    public final void rule__Leaf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2573:1: ( rule__Leaf__Group_5__0__Impl rule__Leaf__Group_5__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2574:2: rule__Leaf__Group_5__0__Impl rule__Leaf__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__0__Impl_in_rule__Leaf__Group_5__05058);
            rule__Leaf__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__1_in_rule__Leaf__Group_5__05061);
            rule__Leaf__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__0"


    // $ANTLR start "rule__Leaf__Group_5__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2581:1: rule__Leaf__Group_5__0__Impl : ( 'reader' ) ;
    public final void rule__Leaf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2585:1: ( ( 'reader' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2586:1: ( 'reader' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2586:1: ( 'reader' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2587:1: 'reader'
            {
             before(grammarAccess.getLeafAccess().getReaderKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Leaf__Group_5__0__Impl5089); 
             after(grammarAccess.getLeafAccess().getReaderKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__0__Impl"


    // $ANTLR start "rule__Leaf__Group_5__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2600:1: rule__Leaf__Group_5__1 : rule__Leaf__Group_5__1__Impl rule__Leaf__Group_5__2 ;
    public final void rule__Leaf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2604:1: ( rule__Leaf__Group_5__1__Impl rule__Leaf__Group_5__2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2605:2: rule__Leaf__Group_5__1__Impl rule__Leaf__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__1__Impl_in_rule__Leaf__Group_5__15120);
            rule__Leaf__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__2_in_rule__Leaf__Group_5__15123);
            rule__Leaf__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__1"


    // $ANTLR start "rule__Leaf__Group_5__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2612:1: rule__Leaf__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Leaf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2616:1: ( ( '(' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2617:1: ( '(' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2617:1: ( '(' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2618:1: '('
            {
             before(grammarAccess.getLeafAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Leaf__Group_5__1__Impl5151); 
             after(grammarAccess.getLeafAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__1__Impl"


    // $ANTLR start "rule__Leaf__Group_5__2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2631:1: rule__Leaf__Group_5__2 : rule__Leaf__Group_5__2__Impl rule__Leaf__Group_5__3 ;
    public final void rule__Leaf__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2635:1: ( rule__Leaf__Group_5__2__Impl rule__Leaf__Group_5__3 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2636:2: rule__Leaf__Group_5__2__Impl rule__Leaf__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__2__Impl_in_rule__Leaf__Group_5__25182);
            rule__Leaf__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__3_in_rule__Leaf__Group_5__25185);
            rule__Leaf__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__2"


    // $ANTLR start "rule__Leaf__Group_5__2__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2643:1: rule__Leaf__Group_5__2__Impl : ( ( rule__Leaf__ReaderAssignment_5_2 ) ) ;
    public final void rule__Leaf__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2647:1: ( ( ( rule__Leaf__ReaderAssignment_5_2 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2648:1: ( ( rule__Leaf__ReaderAssignment_5_2 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2648:1: ( ( rule__Leaf__ReaderAssignment_5_2 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2649:1: ( rule__Leaf__ReaderAssignment_5_2 )
            {
             before(grammarAccess.getLeafAccess().getReaderAssignment_5_2()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2650:1: ( rule__Leaf__ReaderAssignment_5_2 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2650:2: rule__Leaf__ReaderAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__ReaderAssignment_5_2_in_rule__Leaf__Group_5__2__Impl5212);
            rule__Leaf__ReaderAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getReaderAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__2__Impl"


    // $ANTLR start "rule__Leaf__Group_5__3"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2660:1: rule__Leaf__Group_5__3 : rule__Leaf__Group_5__3__Impl rule__Leaf__Group_5__4 ;
    public final void rule__Leaf__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2664:1: ( rule__Leaf__Group_5__3__Impl rule__Leaf__Group_5__4 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2665:2: rule__Leaf__Group_5__3__Impl rule__Leaf__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__3__Impl_in_rule__Leaf__Group_5__35242);
            rule__Leaf__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__4_in_rule__Leaf__Group_5__35245);
            rule__Leaf__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__3"


    // $ANTLR start "rule__Leaf__Group_5__3__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2672:1: rule__Leaf__Group_5__3__Impl : ( ( rule__Leaf__Group_5_3__0 )* ) ;
    public final void rule__Leaf__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2676:1: ( ( ( rule__Leaf__Group_5_3__0 )* ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2677:1: ( ( rule__Leaf__Group_5_3__0 )* )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2677:1: ( ( rule__Leaf__Group_5_3__0 )* )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2678:1: ( rule__Leaf__Group_5_3__0 )*
            {
             before(grammarAccess.getLeafAccess().getGroup_5_3()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2679:1: ( rule__Leaf__Group_5_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2679:2: rule__Leaf__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5_3__0_in_rule__Leaf__Group_5__3__Impl5272);
            	    rule__Leaf__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLeafAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__3__Impl"


    // $ANTLR start "rule__Leaf__Group_5__4"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2689:1: rule__Leaf__Group_5__4 : rule__Leaf__Group_5__4__Impl ;
    public final void rule__Leaf__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2693:1: ( rule__Leaf__Group_5__4__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2694:2: rule__Leaf__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5__4__Impl_in_rule__Leaf__Group_5__45303);
            rule__Leaf__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__4"


    // $ANTLR start "rule__Leaf__Group_5__4__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2700:1: rule__Leaf__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Leaf__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2704:1: ( ( ')' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2705:1: ( ')' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2705:1: ( ')' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2706:1: ')'
            {
             before(grammarAccess.getLeafAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Leaf__Group_5__4__Impl5331); 
             after(grammarAccess.getLeafAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5__4__Impl"


    // $ANTLR start "rule__Leaf__Group_5_3__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2729:1: rule__Leaf__Group_5_3__0 : rule__Leaf__Group_5_3__0__Impl rule__Leaf__Group_5_3__1 ;
    public final void rule__Leaf__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2733:1: ( rule__Leaf__Group_5_3__0__Impl rule__Leaf__Group_5_3__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2734:2: rule__Leaf__Group_5_3__0__Impl rule__Leaf__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5_3__0__Impl_in_rule__Leaf__Group_5_3__05372);
            rule__Leaf__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5_3__1_in_rule__Leaf__Group_5_3__05375);
            rule__Leaf__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5_3__0"


    // $ANTLR start "rule__Leaf__Group_5_3__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2741:1: rule__Leaf__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Leaf__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2745:1: ( ( ',' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2746:1: ( ',' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2746:1: ( ',' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2747:1: ','
            {
             before(grammarAccess.getLeafAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Leaf__Group_5_3__0__Impl5403); 
             after(grammarAccess.getLeafAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5_3__0__Impl"


    // $ANTLR start "rule__Leaf__Group_5_3__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2760:1: rule__Leaf__Group_5_3__1 : rule__Leaf__Group_5_3__1__Impl ;
    public final void rule__Leaf__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2764:1: ( rule__Leaf__Group_5_3__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2765:2: rule__Leaf__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_5_3__1__Impl_in_rule__Leaf__Group_5_3__15434);
            rule__Leaf__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5_3__1"


    // $ANTLR start "rule__Leaf__Group_5_3__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2771:1: rule__Leaf__Group_5_3__1__Impl : ( ( rule__Leaf__ReaderAssignment_5_3_1 ) ) ;
    public final void rule__Leaf__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2775:1: ( ( ( rule__Leaf__ReaderAssignment_5_3_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2776:1: ( ( rule__Leaf__ReaderAssignment_5_3_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2776:1: ( ( rule__Leaf__ReaderAssignment_5_3_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2777:1: ( rule__Leaf__ReaderAssignment_5_3_1 )
            {
             before(grammarAccess.getLeafAccess().getReaderAssignment_5_3_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2778:1: ( rule__Leaf__ReaderAssignment_5_3_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2778:2: rule__Leaf__ReaderAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__ReaderAssignment_5_3_1_in_rule__Leaf__Group_5_3__1__Impl5461);
            rule__Leaf__ReaderAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getReaderAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_5_3__1__Impl"


    // $ANTLR start "rule__Leaf__Group_6__0"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2792:1: rule__Leaf__Group_6__0 : rule__Leaf__Group_6__0__Impl rule__Leaf__Group_6__1 ;
    public final void rule__Leaf__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2796:1: ( rule__Leaf__Group_6__0__Impl rule__Leaf__Group_6__1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2797:2: rule__Leaf__Group_6__0__Impl rule__Leaf__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_6__0__Impl_in_rule__Leaf__Group_6__05495);
            rule__Leaf__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_6__1_in_rule__Leaf__Group_6__05498);
            rule__Leaf__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_6__0"


    // $ANTLR start "rule__Leaf__Group_6__0__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2804:1: rule__Leaf__Group_6__0__Impl : ( 'writer' ) ;
    public final void rule__Leaf__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2808:1: ( ( 'writer' ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2809:1: ( 'writer' )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2809:1: ( 'writer' )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2810:1: 'writer'
            {
             before(grammarAccess.getLeafAccess().getWriterKeyword_6_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Leaf__Group_6__0__Impl5526); 
             after(grammarAccess.getLeafAccess().getWriterKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_6__0__Impl"


    // $ANTLR start "rule__Leaf__Group_6__1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2823:1: rule__Leaf__Group_6__1 : rule__Leaf__Group_6__1__Impl ;
    public final void rule__Leaf__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2827:1: ( rule__Leaf__Group_6__1__Impl )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2828:2: rule__Leaf__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__Group_6__1__Impl_in_rule__Leaf__Group_6__15557);
            rule__Leaf__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_6__1"


    // $ANTLR start "rule__Leaf__Group_6__1__Impl"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2834:1: rule__Leaf__Group_6__1__Impl : ( ( rule__Leaf__WriterAssignment_6_1 ) ) ;
    public final void rule__Leaf__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2838:1: ( ( ( rule__Leaf__WriterAssignment_6_1 ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2839:1: ( ( rule__Leaf__WriterAssignment_6_1 ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2839:1: ( ( rule__Leaf__WriterAssignment_6_1 ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2840:1: ( rule__Leaf__WriterAssignment_6_1 )
            {
             before(grammarAccess.getLeafAccess().getWriterAssignment_6_1()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2841:1: ( rule__Leaf__WriterAssignment_6_1 )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2841:2: rule__Leaf__WriterAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leaf__WriterAssignment_6_1_in_rule__Leaf__Group_6__1__Impl5584);
            rule__Leaf__WriterAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getWriterAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group_6__1__Impl"


    // $ANTLR start "rule__DEECoModel__ElementsAssignment_3_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2856:1: rule__DEECoModel__ElementsAssignment_3_2 : ( ruleAbstractElement ) ;
    public final void rule__DEECoModel__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2860:1: ( ( ruleAbstractElement ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2861:1: ( ruleAbstractElement )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2861:1: ( ruleAbstractElement )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2862:1: ruleAbstractElement
            {
             before(grammarAccess.getDEECoModelAccess().getElementsAbstractElementParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractElement_in_rule__DEECoModel__ElementsAssignment_3_25623);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDEECoModelAccess().getElementsAbstractElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__ElementsAssignment_3_2"


    // $ANTLR start "rule__DEECoModel__ElementsAssignment_3_3_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2871:1: rule__DEECoModel__ElementsAssignment_3_3_1 : ( ruleAbstractElement ) ;
    public final void rule__DEECoModel__ElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2875:1: ( ( ruleAbstractElement ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2876:1: ( ruleAbstractElement )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2876:1: ( ruleAbstractElement )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2877:1: ruleAbstractElement
            {
             before(grammarAccess.getDEECoModelAccess().getElementsAbstractElementParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractElement_in_rule__DEECoModel__ElementsAssignment_3_3_15654);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDEECoModelAccess().getElementsAbstractElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__ElementsAssignment_3_3_1"


    // $ANTLR start "rule__DEECoModel__KnowledgesAssignment_4_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2886:1: rule__DEECoModel__KnowledgesAssignment_4_2 : ( ruleAbstractKnowledge ) ;
    public final void rule__DEECoModel__KnowledgesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2890:1: ( ( ruleAbstractKnowledge ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2891:1: ( ruleAbstractKnowledge )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2891:1: ( ruleAbstractKnowledge )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2892:1: ruleAbstractKnowledge
            {
             before(grammarAccess.getDEECoModelAccess().getKnowledgesAbstractKnowledgeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractKnowledge_in_rule__DEECoModel__KnowledgesAssignment_4_25685);
            ruleAbstractKnowledge();

            state._fsp--;

             after(grammarAccess.getDEECoModelAccess().getKnowledgesAbstractKnowledgeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__KnowledgesAssignment_4_2"


    // $ANTLR start "rule__DEECoModel__KnowledgesAssignment_4_3_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2901:1: rule__DEECoModel__KnowledgesAssignment_4_3_1 : ( ruleAbstractKnowledge ) ;
    public final void rule__DEECoModel__KnowledgesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2905:1: ( ( ruleAbstractKnowledge ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2906:1: ( ruleAbstractKnowledge )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2906:1: ( ruleAbstractKnowledge )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2907:1: ruleAbstractKnowledge
            {
             before(grammarAccess.getDEECoModelAccess().getKnowledgesAbstractKnowledgeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractKnowledge_in_rule__DEECoModel__KnowledgesAssignment_4_3_15716);
            ruleAbstractKnowledge();

            state._fsp--;

             after(grammarAccess.getDEECoModelAccess().getKnowledgesAbstractKnowledgeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEECoModel__KnowledgesAssignment_4_3_1"


    // $ANTLR start "rule__Ensemble__NameAssignment_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2916:1: rule__Ensemble__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Ensemble__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2920:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2921:1: ( ruleEString )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2921:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2922:1: ruleEString
            {
             before(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ensemble__NameAssignment_25747);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__NameAssignment_2"


    // $ANTLR start "rule__Ensemble__PeriodAssignment_4_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2931:1: rule__Ensemble__PeriodAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Ensemble__PeriodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2935:1: ( ( ruleEInt ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2936:1: ( ruleEInt )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2936:1: ( ruleEInt )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2937:1: ruleEInt
            {
             before(grammarAccess.getEnsembleAccess().getPeriodEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Ensemble__PeriodAssignment_4_15778);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getPeriodEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__PeriodAssignment_4_1"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2946:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2950:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2951:1: ( ruleEString )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2951:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2952:1: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Process__NameAssignment_25809);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__PeriodAssignment_4_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2961:1: rule__Process__PeriodAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Process__PeriodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2965:1: ( ( ruleEInt ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2966:1: ( ruleEInt )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2966:1: ( ruleEInt )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2967:1: ruleEInt
            {
             before(grammarAccess.getProcessAccess().getPeriodEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Process__PeriodAssignment_4_15840);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getPeriodEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__PeriodAssignment_4_1"


    // $ANTLR start "rule__KnowledgeElement__NameAssignment_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2976:1: rule__KnowledgeElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__KnowledgeElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2980:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2981:1: ( ruleEString )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2981:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2982:1: ruleEString
            {
             before(grammarAccess.getKnowledgeElementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KnowledgeElement__NameAssignment_15871);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKnowledgeElementAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__NameAssignment_1"


    // $ANTLR start "rule__KnowledgeElement__ReaderAssignment_3_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2991:1: rule__KnowledgeElement__ReaderAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__KnowledgeElement__ReaderAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2995:1: ( ( ( ruleEString ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2996:1: ( ( ruleEString ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2996:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2997:1: ( ruleEString )
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementCrossReference_3_2_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2998:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:2999:1: ruleEString
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KnowledgeElement__ReaderAssignment_3_25906);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__ReaderAssignment_3_2"


    // $ANTLR start "rule__KnowledgeElement__ReaderAssignment_3_3_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3010:1: rule__KnowledgeElement__ReaderAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__KnowledgeElement__ReaderAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3014:1: ( ( ( ruleEString ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3015:1: ( ( ruleEString ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3015:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3016:1: ( ruleEString )
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementCrossReference_3_3_1_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3017:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3018:1: ruleEString
            {
             before(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KnowledgeElement__ReaderAssignment_3_3_15945);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getKnowledgeElementAccess().getReaderAbstractElementCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__ReaderAssignment_3_3_1"


    // $ANTLR start "rule__KnowledgeElement__ChildAssignment_6"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3029:1: rule__KnowledgeElement__ChildAssignment_6 : ( ruleKnowledgeNode ) ;
    public final void rule__KnowledgeElement__ChildAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3033:1: ( ( ruleKnowledgeNode ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3034:1: ( ruleKnowledgeNode )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3034:1: ( ruleKnowledgeNode )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3035:1: ruleKnowledgeNode
            {
             before(grammarAccess.getKnowledgeElementAccess().getChildKnowledgeNodeParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeNode_in_rule__KnowledgeElement__ChildAssignment_65980);
            ruleKnowledgeNode();

            state._fsp--;

             after(grammarAccess.getKnowledgeElementAccess().getChildKnowledgeNodeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__ChildAssignment_6"


    // $ANTLR start "rule__KnowledgeElement__ChildAssignment_7_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3044:1: rule__KnowledgeElement__ChildAssignment_7_1 : ( ruleKnowledgeNode ) ;
    public final void rule__KnowledgeElement__ChildAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3048:1: ( ( ruleKnowledgeNode ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3049:1: ( ruleKnowledgeNode )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3049:1: ( ruleKnowledgeNode )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3050:1: ruleKnowledgeNode
            {
             before(grammarAccess.getKnowledgeElementAccess().getChildKnowledgeNodeParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKnowledgeNode_in_rule__KnowledgeElement__ChildAssignment_7_16011);
            ruleKnowledgeNode();

            state._fsp--;

             after(grammarAccess.getKnowledgeElementAccess().getChildKnowledgeNodeParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeElement__ChildAssignment_7_1"


    // $ANTLR start "rule__Leaf__NameAssignment_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3059:1: rule__Leaf__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Leaf__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3063:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3064:1: ( ruleEString )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3064:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3065:1: ruleEString
            {
             before(grammarAccess.getLeafAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Leaf__NameAssignment_26042);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__NameAssignment_2"


    // $ANTLR start "rule__Leaf__TypeAssignment_4_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3074:1: rule__Leaf__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Leaf__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3078:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3079:1: ( ruleEString )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3079:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3080:1: ruleEString
            {
             before(grammarAccess.getLeafAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Leaf__TypeAssignment_4_16073);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafAccess().getTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__TypeAssignment_4_1"


    // $ANTLR start "rule__Leaf__ReaderAssignment_5_2"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3089:1: rule__Leaf__ReaderAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Leaf__ReaderAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3093:1: ( ( ( ruleEString ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3094:1: ( ( ruleEString ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3094:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3095:1: ( ruleEString )
            {
             before(grammarAccess.getLeafAccess().getReaderAbstractElementCrossReference_5_2_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3096:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3097:1: ruleEString
            {
             before(grammarAccess.getLeafAccess().getReaderAbstractElementEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Leaf__ReaderAssignment_5_26108);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafAccess().getReaderAbstractElementEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getLeafAccess().getReaderAbstractElementCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__ReaderAssignment_5_2"


    // $ANTLR start "rule__Leaf__ReaderAssignment_5_3_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3108:1: rule__Leaf__ReaderAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Leaf__ReaderAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3112:1: ( ( ( ruleEString ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3113:1: ( ( ruleEString ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3113:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3114:1: ( ruleEString )
            {
             before(grammarAccess.getLeafAccess().getReaderAbstractElementCrossReference_5_3_1_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3115:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3116:1: ruleEString
            {
             before(grammarAccess.getLeafAccess().getReaderAbstractElementEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Leaf__ReaderAssignment_5_3_16147);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafAccess().getReaderAbstractElementEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getLeafAccess().getReaderAbstractElementCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__ReaderAssignment_5_3_1"


    // $ANTLR start "rule__Leaf__WriterAssignment_6_1"
    // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3127:1: rule__Leaf__WriterAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Leaf__WriterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3131:1: ( ( ( ruleEString ) ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3132:1: ( ( ruleEString ) )
            {
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3132:1: ( ( ruleEString ) )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3133:1: ( ruleEString )
            {
             before(grammarAccess.getLeafAccess().getWriterAbstractElementCrossReference_6_1_0()); 
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3134:1: ( ruleEString )
            // ../knowledge.xtext.ui/src-gen/knowledge/xtext/ui/contentassist/antlr/internal/InternalKnowDEECo.g:3135:1: ruleEString
            {
             before(grammarAccess.getLeafAccess().getWriterAbstractElementEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Leaf__WriterAssignment_6_16186);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafAccess().getWriterAbstractElementEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLeafAccess().getWriterAbstractElementCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__WriterAssignment_6_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDEECoModel_in_entryRuleDEECoModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDEECoModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__0_in_ruleDEECoModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractKnowledge_in_entryRuleAbstractKnowledge181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractKnowledge188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractKnowledge__Alternatives_in_ruleAbstractKnowledge214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeNode_in_entryRuleKnowledgeNode241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKnowledgeNode248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeNode__Alternatives_in_ruleKnowledgeNode274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__0_in_ruleEnsemble454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeElement_in_entryRuleKnowledgeElement541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKnowledgeElement548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__0_in_ruleKnowledgeElement574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaf_in_entryRuleLeaf601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeaf608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__0_in_ruleLeaf634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_rule__AbstractElement__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_rule__AbstractElement__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeElement_in_rule__AbstractKnowledge__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaf_in_rule__AbstractKnowledge__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeElement_in_rule__KnowledgeNode__Alternatives768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaf_in_rule__KnowledgeNode__Alternatives785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__0__Impl_in_rule__DEECoModel__Group__0864 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__1_in_rule__DEECoModel__Group__0867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__1__Impl_in_rule__DEECoModel__Group__1925 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__2_in_rule__DEECoModel__Group__1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__DEECoModel__Group__1__Impl956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__2__Impl_in_rule__DEECoModel__Group__2987 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__3_in_rule__DEECoModel__Group__2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__DEECoModel__Group__2__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__3__Impl_in_rule__DEECoModel__Group__31049 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__4_in_rule__DEECoModel__Group__31052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__0_in_rule__DEECoModel__Group__3__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__4__Impl_in_rule__DEECoModel__Group__41110 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__5_in_rule__DEECoModel__Group__41113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__0_in_rule__DEECoModel__Group__4__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group__5__Impl_in_rule__DEECoModel__Group__51171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__DEECoModel__Group__5__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__0__Impl_in_rule__DEECoModel__Group_3__01242 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__1_in_rule__DEECoModel__Group_3__01245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__DEECoModel__Group_3__0__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__1__Impl_in_rule__DEECoModel__Group_3__11304 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__2_in_rule__DEECoModel__Group_3__11307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__DEECoModel__Group_3__1__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__2__Impl_in_rule__DEECoModel__Group_3__21366 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__3_in_rule__DEECoModel__Group_3__21369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__ElementsAssignment_3_2_in_rule__DEECoModel__Group_3__2__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__3__Impl_in_rule__DEECoModel__Group_3__31426 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__4_in_rule__DEECoModel__Group_3__31429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3_3__0_in_rule__DEECoModel__Group_3__3__Impl1456 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3__4__Impl_in_rule__DEECoModel__Group_3__41487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__DEECoModel__Group_3__4__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3_3__0__Impl_in_rule__DEECoModel__Group_3_3__01556 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3_3__1_in_rule__DEECoModel__Group_3_3__01559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__DEECoModel__Group_3_3__0__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_3_3__1__Impl_in_rule__DEECoModel__Group_3_3__11618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__ElementsAssignment_3_3_1_in_rule__DEECoModel__Group_3_3__1__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__0__Impl_in_rule__DEECoModel__Group_4__01679 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__1_in_rule__DEECoModel__Group_4__01682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DEECoModel__Group_4__0__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__1__Impl_in_rule__DEECoModel__Group_4__11741 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__2_in_rule__DEECoModel__Group_4__11744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__DEECoModel__Group_4__1__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__2__Impl_in_rule__DEECoModel__Group_4__21803 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__3_in_rule__DEECoModel__Group_4__21806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__KnowledgesAssignment_4_2_in_rule__DEECoModel__Group_4__2__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__3__Impl_in_rule__DEECoModel__Group_4__31863 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__4_in_rule__DEECoModel__Group_4__31866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4_3__0_in_rule__DEECoModel__Group_4__3__Impl1893 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4__4__Impl_in_rule__DEECoModel__Group_4__41924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__DEECoModel__Group_4__4__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4_3__0__Impl_in_rule__DEECoModel__Group_4_3__01993 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4_3__1_in_rule__DEECoModel__Group_4_3__01996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__DEECoModel__Group_4_3__0__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__Group_4_3__1__Impl_in_rule__DEECoModel__Group_4_3__12055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DEECoModel__KnowledgesAssignment_4_3_1_in_rule__DEECoModel__Group_4_3__1__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02116 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__EInt__Group__0__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__0__Impl_in_rule__Ensemble__Group__02241 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__1_in_rule__Ensemble__Group__02244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__1__Impl_in_rule__Ensemble__Group__12302 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__2_in_rule__Ensemble__Group__12305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ensemble__Group__1__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__2__Impl_in_rule__Ensemble__Group__22364 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__3_in_rule__Ensemble__Group__22367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__NameAssignment_2_in_rule__Ensemble__Group__2__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__3__Impl_in_rule__Ensemble__Group__32424 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__4_in_rule__Ensemble__Group__32427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Ensemble__Group__3__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__4__Impl_in_rule__Ensemble__Group__42486 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__5_in_rule__Ensemble__Group__42489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_4__0_in_rule__Ensemble__Group__4__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__5__Impl_in_rule__Ensemble__Group__52547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Ensemble__Group__5__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_4__0__Impl_in_rule__Ensemble__Group_4__02618 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_4__1_in_rule__Ensemble__Group_4__02621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ensemble__Group_4__0__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_4__1__Impl_in_rule__Ensemble__Group_4__12680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__PeriodAssignment_4_1_in_rule__Ensemble__Group_4__1__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__02741 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__02744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__12802 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__12805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Process__Group__1__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__22864 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__22867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__2__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__32924 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__32927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Process__Group__3__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__42986 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__42989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_4__0_in_rule__Process__Group__4__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__53047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Process__Group__5__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_4__0__Impl_in_rule__Process__Group_4__03118 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_rule__Process__Group_4__1_in_rule__Process__Group_4__03121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Process__Group_4__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_4__1__Impl_in_rule__Process__Group_4__13180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__PeriodAssignment_4_1_in_rule__Process__Group_4__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__0__Impl_in_rule__KnowledgeElement__Group__03241 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__1_in_rule__KnowledgeElement__Group__03244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__KnowledgeElement__Group__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__1__Impl_in_rule__KnowledgeElement__Group__13303 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__2_in_rule__KnowledgeElement__Group__13306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__NameAssignment_1_in_rule__KnowledgeElement__Group__1__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__2__Impl_in_rule__KnowledgeElement__Group__23363 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__3_in_rule__KnowledgeElement__Group__23366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KnowledgeElement__Group__2__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__3__Impl_in_rule__KnowledgeElement__Group__33425 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__4_in_rule__KnowledgeElement__Group__33428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__0_in_rule__KnowledgeElement__Group__3__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__4__Impl_in_rule__KnowledgeElement__Group__43486 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__5_in_rule__KnowledgeElement__Group__43489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__KnowledgeElement__Group__4__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__5__Impl_in_rule__KnowledgeElement__Group__53548 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__6_in_rule__KnowledgeElement__Group__53551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KnowledgeElement__Group__5__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__6__Impl_in_rule__KnowledgeElement__Group__63610 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__7_in_rule__KnowledgeElement__Group__63613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__ChildAssignment_6_in_rule__KnowledgeElement__Group__6__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__7__Impl_in_rule__KnowledgeElement__Group__73670 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__8_in_rule__KnowledgeElement__Group__73673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_7__0_in_rule__KnowledgeElement__Group__7__Impl3700 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__8__Impl_in_rule__KnowledgeElement__Group__83731 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__9_in_rule__KnowledgeElement__Group__83734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__KnowledgeElement__Group__8__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group__9__Impl_in_rule__KnowledgeElement__Group__93793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__KnowledgeElement__Group__9__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__0__Impl_in_rule__KnowledgeElement__Group_3__03872 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__1_in_rule__KnowledgeElement__Group_3__03875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__KnowledgeElement__Group_3__0__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__1__Impl_in_rule__KnowledgeElement__Group_3__13934 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__2_in_rule__KnowledgeElement__Group_3__13937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__KnowledgeElement__Group_3__1__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__2__Impl_in_rule__KnowledgeElement__Group_3__23996 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__3_in_rule__KnowledgeElement__Group_3__23999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__ReaderAssignment_3_2_in_rule__KnowledgeElement__Group_3__2__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__3__Impl_in_rule__KnowledgeElement__Group_3__34056 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__4_in_rule__KnowledgeElement__Group_3__34059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3_3__0_in_rule__KnowledgeElement__Group_3__3__Impl4086 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3__4__Impl_in_rule__KnowledgeElement__Group_3__44117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__KnowledgeElement__Group_3__4__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3_3__0__Impl_in_rule__KnowledgeElement__Group_3_3__04186 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3_3__1_in_rule__KnowledgeElement__Group_3_3__04189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KnowledgeElement__Group_3_3__0__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_3_3__1__Impl_in_rule__KnowledgeElement__Group_3_3__14248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__ReaderAssignment_3_3_1_in_rule__KnowledgeElement__Group_3_3__1__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_7__0__Impl_in_rule__KnowledgeElement__Group_7__04309 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_7__1_in_rule__KnowledgeElement__Group_7__04312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KnowledgeElement__Group_7__0__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__Group_7__1__Impl_in_rule__KnowledgeElement__Group_7__14371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KnowledgeElement__ChildAssignment_7_1_in_rule__KnowledgeElement__Group_7__1__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__0__Impl_in_rule__Leaf__Group__04432 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__Leaf__Group__1_in_rule__Leaf__Group__04435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__1__Impl_in_rule__Leaf__Group__14493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leaf__Group__2_in_rule__Leaf__Group__14496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Leaf__Group__1__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__2__Impl_in_rule__Leaf__Group__24555 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Leaf__Group__3_in_rule__Leaf__Group__24558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__NameAssignment_2_in_rule__Leaf__Group__2__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__3__Impl_in_rule__Leaf__Group__34615 = new BitSet(new long[]{0x0000000018802000L});
        public static final BitSet FOLLOW_rule__Leaf__Group__4_in_rule__Leaf__Group__34618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Leaf__Group__3__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__4__Impl_in_rule__Leaf__Group__44677 = new BitSet(new long[]{0x0000000018802000L});
        public static final BitSet FOLLOW_rule__Leaf__Group__5_in_rule__Leaf__Group__44680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_4__0_in_rule__Leaf__Group__4__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__5__Impl_in_rule__Leaf__Group__54738 = new BitSet(new long[]{0x0000000018802000L});
        public static final BitSet FOLLOW_rule__Leaf__Group__6_in_rule__Leaf__Group__54741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__0_in_rule__Leaf__Group__5__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__6__Impl_in_rule__Leaf__Group__64799 = new BitSet(new long[]{0x0000000018802000L});
        public static final BitSet FOLLOW_rule__Leaf__Group__7_in_rule__Leaf__Group__64802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_6__0_in_rule__Leaf__Group__6__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group__7__Impl_in_rule__Leaf__Group__74860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Leaf__Group__7__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_4__0__Impl_in_rule__Leaf__Group_4__04935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leaf__Group_4__1_in_rule__Leaf__Group_4__04938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Leaf__Group_4__0__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_4__1__Impl_in_rule__Leaf__Group_4__14997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__TypeAssignment_4_1_in_rule__Leaf__Group_4__1__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__0__Impl_in_rule__Leaf__Group_5__05058 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__1_in_rule__Leaf__Group_5__05061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Leaf__Group_5__0__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__1__Impl_in_rule__Leaf__Group_5__15120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__2_in_rule__Leaf__Group_5__15123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Leaf__Group_5__1__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__2__Impl_in_rule__Leaf__Group_5__25182 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__3_in_rule__Leaf__Group_5__25185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__ReaderAssignment_5_2_in_rule__Leaf__Group_5__2__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__3__Impl_in_rule__Leaf__Group_5__35242 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__4_in_rule__Leaf__Group_5__35245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5_3__0_in_rule__Leaf__Group_5__3__Impl5272 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5__4__Impl_in_rule__Leaf__Group_5__45303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Leaf__Group_5__4__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5_3__0__Impl_in_rule__Leaf__Group_5_3__05372 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5_3__1_in_rule__Leaf__Group_5_3__05375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Leaf__Group_5_3__0__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_5_3__1__Impl_in_rule__Leaf__Group_5_3__15434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__ReaderAssignment_5_3_1_in_rule__Leaf__Group_5_3__1__Impl5461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_6__0__Impl_in_rule__Leaf__Group_6__05495 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leaf__Group_6__1_in_rule__Leaf__Group_6__05498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Leaf__Group_6__0__Impl5526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__Group_6__1__Impl_in_rule__Leaf__Group_6__15557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leaf__WriterAssignment_6_1_in_rule__Leaf__Group_6__1__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DEECoModel__ElementsAssignment_3_25623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DEECoModel__ElementsAssignment_3_3_15654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractKnowledge_in_rule__DEECoModel__KnowledgesAssignment_4_25685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractKnowledge_in_rule__DEECoModel__KnowledgesAssignment_4_3_15716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ensemble__NameAssignment_25747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Ensemble__PeriodAssignment_4_15778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Process__NameAssignment_25809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Process__PeriodAssignment_4_15840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KnowledgeElement__NameAssignment_15871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KnowledgeElement__ReaderAssignment_3_25906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KnowledgeElement__ReaderAssignment_3_3_15945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeNode_in_rule__KnowledgeElement__ChildAssignment_65980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKnowledgeNode_in_rule__KnowledgeElement__ChildAssignment_7_16011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Leaf__NameAssignment_26042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Leaf__TypeAssignment_4_16073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Leaf__ReaderAssignment_5_26108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Leaf__ReaderAssignment_5_3_16147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Leaf__WriterAssignment_6_16186 = new BitSet(new long[]{0x0000000000000002L});
    }


}