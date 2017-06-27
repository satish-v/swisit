package com.stackroute.swisit.intentparser.service;

/*------Importing Liberaries-------*/
import com.stackroute.swisit.intentparser.domain.Intent;
import com.stackroute.swisit.intentparser.domain.Term;

import java.util.List;
import java.util.Map;

/*---------IntentParserService Interface Class---------*/
public interface IntentParserService {

    /*-------Methods to Interact with Neo4j Database------*/
    List<Intent> getAllIntents();
    List<Term> getAllTerms();
    Iterable<Map<String,Object>> getAllIndicator();
    Iterable<Map<String,Object>> getBothRelationships();
    Iterable<Map<String,Object>> getAllRelationships();
    Iterable<Map<String,String>> getAllTermsRelationOfIntent(String intentName);
}
