/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAASaturnMoons {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAASaturnMoons(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAASaturnMoons obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAASaturnMoons(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static CAASaturnMoonsDetails Calculate(double JD) {
        return new CAASaturnMoonsDetails(AAJNI.CAASaturnMoons_Calculate(JD), true);
    }

    public CAASaturnMoons() {
        this(AAJNI.new_CAASaturnMoons(), true);
    }

}