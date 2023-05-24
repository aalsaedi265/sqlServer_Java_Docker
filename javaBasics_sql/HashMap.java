package javaBasics_sql;
import java.util.HashMap;

class HashMap{
    public static void main(String[] args){

        HashMap<String,Integer> examScores = new HashMap<String, Integer>();

        examScores.getOrDegault("outbak",54);

        examScores.clear();

        examScores.put("SexEd",79);
        examScores.put("Soci/Pysco", 86);
        examScores.put("math", 100);

        examScores.remove("outbak"); 
        examScores.putIfAbsent("someClass",43);
        
        
        examScores.replace("someClass",69);
        examScores.containKey("comeClass");
        examScores.containValue(100);

        examScores.forEach((sub,sco)->{
            examScores.replace(sub,sco+7);
        });
    }
}