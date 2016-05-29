/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAANutation {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAANutation(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAANutation obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAANutation(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double NutationInLongitude(double JD) {
        return AAJNI.CAANutation_NutationInLongitude(JD);
    }

    public static double NutationInObliquity(double JD) {
        return AAJNI.CAANutation_NutationInObliquity(JD);
    }

    public static double NutationInRightAscension(double Alpha, double Delta, double Obliquity, double NutationInLongitude, double NutationInObliquity) {
        return AAJNI.CAANutation_NutationInRightAscension(Alpha, Delta, Obliquity, NutationInLongitude, NutationInObliquity);
    }

    public static double NutationInDeclination(double Alpha, double Obliquity, double NutationInLongitude, double NutationInObliquity) {
        return AAJNI.CAANutation_NutationInDeclination(Alpha, Obliquity, NutationInLongitude, NutationInObliquity);
    }

    public static double MeanObliquityOfEcliptic(double JD) {
        return AAJNI.CAANutation_MeanObliquityOfEcliptic(JD);
    }

    public static double TrueObliquityOfEcliptic(double JD) {
        return AAJNI.CAANutation_TrueObliquityOfEcliptic(JD);
    }

    public CAANutation() {
        this(AAJNI.new_CAANutation(), true);
    }

}