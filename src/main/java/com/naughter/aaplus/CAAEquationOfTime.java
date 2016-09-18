/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAEquationOfTime {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CAAEquationOfTime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CAAEquationOfTime obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AAJNI.delete_CAAEquationOfTime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static double Calculate(double JD, boolean bHighPrecision) {
    return AAJNI.CAAEquationOfTime_Calculate(JD, bHighPrecision);
  }

  public CAAEquationOfTime() {
    this(AAJNI.new_CAAEquationOfTime(), true);
  }

}
