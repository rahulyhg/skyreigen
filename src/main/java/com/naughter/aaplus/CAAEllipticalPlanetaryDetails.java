/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAEllipticalPlanetaryDetails {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAAEllipticalPlanetaryDetails(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAEllipticalPlanetaryDetails obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAEllipticalPlanetaryDetails(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public CAAEllipticalPlanetaryDetails() {
        this(AAJNI.new_CAAEllipticalPlanetaryDetails(), true);
    }

    public void setApparentGeocentricLongitude(double value) {
        AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricLongitude_set(swigCPtr, this, value);
    }

    public double getApparentGeocentricLongitude() {
        return AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricLongitude_get(swigCPtr, this);
    }

    public void setApparentGeocentricLatitude(double value) {
        AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricLatitude_set(swigCPtr, this, value);
    }

    public double getApparentGeocentricLatitude() {
        return AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricLatitude_get(swigCPtr, this);
    }

    public void setApparentGeocentricDistance(double value) {
        AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricDistance_set(swigCPtr, this, value);
    }

    public double getApparentGeocentricDistance() {
        return AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricDistance_get(swigCPtr, this);
    }

    public void setApparentLightTime(double value) {
        AAJNI.CAAEllipticalPlanetaryDetails_ApparentLightTime_set(swigCPtr, this, value);
    }

    public double getApparentLightTime() {
        return AAJNI.CAAEllipticalPlanetaryDetails_ApparentLightTime_get(swigCPtr, this);
    }

    public void setApparentGeocentricRA(double value) {
        AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricRA_set(swigCPtr, this, value);
    }

    public double getApparentGeocentricRA() {
        return AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricRA_get(swigCPtr, this);
    }

    public void setApparentGeocentricDeclination(double value) {
        AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricDeclination_set(swigCPtr, this, value);
    }

    public double getApparentGeocentricDeclination() {
        return AAJNI.CAAEllipticalPlanetaryDetails_ApparentGeocentricDeclination_get(swigCPtr, this);
    }

}
