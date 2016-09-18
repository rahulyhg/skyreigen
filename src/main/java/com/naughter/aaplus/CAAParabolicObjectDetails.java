/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAParabolicObjectDetails {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CAAParabolicObjectDetails(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CAAParabolicObjectDetails obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AAJNI.delete_CAAParabolicObjectDetails(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CAAParabolicObjectDetails() {
    this(AAJNI.new_CAAParabolicObjectDetails(), true);
  }

  public void setHeliocentricRectangularEquatorial(CAA3DCoordinate value) {
    AAJNI.CAAParabolicObjectDetails_HeliocentricRectangularEquatorial_set(swigCPtr, this, CAA3DCoordinate.getCPtr(value), value);
  }

  public CAA3DCoordinate getHeliocentricRectangularEquatorial() {
    long cPtr = AAJNI.CAAParabolicObjectDetails_HeliocentricRectangularEquatorial_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CAA3DCoordinate(cPtr, false);
  }

  public void setHeliocentricRectangularEcliptical(CAA3DCoordinate value) {
    AAJNI.CAAParabolicObjectDetails_HeliocentricRectangularEcliptical_set(swigCPtr, this, CAA3DCoordinate.getCPtr(value), value);
  }

  public CAA3DCoordinate getHeliocentricRectangularEcliptical() {
    long cPtr = AAJNI.CAAParabolicObjectDetails_HeliocentricRectangularEcliptical_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CAA3DCoordinate(cPtr, false);
  }

  public void setHeliocentricEclipticLongitude(double value) {
    AAJNI.CAAParabolicObjectDetails_HeliocentricEclipticLongitude_set(swigCPtr, this, value);
  }

  public double getHeliocentricEclipticLongitude() {
    return AAJNI.CAAParabolicObjectDetails_HeliocentricEclipticLongitude_get(swigCPtr, this);
  }

  public void setHeliocentricEclipticLatitude(double value) {
    AAJNI.CAAParabolicObjectDetails_HeliocentricEclipticLatitude_set(swigCPtr, this, value);
  }

  public double getHeliocentricEclipticLatitude() {
    return AAJNI.CAAParabolicObjectDetails_HeliocentricEclipticLatitude_get(swigCPtr, this);
  }

  public void setTrueGeocentricRA(double value) {
    AAJNI.CAAParabolicObjectDetails_TrueGeocentricRA_set(swigCPtr, this, value);
  }

  public double getTrueGeocentricRA() {
    return AAJNI.CAAParabolicObjectDetails_TrueGeocentricRA_get(swigCPtr, this);
  }

  public void setTrueGeocentricDeclination(double value) {
    AAJNI.CAAParabolicObjectDetails_TrueGeocentricDeclination_set(swigCPtr, this, value);
  }

  public double getTrueGeocentricDeclination() {
    return AAJNI.CAAParabolicObjectDetails_TrueGeocentricDeclination_get(swigCPtr, this);
  }

  public void setTrueGeocentricDistance(double value) {
    AAJNI.CAAParabolicObjectDetails_TrueGeocentricDistance_set(swigCPtr, this, value);
  }

  public double getTrueGeocentricDistance() {
    return AAJNI.CAAParabolicObjectDetails_TrueGeocentricDistance_get(swigCPtr, this);
  }

  public void setTrueGeocentricLightTime(double value) {
    AAJNI.CAAParabolicObjectDetails_TrueGeocentricLightTime_set(swigCPtr, this, value);
  }

  public double getTrueGeocentricLightTime() {
    return AAJNI.CAAParabolicObjectDetails_TrueGeocentricLightTime_get(swigCPtr, this);
  }

  public void setAstrometricGeocenticRA(double value) {
    AAJNI.CAAParabolicObjectDetails_AstrometricGeocenticRA_set(swigCPtr, this, value);
  }

  public double getAstrometricGeocenticRA() {
    return AAJNI.CAAParabolicObjectDetails_AstrometricGeocenticRA_get(swigCPtr, this);
  }

  public void setAstrometricGeocentricDeclination(double value) {
    AAJNI.CAAParabolicObjectDetails_AstrometricGeocentricDeclination_set(swigCPtr, this, value);
  }

  public double getAstrometricGeocentricDeclination() {
    return AAJNI.CAAParabolicObjectDetails_AstrometricGeocentricDeclination_get(swigCPtr, this);
  }

  public void setAstrometricGeocentricDistance(double value) {
    AAJNI.CAAParabolicObjectDetails_AstrometricGeocentricDistance_set(swigCPtr, this, value);
  }

  public double getAstrometricGeocentricDistance() {
    return AAJNI.CAAParabolicObjectDetails_AstrometricGeocentricDistance_get(swigCPtr, this);
  }

  public void setAstrometricGeocentricLightTime(double value) {
    AAJNI.CAAParabolicObjectDetails_AstrometricGeocentricLightTime_set(swigCPtr, this, value);
  }

  public double getAstrometricGeocentricLightTime() {
    return AAJNI.CAAParabolicObjectDetails_AstrometricGeocentricLightTime_get(swigCPtr, this);
  }

  public void setElongation(double value) {
    AAJNI.CAAParabolicObjectDetails_Elongation_set(swigCPtr, this, value);
  }

  public double getElongation() {
    return AAJNI.CAAParabolicObjectDetails_Elongation_get(swigCPtr, this);
  }

  public void setPhaseAngle(double value) {
    AAJNI.CAAParabolicObjectDetails_PhaseAngle_set(swigCPtr, this, value);
  }

  public double getPhaseAngle() {
    return AAJNI.CAAParabolicObjectDetails_PhaseAngle_get(swigCPtr, this);
  }

}
