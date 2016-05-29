/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAJupiter {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAAJupiter(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAJupiter obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAJupiter(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double EclipticLongitude(double JD) {
        return AAJNI.CAAJupiter_EclipticLongitude(JD);
    }

    public static double EclipticLatitude(double JD) {
        return AAJNI.CAAJupiter_EclipticLatitude(JD);
    }

    public static double RadiusVector(double JD) {
        return AAJNI.CAAJupiter_RadiusVector(JD);
    }

    public CAAJupiter() {
        this(AAJNI.new_CAAJupiter(), true);
    }

}
