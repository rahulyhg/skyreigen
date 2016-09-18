/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAMoon {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CAAMoon(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CAAMoon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AAJNI.delete_CAAMoon(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static double MeanLongitude(double JD) {
    return AAJNI.CAAMoon_MeanLongitude(JD);
  }

  public static double MeanElongation(double JD) {
    return AAJNI.CAAMoon_MeanElongation(JD);
  }

  public static double MeanAnomaly(double JD) {
    return AAJNI.CAAMoon_MeanAnomaly(JD);
  }

  public static double ArgumentOfLatitude(double JD) {
    return AAJNI.CAAMoon_ArgumentOfLatitude(JD);
  }

  public static double MeanLongitudeAscendingNode(double JD) {
    return AAJNI.CAAMoon_MeanLongitudeAscendingNode(JD);
  }

  public static double MeanLongitudePerigee(double JD) {
    return AAJNI.CAAMoon_MeanLongitudePerigee(JD);
  }

  public static double TrueLongitudeAscendingNode(double JD) {
    return AAJNI.CAAMoon_TrueLongitudeAscendingNode(JD);
  }

  public static double EclipticLongitude(double JD) {
    return AAJNI.CAAMoon_EclipticLongitude(JD);
  }

  public static double EclipticLatitude(double JD) {
    return AAJNI.CAAMoon_EclipticLatitude(JD);
  }

  public static double RadiusVector(double JD) {
    return AAJNI.CAAMoon_RadiusVector(JD);
  }

  public static double RadiusVectorToHorizontalParallax(double RadiusVector) {
    return AAJNI.CAAMoon_RadiusVectorToHorizontalParallax(RadiusVector);
  }

  public static double HorizontalParallaxToRadiusVector(double Parallax) {
    return AAJNI.CAAMoon_HorizontalParallaxToRadiusVector(Parallax);
  }

  public CAAMoon() {
    this(AAJNI.new_CAAMoon(), true);
  }

}
