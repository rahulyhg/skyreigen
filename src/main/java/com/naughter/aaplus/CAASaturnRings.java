/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAASaturnRings {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAASaturnRings(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAASaturnRings obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAASaturnRings(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static CAASaturnRingDetails Calculate(double JD) {
        return new CAASaturnRingDetails(AAJNI.CAASaturnRings_Calculate(JD), true);
    }

    public CAASaturnRings() {
        this(AAJNI.new_CAASaturnRings(), true);
    }

}