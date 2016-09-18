/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAANearParabolic {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CAANearParabolic(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CAANearParabolic obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AAJNI.delete_CAANearParabolic(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static CAANearParabolicObjectDetails Calculate(double JD, CAANearParabolicObjectElements elements, boolean bHighPrecision) {
    return new CAANearParabolicObjectDetails(AAJNI.CAANearParabolic_Calculate(JD, CAANearParabolicObjectElements.getCPtr(elements), elements, bHighPrecision), true);
  }

  public static double cbrt(double x) {
    return AAJNI.CAANearParabolic_cbrt(x);
  }

  public static void CalulateTrueAnnomalyAndRadius(double JD, CAANearParabolicObjectElements elements, SWIGTYPE_p_double v, SWIGTYPE_p_double r) {
    AAJNI.CAANearParabolic_CalulateTrueAnnomalyAndRadius(JD, CAANearParabolicObjectElements.getCPtr(elements), elements, SWIGTYPE_p_double.getCPtr(v), SWIGTYPE_p_double.getCPtr(r));
  }

  public CAANearParabolic() {
    this(AAJNI.new_CAANearParabolic(), true);
  }

}
