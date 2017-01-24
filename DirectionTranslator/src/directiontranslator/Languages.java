/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directiontranslator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Takashi
 */
public class Languages {

    private static Map<String, String> languageCodes;

    Languages(){
        languageCodes = new HashMap<String, String>();
        this.populate();
    }
    
    public String getCode(String friendlyName){
        return languageCodes.get(friendlyName);
    }
    
    public String[] getAllLangCodes(){
        System.out.println(languageCodes.keySet().toArray());
        return (String[]) languageCodes.keySet().toArray();
    }
    
    private void populate(){
        languageCodes.put("Afrikaans", "af");
        languageCodes.put("Arabic", "ar");
        languageCodes.put("Bosnian (Latin)", "bs-Latn");
        languageCodes.put("Bulgarian", "bg");
        languageCodes.put("Catalan", "ca");
        languageCodes.put("Chinese Simplified", "zh-CHS");
        languageCodes.put("Chinese Traditional", "zh-CHT");
        languageCodes.put("Croatian", "hr");
        languageCodes.put("Czech", "cs");
        languageCodes.put("Danish", "da");
        languageCodes.put("Dutch", "nl");
        languageCodes.put("English", "en");
        languageCodes.put("Estonian", "et");
        languageCodes.put("Finnish", "fi");
        languageCodes.put("French", "fr");
        languageCodes.put("German", "de");
        languageCodes.put("Greek", "el");
        languageCodes.put("Haitian Creole", "ht");
        languageCodes.put("Hebrew", "he");
        languageCodes.put("Hindi", "hi");
        languageCodes.put("Hmong Daw", "mww");
        languageCodes.put("Hungarian", "hu");
        languageCodes.put("Indonesian", "id");
        languageCodes.put("Italian", "it");
        languageCodes.put("Japanese", "ja");
        languageCodes.put("Kiswahili", "sw");
    }
}
