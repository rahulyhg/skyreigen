/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAInterpolate {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;

    protected CAAInterpolate(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAInterpolate obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAInterpolate(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double Interpolate(double n, double Y1, double Y2, double Y3) {
        return AAJNI.CAAInterpolate_Interpolate__SWIG_0(n, Y1, Y2, Y3);
    }

    public static double Interpolate(double n, double Y1, double Y2, double Y3, double Y4, double Y5) {
        return AAJNI.CAAInterpolate_Interpolate__SWIG_1(n, Y1, Y2, Y3, Y4, Y5);
    }

    public static double InterpolateToHalves(double Y1, double Y2, double Y3, double Y4) {
        return AAJNI.CAAInterpolate_InterpolateToHalves(Y1, Y2, Y3, Y4);
    }

    public static double LagrangeInterpolate(double X, int n, SWIGTYPE_p_double pX, SWIGTYPE_p_double pY) {
        return AAJNI.CAAInterpolate_LagrangeInterpolate(X, n, SWIGTYPE_p_double.getCPtr(pX), SWIGTYPE_p_double.getCPtr(pY));
    }

    public static double Extremum(double Y1, double Y2, double Y3, SWIGTYPE_p_double nm) {
        return AAJNI.CAAInterpolate_Extremum__SWIG_0(Y1, Y2, Y3, SWIGTYPE_p_double.getCPtr(nm));
    }

    public static double Extremum(double Y1, double Y2, double Y3, double Y4, double Y5, SWIGTYPE_p_double nm) {
        return AAJNI.CAAInterpolate_Extremum__SWIG_1(Y1, Y2, Y3, Y4, Y5, SWIGTYPE_p_double.getCPtr(nm));
    }

    public static double Zero(double Y1, double Y2, double Y3) {
        return AAJNI.CAAInterpolate_Zero__SWIG_0(Y1, Y2, Y3);
    }

    public static double Zero(double Y1, double Y2, double Y3, double Y4, double Y5) {
        return AAJNI.CAAInterpolate_Zero__SWIG_1(Y1, Y2, Y3, Y4, Y5);
    }

    public static double Zero2(double Y1, double Y2, double Y3) {
        return AAJNI.CAAInterpolate_Zero2__SWIG_0(Y1, Y2, Y3);
    }

    public static double Zero2(double Y1, double Y2, double Y3, double Y4, double Y5) {
        return AAJNI.CAAInterpolate_Zero2__SWIG_1(Y1, Y2, Y3, Y4, Y5);
    }

    public CAAInterpolate() {
        this(AAJNI.new_CAAInterpolate(), true);
    }

}
