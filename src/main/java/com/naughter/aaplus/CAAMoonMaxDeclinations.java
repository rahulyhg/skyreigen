/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAMoonMaxDeclinations {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;

    protected CAAMoonMaxDeclinations(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAMoonMaxDeclinations obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAMoonMaxDeclinations(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double K(double Year) {
        return AAJNI.CAAMoonMaxDeclinations_K(Year);
    }

    public static double MeanGreatestDeclination(double k, boolean bNortherly) {
        return AAJNI.CAAMoonMaxDeclinations_MeanGreatestDeclination(k, bNortherly);
    }

    public static double MeanGreatestDeclinationValue(double k) {
        return AAJNI.CAAMoonMaxDeclinations_MeanGreatestDeclinationValue(k);
    }

    public static double TrueGreatestDeclination(double k, boolean bNortherly) {
        return AAJNI.CAAMoonMaxDeclinations_TrueGreatestDeclination(k, bNortherly);
    }

    public static double TrueGreatestDeclinationValue(double k, boolean bNortherly) {
        return AAJNI.CAAMoonMaxDeclinations_TrueGreatestDeclinationValue(k, bNortherly);
    }

    public CAAMoonMaxDeclinations() {
        this(AAJNI.new_CAAMoonMaxDeclinations(), true);
    }

}
