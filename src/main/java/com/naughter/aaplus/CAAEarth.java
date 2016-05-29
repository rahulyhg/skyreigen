/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAEarth {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAAEarth(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAEarth obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAEarth(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double EclipticLongitude(double JD) {
        return AAJNI.CAAEarth_EclipticLongitude(JD);
    }

    public static double EclipticLatitude(double JD) {
        return AAJNI.CAAEarth_EclipticLatitude(JD);
    }

    public static double RadiusVector(double JD) {
        return AAJNI.CAAEarth_RadiusVector(JD);
    }

    public static double SunMeanAnomaly(double JD) {
        return AAJNI.CAAEarth_SunMeanAnomaly(JD);
    }

    public static double Eccentricity(double JD) {
        return AAJNI.CAAEarth_Eccentricity(JD);
    }

    public static double EclipticLongitudeJ2000(double JD) {
        return AAJNI.CAAEarth_EclipticLongitudeJ2000(JD);
    }

    public static double EclipticLatitudeJ2000(double JD) {
        return AAJNI.CAAEarth_EclipticLatitudeJ2000(JD);
    }

    public CAAEarth() {
        this(AAJNI.new_CAAEarth(), true);
    }

}
