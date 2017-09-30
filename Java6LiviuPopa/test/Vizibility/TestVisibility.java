/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vizibility;

import Vizibility.packageOne.Beta;
import Vizibility.packageOne.Alpha;
import Vizibility.packageTwo.Gamma;

/**
 *
 * @author Emi
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alpha alphaObject = new Alpha ();
        Beta betaObject = new Beta ();
        Gamma gammaObject = new Gamma ();
        
        System.out.println("TestVisibility Alpha class: public var:"+alphaObject.publicVarA);
        //System.out.println("TestVisibility Alpha class: protected var:"+alphaObject.protectedVarA);
        //System.out.println("TestVisibility Alpha class: private var:"+alphaObject.privateVarA);
        //System.out.println("TestVisibility Alpha class: package var:"+alphaObject.packageVarA);
        
        System.out.println("TestVisibility Alpha class: public method:");
        alphaObject.testInternVariables();
        System.out.println("TestVisibility Beta class: public method:");
        betaObject.testInheritedVariables();
        System.out.println("TestVisibility calls gammaObject.testInternVariables");
        gammaObject.publicVarG();
        gammaObject.testInheritedVariables();
        gammaObject.testInternVariables();
    }
    
}