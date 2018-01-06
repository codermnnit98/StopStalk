/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJAY KRISHAN PANDEY
 */
public class Submissionss {
    
    String id,score,memory,language,time,flag;
    Submissionss(){
        id=score=memory=language=time="";
    }
    
    public void print()
    {
        System.out.println(id+" "+score+" "+memory+" "+language+" "+time);
    }
}
