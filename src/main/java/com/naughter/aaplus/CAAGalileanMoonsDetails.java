/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAGalileanMoonsDetails {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;

    protected CAAGalileanMoonsDetails(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAGalileanMoonsDetails obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAGalileanMoonsDetails(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public void setSatellite1(CAAGalileanMoonDetail value) {
        AAJNI.CAAGalileanMoonsDetails_Satellite1_set(swigCPtr, this, CAAGalileanMoonDetail.getCPtr(value), value);
    }

    public CAAGalileanMoonDetail getSatellite1() {
        long cPtr = AAJNI.CAAGalileanMoonsDetails_Satellite1_get(swigCPtr, this);
        return (cPtr == 0) ? null : new CAAGalileanMoonDetail(cPtr, false);
    }

    public void setSatellite2(CAAGalileanMoonDetail value) {
        AAJNI.CAAGalileanMoonsDetails_Satellite2_set(swigCPtr, this, CAAGalileanMoonDetail.getCPtr(value), value);
    }

    public CAAGalileanMoonDetail getSatellite2() {
        long cPtr = AAJNI.CAAGalileanMoonsDetails_Satellite2_get(swigCPtr, this);
        return (cPtr == 0) ? null : new CAAGalileanMoonDetail(cPtr, false);
    }

    public void setSatellite3(CAAGalileanMoonDetail value) {
        AAJNI.CAAGalileanMoonsDetails_Satellite3_set(swigCPtr, this, CAAGalileanMoonDetail.getCPtr(value), value);
    }

    public CAAGalileanMoonDetail getSatellite3() {
        long cPtr = AAJNI.CAAGalileanMoonsDetails_Satellite3_get(swigCPtr, this);
        return (cPtr == 0) ? null : new CAAGalileanMoonDetail(cPtr, false);
    }

    public void setSatellite4(CAAGalileanMoonDetail value) {
        AAJNI.CAAGalileanMoonsDetails_Satellite4_set(swigCPtr, this, CAAGalileanMoonDetail.getCPtr(value), value);
    }

    public CAAGalileanMoonDetail getSatellite4() {
        long cPtr = AAJNI.CAAGalileanMoonsDetails_Satellite4_get(swigCPtr, this);
        return (cPtr == 0) ? null : new CAAGalileanMoonDetail(cPtr, false);
    }

    public CAAGalileanMoonsDetails() {
        this(AAJNI.new_CAAGalileanMoonsDetails(), true);
    }

}
