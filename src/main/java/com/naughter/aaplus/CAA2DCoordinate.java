/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAA2DCoordinate {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAA2DCoordinate(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAA2DCoordinate obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAA2DCoordinate(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public CAA2DCoordinate() {
        this(AAJNI.new_CAA2DCoordinate(), true);
    }

    public void setX(double value) {
        AAJNI.CAA2DCoordinate_X_set(swigCPtr, this, value);
    }

    public double getX() {
        return AAJNI.CAA2DCoordinate_X_get(swigCPtr, this);
    }

    public void setY(double value) {
        AAJNI.CAA2DCoordinate_Y_set(swigCPtr, this, value);
    }

    public double getY() {
        return AAJNI.CAA2DCoordinate_Y_get(swigCPtr, this);
    }

}
